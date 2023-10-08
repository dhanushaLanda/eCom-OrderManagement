package com.example.ecomapp.service;

import com.example.ecomapp.exception.ProductNotFoundException;
import com.example.ecomapp.model.inventory.Category;
import com.example.ecomapp.model.inventory.Inventory;
import com.example.ecomapp.model.order.Cart;
import com.example.ecomapp.model.order.OrderItem;
import com.example.ecomapp.model.inventory.Product;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InventoryManager {
    Inventory inventory;

    public InventoryManager() throws IOException {
        this.inventory = InventoryLoader.loadDefaultInventory();
    }

    public void dispatchInventory(String orderId, List<OrderItem> productList) {
        System.out.println("Order dispatched : " + orderId);
    }

    public void addProduct(Product product, Category category) {
        this.inventory.getCategoryProductMap().getOrDefault(category, new ArrayList<>()).add(product);
    }

    public Product getProduct(Category category, String id) {
        return this.inventory.getCategoryProductMap().get(category).stream()
                .filter(product -> product.getId().equals(id)).findFirst().orElseThrow();
    }

    public boolean isValidOrder(Cart cart) {
        return cart.getItemsWithQuantity().stream().allMatch(orderItem -> {
            Product category = orderItem.getProduct();
            return this.inventory.getCategoryProductMap().containsKey(category.getCategory()) &&
                    this.inventory.getCategoryProductMap().get(category.getCategory()).stream()
                            .anyMatch(product -> product.getId().equals(category.getId()));
        });
    }

    public boolean removeProduct(Category category, String productId) {
        return this.inventory.getCategoryProductMap().get(category).removeIf(product -> product.getId().equals(productId));
    }
}
