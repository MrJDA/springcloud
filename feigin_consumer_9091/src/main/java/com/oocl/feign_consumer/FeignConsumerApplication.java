package com.oocl.feign_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.oocl.api.service.dept_service")
public class FeignConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignConsumerApplication.class, args);
    }
}
