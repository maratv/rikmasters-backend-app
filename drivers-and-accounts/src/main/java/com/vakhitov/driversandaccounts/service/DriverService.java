package com.vakhitov.driversandaccounts.service;

import com.vakhitov.driversandaccounts.model.Category;
import com.vakhitov.driversandaccounts.model.Driver;

import java.util.List;

public interface DriverService {

    List<Driver> getDriversList();

    Driver saveNewDriver(String fullName, String passport, Category cat);

    Driver assignCar(String passport, String vin);


}
