package com.oocl.service_provider.service;

import com.oocl.api.entites.Dept;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DeptService {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public List<Dept> getAllDepts(){
        return Arrays.asList(new Dept("BA", "db1"), new Dept("FW", "db1"));
    }
    public String addDept(){
        String message = "add a dept";
        amqpTemplate.convertAndSend("dept_message", "message");
        return message;
    }
}
