package com.vakhitov.carsandparts.service;

import com.vakhitov.CarGrpcServiceGrpc;
import com.vakhitov.CarGrpcServiceOuterClass;
import com.vakhitov.carsandparts.model.Car;
import com.vakhitov.carsandparts.repository.CarsRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


@GrpcService
public class CarGRPCServiceImpl extends CarGrpcServiceGrpc.CarGrpcServiceImplBase {

    @Autowired
    private CarsRepository carsRepository;


    @Override
    public void getCar(CarGrpcServiceOuterClass.CarRequest request,
                       StreamObserver<CarGrpcServiceOuterClass.CarResponse> responseObserver) {

        System.out.println("vin from invoker: " + request.getVin());
        Optional<Car> optionalCar = carsRepository.getCarByVin(request.getVin());
        Car car = optionalCar.orElseThrow(IllegalArgumentException::new);

        CarGrpcServiceOuterClass.CarResponse carResponse = CarGrpcServiceOuterClass.CarResponse.newBuilder()
                .setRegistrationNumber(car.getRegistrationNumber())
                .build();
        System.out.println("response: " + carResponse.getRegistrationNumber());

        responseObserver.onNext(carResponse);
        responseObserver.onCompleted();
    }
}