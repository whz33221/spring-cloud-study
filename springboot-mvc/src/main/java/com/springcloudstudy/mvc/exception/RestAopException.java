package com.springcloudstudy.mvc.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class RestAopException {

    @ExceptionHandler(value = IllegalArgumentException.class)
    public Object restController(){
        HashMap<Object,Object> map = new HashMap <>();
        map.put("11","aop");
        map.put("aa","aop");
        return map;

    }
}
