package com.oocl.feign_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.oocl.api.service.dept_service"})
/*
    扫描fallbackFactory的component，但是因为配置了扫描com.oocl.api.service.dept_service就无法扫描本项目包，因此需要加上
    com.oocl.feign_consumer以完成对于本项目的扫描
*/
@ComponentScan(value = {"com.oocl.api.service.dept_service" , "com.oocl.feign_consumer"})
public class FeignConsumerApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignConsumerApplication.class, args);
    }
}
