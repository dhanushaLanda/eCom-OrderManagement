package com.example.ecomapp.model;

import java.util.List;

public class Order {
    String id;
    Cart items;
    String userId;

    public String getId() {
        return id;
    }

    public Cart getItems() {
        return items;
    }

    public String getUserId() {
        return userId;
    }

    public Order(String id, Cart items, String userId) {
        this.id = id;
        this.items = items;
        this.userId = userId;
    }
}
