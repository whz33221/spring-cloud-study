package com.springcloudstudy.fegin.rest;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("cloud-zk-client")
public interface SayingService {

    @GetMapping("/sayWord")
    String sayWord(@RequestParam("word") String word);


}
