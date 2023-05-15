package com.vakhitov.service;

import com.vakhitov.CarGrpcServiceGrpc;
import com.vakhitov.CarGrpcServiceOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CarGRPCServiceImpl extends CarGrpcServiceGrpc.CarGrpcServiceImplBase {

    @Override
    public void getCar(CarGrpcServiceOuterClass.CarRequest request,
                       StreamObserver<CarGrpcServiceOuterClass.CarResponse> responseObserver) {

        String vin = request.getVin();
        System.out.println("vin: " + vin);

        CarGrpcServiceOuterClass.CarResponse carResponse = CarGrpcServiceOuterClass.CarResponse.newBuilder()
                .setRegistrationNumber(vin)
                .build();

        responseObserver.onNext(carResponse);
        responseObserver.onCompleted();

    }
}
