package com.stackroute.rabbitmqconsumer.component;

import com.stackroute.rabbitmqconsumer.configuration.RabbitConsumerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*This class listens to the message that is in the specified queue i.e. queue1*/
@Component
public class RabbitmqConsumer1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * This method annotated with RabbitListener listens to the queue and takes up tha message in the queue
     *
     * @param msg
     */
    @RabbitListener(queues = RabbitConsumerConfig.QUEUE_NAME)
    public void consume(String msg) {
        logger.info("Consumer 1");
        logger.info("Message Received: " + msg);

    }
}
