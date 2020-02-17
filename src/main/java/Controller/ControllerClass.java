package Controller;
import RabbitMQ.RabbitMQProperties;
import User.Customer;
import com.google.gson.Gson;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerClass {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    RabbitMQProperties rabbitMQProperties;



    public ControllerClass(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping(path = "/local/topic")
    public String customerInformation(@RequestBody Customer s) {

        Gson gson = new Gson();
        String json = gson.toJson(s,Customer.class);

        rabbitTemplate.convertAndSend(rabbitMQProperties.getTopicExchangeName(), rabbitMQProperties.getRoutingKey2(), s);

        System.out.println(json);

        return json;
    }
    @PostMapping(path = "/local/direct")
    public String customerInformation2(@RequestBody Customer s) {

        Gson gson = new Gson();
        String json = gson.toJson(s,Customer.class);

        rabbitTemplate.convertAndSend(rabbitMQProperties.getDirectExchangeName(), rabbitMQProperties.getRoutingKey1(), s);

        System.out.println(json);

        return json;
    }

    @PostMapping(path = "/local/fanout")
    public String customerInformation3(@RequestBody Customer s) {

        Gson gson = new Gson();
        String json = gson.toJson(s,Customer.class);

        rabbitTemplate.convertAndSend(rabbitMQProperties.getFanoutExchangeName(), "", s);

        System.out.println(json);

        return json;
    }

}
