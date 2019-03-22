package com.stackroute.rabbitmqproducer.controller;

import com.stackroute.rabbitmqproducer.component.RabbitmqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabitmqController {
    @Autowired
    private RabbitmqProducer rabbitmqProducer;
    @GetMapping("/consumer1/{msg}")
    public String getMessage1(@PathVariable String msg){
        rabbitmqProducer.produceForConsumer1(msg);
        return "Message Body: "+msg;
    }

    @GetMapping("/consumer2/{msg}")
    public String getMessage2(@PathVariable String msg) {
        rabbitmqProducer.produceForConsumer2(msg);
        return "Message Body: " + msg;
    }

    @GetMapping("/consumer3/{msg}")
    public String getMessage3(@PathVariable String msg) {
        rabbitmqProducer.produceForConsumer3(msg);
        return "Message Body: " + msg;
    }
}
