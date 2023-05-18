package com.vakhitov.carsandparts.configuration;

import com.vakhitov.carsandparts.service.CarGRPCServiceImpl;
import io.grpc.*;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.io.IOException;

//@Configuration
public class GRPCConfig {

 /*
    @Bean
    public void server() throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(9090)
                .addService(new CarGRPCServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }

  */

    /*
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
        JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
        factory.setPort(8081);
        factory.setContextPath("/myapp");
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
        return factory;
    }


     */

}
