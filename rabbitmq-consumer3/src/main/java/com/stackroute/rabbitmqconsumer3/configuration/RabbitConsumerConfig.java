package com.stackroute.rabbitmqconsumer3.configuration;

import com.stackroute.rabbitmqconsumer3.component.RabbitmqConsumer3;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This class is marked with configuration and is used to declare the beans of the Rabbitmq excahnges,queues and bindings
 */
@Configuration
public class RabbitConsumerConfig {

    //The routing key,queue name,and exchange name has been taken as constants
    public static final String ROUTING_KEY = "my.routing.key3";
    public static final String EXCHANGE_NAME = "my.exchange.topic";
    public static final String QUEUE_NAME = "my.queue.name.3";

    //Bean declaration of the queue
    @Bean
    Queue queue() {
        return new Queue(QUEUE_NAME, true);
    }

    //Bean declaration of the exchange(Topic exchange)
    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    //Bean declaration for the binding between the queue and the exchange using the routing key
    @Bean
    Binding binding(Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with(ROUTING_KEY);
    }

//    @Bean
//    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
//                                             MessageListenerAdapter listenerAdapter) {
//        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.setQueueNames(QUEUE_NAME);
//        container.setMessageListener(listenerAdapter);
//        return container;
//    }
//
//
//    @Bean
//
//    MessageListenerAdapter myQueueListener(RabbitmqConsumer3 listener) {
//        return new MessageListenerAdapter(listener, "consume");
//    }
}
