package com.vakhitov.driversandaccounts.service;

import com.vakhitov.CarGrpcServiceGrpc;
import com.vakhitov.CarGrpcServiceOuterClass;
import com.vakhitov.driversandaccounts.model.Driver;
import com.vakhitov.driversandaccounts.model.Category;
import com.vakhitov.driversandaccounts.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;

    @GrpcClient("grpc-srv")
    private final CarGrpcServiceGrpc.CarGrpcServiceBlockingStub stub;


    @Override
    public List<Driver> getDriversList() {
        return driverRepository.findAll();
    }

    @Override
    public Driver saveNewDriver(String fullName, String passport, Category cat) {
        Driver driver = Driver.builder()
                .fullName(fullName)
                .passport(passport)
                .category(cat)
                .build();

        return driverRepository.save(driver);
    }

    public Driver assignCar(String passport, String vin) {
        Optional<Driver> optionalDriver = driverRepository.findByPassport(passport);
        Driver driver = optionalDriver.orElseThrow(IllegalArgumentException::new);

        CarGrpcServiceOuterClass.CarRequest request = CarGrpcServiceOuterClass.CarRequest.newBuilder()
                .setVin(vin)
                .build();

        System.out.println("vin request: " + request.getVin());

        CarGrpcServiceOuterClass.CarResponse response = stub.getCar(request);

        String registrationNumber = response.getRegistrationNumber();

        driver.setCarsRegistrationNumber(registrationNumber);

        return driverRepository.save(driver);
    }
}
