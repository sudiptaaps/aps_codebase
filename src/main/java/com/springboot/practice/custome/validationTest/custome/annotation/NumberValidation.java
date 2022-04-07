package com.springboot.practice.custome.validationTest.custome.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = NumberValidator.class)

public @interface NumberValidation  {
    public String message() default "Invalid number";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};

}
