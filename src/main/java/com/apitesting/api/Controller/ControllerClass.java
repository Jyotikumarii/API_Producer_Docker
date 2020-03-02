package com.apitesting.api.Controller;
import com.apitesting.api.RabbitMq.RabbitMQProperties;
import com.apitesting.api.Repository.OrderService;
import com.apitesting.api.users.Customer;
import com.google.gson.Gson;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerClass {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    RabbitMQProperties rabbitMQProperties;

    @Autowired
    private OrderService orderService;
    private Gson gson = new Gson();


    @GetMapping(path = "/hello")
    public String hello() {
        System.out.println("In here");
        return "Hello";
    }

    
    @PostMapping(path = "/local/topic")
    public String sendTopicMessage(@RequestBody Customer orderRequest) {
        orderService.saveOrder(orderRequest);
        orderService.saveOrder(orderRequest);
        String jsonMessage = gson.toJson(orderRequest);
        rabbitTemplate.convertAndSend(rabbitMQProperties.getTopicExchangeName(), rabbitMQProperties.getRoutingKey2(), orderRequest);
        return "Message: \"" + jsonMessage + "\"\n has been sent via topic exchange";
    }

    @PostMapping(path = "/local/direct")
    public String sendDirectMessage(@RequestBody Customer orderRequest) {
        orderService.saveOrder(orderRequest);
        String jsonMessage = gson.toJson(orderRequest);
        rabbitTemplate.convertAndSend(rabbitMQProperties.getDirectExchangeName(), rabbitMQProperties.getRoutingKey1(), orderRequest);
        return "Message: \"" + jsonMessage + "\"\n has been sent via direct exchange";
    }

    @PostMapping(path = "/local/fanout")
    public String sendFanoutMessage(@RequestBody Customer orderRequest) {
        orderService.saveOrder(orderRequest);
        String jsonMessage = gson.toJson(orderRequest);
        rabbitTemplate.convertAndSend(rabbitMQProperties.getFanoutExchangeName(), "", orderRequest);
        return "Message: \"" + jsonMessage + "\"\n has been sent via fanout exchange";
    }
}

