package com.oocl.messag.service;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private static final String DEPT_MESSAGE = "dept_message";
    private int messageNum = 0;

    public int getDeptMessageNum(){
        return  messageNum;
    }

    @RabbitListener(queuesToDeclare = @Queue(DEPT_MESSAGE))
    public void addMessageNum(String message){
        messageNum++;
        System.out.println(message);
    }
}
