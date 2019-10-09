package com.oocl.hystrix.service;

import com.oocl.api.entites.Dept;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DeptService {
    public List<Dept> getAllDepts(){
        return Arrays.asList(new Dept("BA","db_hystrix"), new Dept("FW", "db_hystrix"));
    }
}
