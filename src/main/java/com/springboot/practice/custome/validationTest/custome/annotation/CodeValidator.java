package com.springboot.practice.custome.validationTest.custome.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeValidator implements ConstraintValidator<CodeValidation,String > {

/*
{1,1,2,2,1,4,4,2,5,5,}
find unique odds and avg

find highest occurences of nums as a list {1,2}

 */


   // @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        if(code == null || code.trim().equals(""))
        return false;
        else if(!code.startsWith("STU")) return false;
        return true;
    }
}
