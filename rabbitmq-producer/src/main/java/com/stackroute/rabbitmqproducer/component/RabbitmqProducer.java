package com.stackroute.rabbitmqproducer.component;

import com.stackroute.rabbitmqproducer.configuration.RabbitProducerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqProducer {

    private Logger logger = LoggerFactory.getLogger(RabbitmqProducer.class);
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitmqProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void produceForConsumer1(String message){
        logger.info("Inserting message to queue");
        rabbitTemplate.convertAndSend(RabbitProducerConfig.EXCHANGE_NAME,RabbitProducerConfig.ROUTING_KEY_1,message);
        logger.info("Message successfully sent");
        logger.info("Is listener returned ::: " + rabbitTemplate.isReturnListener());
    }

    public void produceForConsumer2(String message){
        logger.info("Inserting message to queue");
        rabbitTemplate.convertAndSend(RabbitProducerConfig.EXCHANGE_NAME,RabbitProducerConfig.ROUTING_KEY_2,message);
        logger.info("Message successfully sent");
        logger.info("Is listener returned ::: " + rabbitTemplate.isReturnListener());
    }

    public void produceForConsumer3(String message){
        logger.info("Inserting message to queue");
        rabbitTemplate.convertAndSend(RabbitProducerConfig.EXCHANGE_NAME,RabbitProducerConfig.ROUTING_KEY_3,message);
        logger.info("Message successfully sent");
        logger.info("Is listener returned ::: " + rabbitTemplate.isReturnListener());
    }
}
