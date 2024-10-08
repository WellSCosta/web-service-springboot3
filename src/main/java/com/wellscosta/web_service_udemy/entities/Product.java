package com.wellscosta.web_service_udemy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_product")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    @ManyToMany
    @JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    @Setter(AccessLevel.NONE)
    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "id.product")
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private Set<OrderItem> items = new HashSet<>();

    public Product(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    @JsonIgnore
    public Set<Order> getOrders() {
        Set<Order> set = new HashSet<>();

        for (OrderItem x : items) {
            set.add(x.getOrder());
        }
        return set;
    }
}
