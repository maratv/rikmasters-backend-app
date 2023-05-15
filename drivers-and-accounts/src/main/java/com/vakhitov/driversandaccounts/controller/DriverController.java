package com.vakhitov.driversandaccounts.controller;

import com.vakhitov.driversandaccounts.model.Category;
import com.vakhitov.driversandaccounts.model.Driver;
import com.vakhitov.driversandaccounts.service.DriverService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService driverService;

    @Operation(summary= "Get drivers list", description = "Get drivers list")
    @GetMapping("/list")
    public List<Driver> getDriversList() {
        return driverService.getDriversList();
    }

    @Operation(summary= "Add new driver", description = "Add new driver")
    @PostMapping
    public ResponseEntity<Driver> addDriver(String fullName, String passport, Category cat) {
        Driver driver = driverService.saveNewDriver(fullName, passport, cat);
        return ResponseEntity.status(HttpStatus.CREATED).body(driver);
    }

    @Operation(summary= "Assign drivers car", description = "Assign drivers car")
    @PostMapping("/{passport}")
    public ResponseEntity<Driver> assignDriversCar(@PathVariable("passport") String passport, String vin) {
        Driver driver = driverService.assignCar(passport, vin);
        return ResponseEntity.status(HttpStatus.CREATED).body(driver);
    }
}
