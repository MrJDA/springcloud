package com.oocl.service_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptServiceProviderApplication3 {
    public static void main(String[] args){
        SpringApplication.run(DeptServiceProviderApplication3.class, args);
    }
}
