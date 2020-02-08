package com.springcloudstudy.validation.controller;

import org.springframework.lang.UsesSunHttpServer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/validation")
    public void getUser(@Valid @RequestBody User user ){

    }

    @PostMapping("/model")
    public User getUserpojo(@RequestBody User user ){
        return new User();
    }
}
