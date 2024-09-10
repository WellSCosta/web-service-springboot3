package com.wellscosta.web_service_udemy.services;

import com.wellscosta.web_service_udemy.entities.User;
import com.wellscosta.web_service_udemy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);

        return obj.orElseGet(this::defaultUser);
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private User defaultUser() {
        return new User(null, "User Default", "user@email.com", "123456789", "123456");
    }
}
