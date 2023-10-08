package com.example.ecomapp.model.order;

import com.example.ecomapp.model.inventory.Product;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderItem {
    private Product product;
    private Integer quantity;


    public OrderItem(@JsonProperty("product") Product product, @JsonProperty("quantity") Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
