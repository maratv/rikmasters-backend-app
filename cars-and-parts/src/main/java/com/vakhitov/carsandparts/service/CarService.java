package com.vakhitov.carsandparts.service;

import com.vakhitov.carsandparts.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarsList();

    Car addNewCar(String vin, String registrationNumber);

}

