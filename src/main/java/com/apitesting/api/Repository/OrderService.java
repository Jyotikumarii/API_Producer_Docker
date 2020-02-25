package com.apitesting.api.Repository;

import com.apitesting.api.users.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public void saveOrder(Customer orderRequest){
        orderRepository.save(orderRequest);
    }
}