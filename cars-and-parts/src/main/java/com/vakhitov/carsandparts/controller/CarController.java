package com.vakhitov.carsandparts.controller;

import com.vakhitov.carsandparts.model.Car;
import com.vakhitov.carsandparts.service.CarGRPCServiceImpl;
import com.vakhitov.carsandparts.service.CarService;
//import com.vakhitov.service.CarGRPCServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Operation(summary= "Get cars list", description = "Get cars list")
    @GetMapping("/list")
    public List<Car> getCarsList() {
        return carService.getCarsList();
    }

    @Operation(summary= "Add new car", description = "Add new car")
    @PostMapping
    public ResponseEntity<Car> addCar(String vin, String registrationNumber) {
        Car car = carService.addNewCar(vin, registrationNumber);
        return ResponseEntity.status(HttpStatus.CREATED).body(car);
    }
}



