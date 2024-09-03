package com.wellscosta.web_service_udemy.repositories;

import com.wellscosta.web_service_udemy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
