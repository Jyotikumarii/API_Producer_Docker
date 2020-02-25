package com.apitesting.api.RabbitMq;


import java.io.Serializable;

public class Notification implements Serializable {

    public Notification() {
    }

    private String notificationType;
    private String msg;
}
