package com.springboot.practice;

import com.springboot.practice.annotations.qualifier.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class ManageEmployee {
    @Autowired
    //@Qualifier("dev")
    Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public static void main(String[] ar){

       ManageEmployee me = new ManageEmployee();
       System.out.println(me.getEmployee());
        List<Integer> numbers = Arrays.
                asList(1, 4, 8, 40, 11, 22, 33, 99);




       //me.getEmployee().pringDetails();
    }
}
