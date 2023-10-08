package com.example.ecomapp.model.order;

import com.example.ecomapp.model.inventory.Product;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Cart {
    List<OrderItem> itemsWithQuantity;

    public List<OrderItem>  getItemsWithQuantity() {
        return itemsWithQuantity;
    }

    public Cart(@JsonProperty("items") List<OrderItem> itemsWithQuantity) {
        this.itemsWithQuantity = itemsWithQuantity;
    }

    public void addItem(Product product, Integer quantity) {

        this.itemsWithQuantity.add(new OrderItem(product, quantity));
    }
}
