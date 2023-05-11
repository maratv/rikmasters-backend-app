package com.vakhitov.carsandparts.controller;

import com.vakhitov.carsandparts.model.Car;
import com.vakhitov.carsandparts.service.CAPGrpcClientService;
import com.vakhitov.carsandparts.service.CarService;
import com.vakhitov.carsandparts.service.FoobarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CarController {

    private final CarService carService;
    private final CAPGrpcClientService capGrpcClientService;
    private final FoobarService foobarService;

    @GetMapping("/list")
    public List<Car> getCarsList() {
        return carService.getCarsList();
    }

    @GetMapping("/test")
    public String test() {
        return "testik";
    }

    @GetMapping("/test2")
    public void test2() {

        capGrpcClientService.sendMessage();
    }


    @GetMapping("/test3")
    public void test3() {

        foobarService.receiveHello("helllllo");
    }


    @GetMapping("/")
    public String home() {
        return "home page";
    }
}



