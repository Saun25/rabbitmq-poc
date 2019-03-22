package com.stackroute.rabbitmqconsumer2.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class RabbitmqConsumer2 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    public void consume(String msg) {
        logger.info("Consumer 2");
        logger.info("Message Received: " + msg);

    }

}
