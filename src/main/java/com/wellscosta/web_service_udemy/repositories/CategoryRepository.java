package com.wellscosta.web_service_udemy.repositories;

import com.wellscosta.web_service_udemy.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
