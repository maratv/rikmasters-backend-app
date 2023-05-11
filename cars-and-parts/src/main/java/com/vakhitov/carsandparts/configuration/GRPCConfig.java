package com.vakhitov.carsandparts.configuration;

import com.vakhitov.ExchangeServiceGrpc;
import io.grpc.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GRPCConfig {

    @Bean
    public Channel channel() {
        return ManagedChannelBuilder
                .forAddress("127.0.0.1", 9090)
                .usePlaintext()
                .build();
    }


    @Bean
    public ExchangeServiceGrpc.ExchangeServiceBlockingStub stub() {
        return ExchangeServiceGrpc.newBlockingStub(channel());
    }
}
