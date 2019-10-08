package com.oocl.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.oocl.api.entites.Dept;
import com.oocl.hystrix.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept/hystrix")
@CrossOrigin
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/getAllDepts")
    @HystrixCommand(fallbackMethod = "helloError")
    public List<Dept> getAllDepts(){
        return  deptService.getAllDepts();
    }

    public String helloError(){
        return "Error";
    }
}
