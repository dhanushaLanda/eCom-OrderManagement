package com.example.ecomapp.model;

import java.util.Map;

public class Cart {
    Map<Product, Integer> itemsWithQuantity;

    public Map<Product, Integer> getItemsWithQuantity() {
        return itemsWithQuantity;
    }

    public Cart(Map<Product, Integer> itemsWithQuantity) {
        this.itemsWithQuantity = itemsWithQuantity;
    }
    public void addItem(Product product, Integer quantity) {
        this.itemsWithQuantity.put(product, quantity);
    }
}
