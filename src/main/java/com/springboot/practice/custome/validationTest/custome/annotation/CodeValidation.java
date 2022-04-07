package com.springboot.practice.custome.validationTest.custome.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CodeValidator.class)
public @interface CodeValidation {
    public String message() default "Invalid code";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
