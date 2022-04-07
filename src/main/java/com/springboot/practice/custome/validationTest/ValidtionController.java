package com.springboot.practice.custome.validationTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("validation")
public class ValidtionController {

    @GetMapping("/student")
    public Student validateEmp(@Valid @RequestBody Student student){

        student.setStudentCode(student.getStdentId()+"ABC");
        return student;
    }
}
