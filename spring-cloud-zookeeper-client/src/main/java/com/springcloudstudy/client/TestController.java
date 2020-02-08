package com.springcloudstudy.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/list")
    public Object getlist(){
        List<String> services = discoveryClient.getServices();
        return services;
    }


}
