package com.springboot.practice.custome.validationTest.custome.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NumberValidator implements ConstraintValidator<NumberValidation,String >{
//    @Override
//    public void initialize(NumberValidation constraintAnnotation) {
//        //ConstraintValidator.super.initialize(constraintAnnotation);
//    }


    //@Override
    public boolean isValid(String strNum, ConstraintValidatorContext constraintValidatorContext) {

        if (strNum == null || strNum.trim().equals("")) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
//        try {
//            double d = Double.parseDouble(strNum);
//        } catch (NumberFormatException nfe) {
//            return false;
//        }
        return true;

    }
}
