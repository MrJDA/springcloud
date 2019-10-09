package com.oocl.api.service.dept_service;

import com.oocl.api.entites.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "DEPTSERVICEPROVIDER")
public interface DeptService {
    @GetMapping("/dept/getAllDepts")
    public List<Dept> getAllDepts();
}
