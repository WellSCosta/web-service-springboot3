package com.wellscosta.web_service_udemy.services;

import com.wellscosta.web_service_udemy.entities.Order;
import com.wellscosta.web_service_udemy.entities.User;
import com.wellscosta.web_service_udemy.entities.enums.OrderStatus;
import com.wellscosta.web_service_udemy.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);

        return obj.orElseGet(this::defaultOrder);
    }

    private Order defaultOrder() {
        return new Order(null, null, OrderStatus.CANCELED, new User(null, "User Default", "user@email.com", "123456789", "123456"));
    }
}
