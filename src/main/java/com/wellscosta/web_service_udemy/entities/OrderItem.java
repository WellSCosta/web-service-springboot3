package com.wellscosta.web_service_udemy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wellscosta.web_service_udemy.entities.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_order_item")
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class OrderItem implements Serializable {

    @EmbeddedId
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }
}
