package com.wellscosta.web_service_udemy.config;

import com.wellscosta.web_service_udemy.entities.Order;
import com.wellscosta.web_service_udemy.entities.User;
import com.wellscosta.web_service_udemy.repositories.OrderRepository;
import com.wellscosta.web_service_udemy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2024-08-07T09:05:58Z"),u1);
        Order o2 = new Order(null, Instant.parse("2024-09-04T10:10:06Z"),u2);
        Order o3 = new Order(null, Instant.parse("2024-09-02T08:40:53Z"),u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
