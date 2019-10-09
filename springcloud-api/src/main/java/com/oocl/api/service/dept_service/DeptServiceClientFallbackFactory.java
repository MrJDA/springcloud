package com.oocl.api.service.dept_service;

import com.oocl.api.entites.Dept;
import com.oocl.api.service.dept_service.DeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class DeptServiceClientFallbackFactory implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public List<Dept> getAllDepts() {
                return Arrays.asList(new Dept("no thing","not thing!@#$"));
            }
        };
    }
}
