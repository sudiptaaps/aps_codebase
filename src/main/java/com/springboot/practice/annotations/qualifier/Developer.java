package com.springboot.practice.annotations.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("dev")
public class Developer implements Employee{
    @Override
    public void pringDetails() {
        System.out.println("I am developer class");
    }

    public String getDetails() {
        return "developer";
    }


}
