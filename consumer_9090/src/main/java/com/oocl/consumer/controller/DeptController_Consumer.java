package com.oocl.consumer.controller;

import com.netflix.ribbon.proxy.annotation.Http;
import com.oocl.api.entites.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServlet;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {
    //    public static final String RESET_URL_PREFIX = "http://localhost:8001";
    public static final String RESET_URL_PREFIX = "http://DEPTSERVICEPROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getAllDepts")
    public ResponseEntity getAllDepts() {
        ResponseEntity<List> responseEntity = restTemplate.getForEntity(RESET_URL_PREFIX + "/dept/getAllDepts", List.class);
//        System.out.println(responseEntity.getStatusCode());
//        System.out.println(responseEntity.getHeaders());
//        System.out.println(responseEntity.getBody());
        return responseEntity;
    }
}
