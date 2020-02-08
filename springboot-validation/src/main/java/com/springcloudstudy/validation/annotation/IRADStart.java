package com.springcloudstudy.validation.annotation;

import com.springcloudstudy.validation.checker.IRADNameConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Max;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { IRADNameConstraintValidator.class})
public @interface IRADStart {

    String message() default "{com.springcloudstudy.validation.annotation.IRADStart.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
