package com.stackroute.rabbitmqconsumer.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;


@Component
public class RabbitmqConsumer1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void consume(String msg){
        logger.info("Consumer 1");
        logger.info("Message Received: "+msg);

    }
}
