package com.vakhitov.driversandaccounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {

    @GetMapping("/test")
    public String test() {
        return "Driver test response";
    }


}
