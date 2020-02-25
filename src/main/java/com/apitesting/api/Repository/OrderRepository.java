package com.apitesting.api.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.apitesting.api.users.Customer;
import org.springframework.stereotype.Repository;

    @Repository
    public interface OrderRepository extends JpaRepository<Customer, String> {
    }

