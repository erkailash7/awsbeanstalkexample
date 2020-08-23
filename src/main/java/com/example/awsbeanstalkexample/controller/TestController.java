package com.example.awsbeanstalkexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/message")
    public String getMessage(){
        String msg = "Spring boot application deployed on beanstalk version-15";
        return msg;
    }
}
