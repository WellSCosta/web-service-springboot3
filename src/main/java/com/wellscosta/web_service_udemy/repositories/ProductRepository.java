package com.wellscosta.web_service_udemy.repositories;

import com.wellscosta.web_service_udemy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
