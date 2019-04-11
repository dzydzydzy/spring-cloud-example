package com.hand.eurekamonitorclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
@EnableHystrixDashboard
public class EurekaMonitorClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMonitorClientApplication.class, args);
    }

}
