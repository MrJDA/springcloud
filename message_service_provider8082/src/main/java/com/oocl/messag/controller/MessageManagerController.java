package com.oocl.messag.controller;

import com.oocl.messag.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageManagerController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/getDeptMessageNum")
    public int getDeptMessageNum(){
        return messageService.getDeptMessageNum();
    }
}
