package com.springcloudstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class JdbcApplication implements ErrorPageRegistrar {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }


    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        //捕捉400状态码的全局异常后，调用/404.html-handle
        /*1、按错误的类型显示错误的网页*/
        registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
        registry.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html"));

        /*2、按具体某个异常显示错误的网页*/
        /*当某个异常即可以根据错误类型显示错误网页，由可以根据某个具体的异常来显示错误网页时，优先根据具体的某个异常显示错误的网页*/
        ErrorPage argsException = new ErrorPage(IllegalArgumentException.class, "/args.html");
        registry.addErrorPages(argsException);
    }
}
