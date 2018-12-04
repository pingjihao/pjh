package com.jk.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired

    private AmqpTemplate amqpTemplate;

    @RequestMapping("/send")
    public String send(){
        String content="Date:"+new Date();
        amqpTemplate.convertAndSend("lyhTest1",content);
        return content;
    }
}
