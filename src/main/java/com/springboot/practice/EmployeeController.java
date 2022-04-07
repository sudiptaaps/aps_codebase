package com.springboot.practice;

import com.springboot.practice.annotations.qualifier.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    //@Qualifier("mang")
    Employee employee;

    @GetMapping("/printHello")
    public String printHello(){
        return "Hello "+employee.getDetails();
    }

}
