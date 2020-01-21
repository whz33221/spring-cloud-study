package com.springcloudstudy.mvc.exception;


import com.springcloudstudy.mvc.pojo.Person;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
public class ErrorController {

    @GetMapping(value = "/error-illegal")
    public Person error(){
        throw new IllegalArgumentException("运行时异常");
    }


    @GetMapping(value = "/error-404")
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public void error404(){

    }
    @GetMapping(value = "/error-500")
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public void error500(){
        System.out.println("进入");
        throw new RuntimeException("222");
    }



    @GetMapping("/args.html")
    public Object args(HttpStatus status, HttpServletRequest request ,Throwable throwable){
        HashMap<Object,Object> map = new HashMap <>();
        map.put("11","args");
        map.put("aa","args");
        return map;
    }
    @GetMapping("/404.html")
    public Object pageNotFound(HttpStatus status, HttpServletRequest request ,Throwable throwable){
        HashMap<Object,Object> map = new HashMap <>();
        map.put("11","404");
        map.put("aa","404");
        return map;
    }

    @GetMapping("/500.html")
    public Object error(HttpStatus status, HttpServletRequest request ,Throwable throwable){
        HashMap<Object,Object> map = new HashMap <>();
        map.put("11","500");
        map.put("aa","500");
        return map;
    }




}
