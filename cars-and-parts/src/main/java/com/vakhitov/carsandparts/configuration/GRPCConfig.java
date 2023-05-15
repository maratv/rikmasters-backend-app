package com.vakhitov.carsandparts.configuration;

import com.vakhitov.carsandparts.service.CarGRPCServiceImpl;
import io.grpc.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

//@Configuration
public class GRPCConfig {

 //   @Bean
    public void server() throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(9090)
                .addService(new CarGRPCServiceImpl())
                .build();

        server.start();
        server.awaitTermination();

    }
}
