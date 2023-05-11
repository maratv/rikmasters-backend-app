package com.vakhitov.carsandparts.service;

import com.vakhitov.ExchangeServiceGrpc;
import com.vakhitov.GrpcService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class FoobarService {

    @GrpcClient("grpc-srv")
    private ExchangeServiceGrpc.ExchangeServiceBlockingStub myStub;

    public String receiveHello(String name) {
        GrpcService.HelloRequest request = GrpcService.HelloRequest.newBuilder()
                .setMessageRequest(name)
                .build();
        return myStub.hello(request).getMessageResponse();
    }

}
