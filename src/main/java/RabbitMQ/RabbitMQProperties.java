package RabbitMQ;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitMQProperties {



    private String queueName = "Queue";
    private String queueName1 = "Queue1";
    private String queueName2 = "Queue2";
    private String queueName3 = "Queue3";
    private String queueName4 = "Queue4";


    private String directExchangeName = "Direct_Exchange";
    private String topicExchangeName = "Topic_Exchange";
    private String fanoutExchangeName = "Fanout_Exchange";

    private String routingKey1 = "topicRoutingKey";
    private String routingKey2 = "directRoutingKey";


    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getQueueName1() {
        return queueName1;
    }

    public void setQueueName1(String queueName1) {
        this.queueName1 = queueName1;
    }

    public String getQueueName2() {
        return queueName2;
    }

    public void setQueueName2(String queueName2) {
        this.queueName2 = queueName2;
    }

    public String getQueueName3() {
        return queueName3;
    }

    public void setQueueName3(String queueName3) {
        this.queueName3 = queueName3;
    }

    public String getQueueName4() {
        return queueName4;
    }

    public void setQueueName4(String queueName4) {
        this.queueName4 = queueName4;
    }

    public String getDirectExchangeName() {
        return directExchangeName;
    }

    public void setDirectExchangeName(String directExchangeName) {
        this.directExchangeName = directExchangeName;
    }

    public String getTopicExchangeName() {
        return topicExchangeName;
    }

    public void setTopicExchangeName(String topicExchangeName) {
        this.topicExchangeName = topicExchangeName;
    }

    public String getFanoutExchangeName() {
        return fanoutExchangeName;
    }

    public void setFanoutExchangeName(String fanoutExchangeName) {
        this.fanoutExchangeName = fanoutExchangeName;
    }

    public String getRoutingKey1() {
        return routingKey1;
    }

    public void setRoutingKey1(String routingKey1) {
        this.routingKey1 = routingKey1;
    }

    public String getRoutingKey2() {
        return routingKey2;
    }

    public void setRoutingKey2(String routingKey2) {
        this.routingKey2 = routingKey2;
    }


}