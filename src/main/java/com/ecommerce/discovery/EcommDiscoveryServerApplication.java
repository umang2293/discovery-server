package com.ecommerce.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommDiscoveryServerApplication.class, args);
    }

}
