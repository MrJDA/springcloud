package com.oocl.feign_consumer.controller;

import com.netflix.ribbon.proxy.annotation.Http;
import com.oocl.api.entites.Dept;
import com.oocl.api.service.dept_service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {
    @Autowired
    private DeptService deptService;

    @GetMapping("/getAllDepts")
    public ResponseEntity getAllDepts() {
        MultiValueMap<String,String> headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, "application/json");
        return new ResponseEntity(deptService.getAllDepts(), headers, HttpStatus.OK);
    }
}
