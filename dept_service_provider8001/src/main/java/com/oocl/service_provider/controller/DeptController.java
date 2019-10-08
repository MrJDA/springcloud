package com.oocl.service_provider.controller;

import com.oocl.api.entites.Dept;
import com.oocl.service_provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
@CrossOrigin
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/getAllDepts")
    public List<Dept> getAllDepts(){
        return  deptService.getAllDepts();
    }
}
