package com.springcloudstudy.validation;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class WebConfiguration implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("加载成功");
    }
}
