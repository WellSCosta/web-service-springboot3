package com.wellscosta.web_service_udemy.repositories;

import com.wellscosta.web_service_udemy.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
