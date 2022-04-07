package com.springboot.practice.annotations.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Service()
public class Manager implements Employee{

    @Override
    public String getDetails() {
        return "manager";
    }

    @Override
    public void pringDetails() {
        System.out.println("I am manager cass");
    }
}
