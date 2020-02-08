//package com.springcloudstudy.client;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.context.WebServerInitializedEvent;
//import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RegistrationConfig {
//
//    @Autowired
//    private AbstractAutoServiceRegistration serviceRegistration;
//
//    @EventListener(WebServerInitializedEvent.class)
//    public void register(WebServerInitializedEvent event) {
//        serviceRegistration.bind(event);
//    }
//}