package com.stackroute.rabbitmqproducer.component;

import com.stackroute.rabbitmqproducer.configuration.RabbitProducerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*This class produces the messages,it contains the convertAndSend methods of the RabbitTemplate class which puts the messge in the specified queue */
@Component
public class RabbitmqProducer {

    private Logger logger = LoggerFactory.getLogger(RabbitmqProducer.class);
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitmqProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * This method produces message for consumer 1
     *
     * @param message
     */
    public void produceForConsumer1(String message) {
        logger.info("Inserting message to queue");
        rabbitTemplate.convertAndSend(RabbitProducerConfig.EXCHANGE_NAME, RabbitProducerConfig.ROUTING_KEY_1, message);
        logger.info("Message successfully sent");
        logger.info("Is listener returned ::: " + rabbitTemplate.isReturnListener());
    }

    /**
     * This method produces message for consumer 1
     *
     * @param message
     */
    public void produceForConsumer2(String message) {
        logger.info("Inserting message to queue");
        rabbitTemplate.convertAndSend(RabbitProducerConfig.EXCHANGE_NAME, RabbitProducerConfig.ROUTING_KEY_2, message);
        logger.info("Message successfully sent");
        logger.info("Is listener returned ::: " + rabbitTemplate.isReturnListener());
    }

    /**
     * This method produces message for consumer 1
     *
     * @param message
     */
    public void produceForConsumer3(String message) {
        logger.info("Inserting message to queue");
        rabbitTemplate.convertAndSend(RabbitProducerConfig.EXCHANGE_NAME, RabbitProducerConfig.ROUTING_KEY_3, message);
        logger.info("Message successfully sent");
        logger.info("Is listener returned ::: " + rabbitTemplate.isReturnListener());
    }
}
