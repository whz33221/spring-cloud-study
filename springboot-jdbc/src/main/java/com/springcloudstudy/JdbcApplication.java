package com.springcloudstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class JdbcApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }



}
