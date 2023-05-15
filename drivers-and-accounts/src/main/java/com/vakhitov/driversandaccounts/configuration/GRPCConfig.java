package com.vakhitov.driversandaccounts.configuration;

import com.vakhitov.CarGrpcServiceGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
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
    public CarGrpcServiceGrpc.CarGrpcServiceBlockingStub stub() {
        return CarGrpcServiceGrpc.newBlockingStub(channel());
    }
}
