package com.stackroute.rabbitmqproducer.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*This class contains thre declaration of the beans */
@Configuration
public class RabbitProducerConfig {

    //All the routing key,queue name and exchange
    public static final String ROUTING_KEY_1 = "my.routing.key1";
    public static final String ROUTING_KEY_2 = "my.routing.key2";
    public static final String ROUTING_KEY_3 = "my.routing.key3";
    public static final String EXCHANGE_NAME = "my.exchange.topic";
    public static final String QUEUE_NAME_1 = "my.queue.name.1";
    public static final String QUEUE_NAME_2 = "my.queue.name.2";
    public static final String QUEUE_NAME_3 = "my.queue.name.3";

    //Bean declaration for queue1
    @Bean
    Queue queueOne() { return new Queue(QUEUE_NAME_1, true); }

    //Bean declaration for queue2
    @Bean
    Queue queueTwo() {
        return new Queue(QUEUE_NAME_2, true);
    }

    //Bean declaration for queue3
    @Bean
    Queue queueThree() {
        return new Queue(QUEUE_NAME_3, true);
    }

    //Bean declaration for TopicExchange
    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    //Bean declaration for binding the exchange with queue1
    @Bean
    Binding bindingOne() {
        return BindingBuilder.bind(queueOne()).to(topicExchange()).with(ROUTING_KEY_1);
    }

    //Bean declaration for binding the exchange with queue1
    @Bean
    Binding bindingTwo() {
        return BindingBuilder.bind(queueTwo()).to(topicExchange()).with(ROUTING_KEY_2);
    }

    //Bean declaration for binding the exchange with queue1
    @Bean
    Binding bindingThree() {
        return BindingBuilder.bind(queueThree()).to(topicExchange()).with(ROUTING_KEY_3);
    }
}
