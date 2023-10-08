package com.example.ecomapp.manager;

import com.example.ecomapp.model.Cart;
import com.example.ecomapp.model.Inventory;
import com.example.ecomapp.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Component
public class InventoryManager {
    Inventory inventory;

    public InventoryManager(Inventory inventory) {
        this.inventory = inventory;
    }

    public void dispatchInventory(String orderId, Map<Product,Integer> productList) {
        System.out.println("Order dispatched : "+ orderId);
    }
}
