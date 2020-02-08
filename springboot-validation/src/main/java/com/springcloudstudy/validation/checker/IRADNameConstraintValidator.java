package com.springcloudstudy.validation.checker;

import com.springcloudstudy.validation.annotation.IRADStart;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IRADNameConstraintValidator implements ConstraintValidator<IRADStart,String> {

    @Override
    public void initialize(IRADStart constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(StringUtils.isEmpty(value)){
            return false;
        }
        if(value.startsWith("IRAD")){
            return true;
        }
        return false;
    }
}
