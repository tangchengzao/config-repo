package com.tangcz.eurekasvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSvrApplication.class, args);
    }

}
