package com.wellscosta.web_service_udemy.services;

import com.wellscosta.web_service_udemy.entities.Product;
import com.wellscosta.web_service_udemy.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);

        return obj.orElseGet(this::defaultProduct);
    }

    private Product defaultProduct() {
        return new Product(null, "Product Default", "Description Default", 000000.00, "");
    }
}
