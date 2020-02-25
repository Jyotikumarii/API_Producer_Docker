package com.apitesting.api.RabbitMq;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MessageApp1 {

    @Autowired
    private RabbitMQProperties rabbitMQProperties;

    @Bean("queue")
    Queue queue() {
        return new Queue(rabbitMQProperties.getQueueName(), false);
    }

    @Bean("queue1")
    Queue queue1() {
        return new Queue(rabbitMQProperties.getQueueName1(), false);
    }

    @Bean("queue2")
    Queue queue2() {
        return new Queue(rabbitMQProperties.getQueueName2(), false);
    }


    @Bean("queue3")
    Queue queue3() {
        return new Queue(rabbitMQProperties.getQueueName3(), false);
    }

    @Bean("queue4")
    Queue queue4() {
        return new Queue(rabbitMQProperties.getQueueName4(), false);
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange(rabbitMQProperties.getFanoutExchangeName());
    }

    @Bean
    DirectExchange directExchange () {
        return new DirectExchange(rabbitMQProperties.getDirectExchangeName());
    }

    @Bean
    TopicExchange topicExchange () {
        return new TopicExchange(rabbitMQProperties.getTopicExchangeName());
    }


    @Bean
    Binding marketingBinding(@Qualifier("queue") Queue Direct_Queue, FanoutExchange My_Exchange) {
        return BindingBuilder.bind(Direct_Queue).to(My_Exchange);
    }

    @Bean
    Binding marketingBinding1(@Qualifier("queue1") Queue Direct_Queue1, FanoutExchange My_Exchange) {
        return BindingBuilder.bind(Direct_Queue1).to(My_Exchange);
    }
    @Bean
    Binding marketingBinding2(@Qualifier("queue2") Queue Direct_Queue2, FanoutExchange My_Exchange) {
        return BindingBuilder.bind(Direct_Queue2).to(My_Exchange);
    }
    @Bean
    Binding marketingBinding3(@Qualifier("queue3") Queue Direct_Queue, DirectExchange My_Exchange) {
        return BindingBuilder.bind(Direct_Queue).to(My_Exchange).with(rabbitMQProperties.getRoutingKey1());
    }
    @Bean
    Binding marketingBinding4(@Qualifier("queue4") Queue Direct_Queue, TopicExchange My_Exchange) {
        return BindingBuilder.bind(Direct_Queue).to(My_Exchange).with(rabbitMQProperties.getRoutingKey2());
    }





    @Bean
    public RabbitTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }


}