package com.springcloudstudy.client;

import com.springcloudstudy.stream.MySink;
import com.springcloudstudy.stream.MySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyStreamTest {

    @Autowired
    @Qualifier(MySource.OUTPUT1)
    private MessageChannel outputChannel;

    @Autowired
    @Qualifier(MySink.INPUT1)
    private SubscribableChannel inputChannel;

    @PostMapping("/msg")
    public void send(){
        outputChannel.send(MessageBuilder.withPayload("MySource===helloworld").build());
    }

    /**
     * stream处理方式
     * @param message
     */
    @StreamListener(MySink.INPUT1)
    public void handleMessage(Message<String> message){
        String payload = message.getPayload();
        System.out.println(payload);
    }


}
