package com.wellscosta.web_service_udemy.repositories;

import com.wellscosta.web_service_udemy.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
