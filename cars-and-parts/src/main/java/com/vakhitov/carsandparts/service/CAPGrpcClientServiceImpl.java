package com.vakhitov.carsandparts.service;


import com.vakhitov.ExchangeServiceGrpc;
import com.vakhitov.GrpcService;
//import net.devh.boot.grpc.server.service.GrpcService;

import io.grpc.Channel;
import io.grpc.StatusRuntimeException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@AllArgsConstructor
@Service
public class CAPGrpcClientServiceImpl implements CAPGrpcClientService {


    @GrpcClient("grpc-srv")
    @Autowired
    private ExchangeServiceGrpc.ExchangeServiceBlockingStub stub;

//    @GrpcClient("grpc-srv")
//    private Channel channel;

    @Override
    public String sendMessage() {

        GrpcService.HelloRequest helloRequest = GrpcService.HelloRequest.newBuilder()
                .setMessageRequest("*** test ***")
                .build();
        try {
            GrpcService.HelloResponse response = stub.hello(helloRequest);


            System.out.println(response.getMessageResponse());
            return response.getMessageResponse();
        } catch (StatusRuntimeException e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
        return "0**0";
    }


}
