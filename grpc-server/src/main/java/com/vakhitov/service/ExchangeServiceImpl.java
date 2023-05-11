package com.vakhitov.service;

import com.vakhitov.ExchangeServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import com.vakhitov.GrpcService.HelloRequest;
import com.vakhitov.GrpcService.HelloResponse;

@GrpcService
public class ExchangeServiceImpl extends ExchangeServiceGrpc.ExchangeServiceImplBase {

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String message = request.getMessageRequest();
        System.out.println("name: " + message);

        HelloResponse helloResponse = HelloResponse.newBuilder()
                .setMessageResponse("Received your " + message + ". Hello from server")
                .build();

        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();

    }


}