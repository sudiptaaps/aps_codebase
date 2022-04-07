package com.springboot.practice.custome.validationTest;

import com.springboot.practice.custome.validationTest.custome.annotation.CodeValidation;
import com.springboot.practice.custome.validationTest.custome.annotation.NumberValidation;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;

public class Student {


    //@NumberFormat
    @NumberValidation
    private Integer stdentId;

    @NotNull
    @Length(min = 2, max = 10, message = "must be between 2 to 10 characters")
    private String studentName;

    @CodeValidation
    private String studentCode;

    public Integer getStdentId() {
        return stdentId;
    }

    public void setStdentId(Integer stdentId) {
        this.stdentId = stdentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
