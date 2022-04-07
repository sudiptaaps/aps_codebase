package com.springboot.practice.configProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("limitService")
public class LimitController {

    @Autowired
    LimitConfig config;

    @GetMapping("/hello")
    public String hello(){
        return "hello all";
    }

    @GetMapping("/limit")
    public Limit getLimitService(){

        return new Limit(config.getMinimum(),config.getMaximum());
    }
}
