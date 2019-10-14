package com.oocl.service_provider.controller;

import com.oocl.api.entites.Dept;
import com.oocl.service_provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/addDept")
    public String addDept(){
        return deptService.addDept();
    }
}
