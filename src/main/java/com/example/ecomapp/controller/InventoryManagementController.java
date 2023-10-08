package com.example.ecomapp.controller;

import com.example.ecomapp.service.InventoryManager;
import com.example.ecomapp.model.inventory.Category;
import com.example.ecomapp.model.inventory.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inventory")
public class InventoryManagementController {
    @Autowired
    private InventoryManager inventoryManager;

    @PostMapping("/product/add/{category}")
    public void addProduct(@RequestBody Product product, @PathVariable Category category) {
        inventoryManager.addProduct(product, category);
    }

    @GetMapping("/product")
    public Product getProduct(@RequestParam Category category, @RequestParam String productId){
        return inventoryManager.getProduct(category,productId);
    }

    @GetMapping("/product/remove")
    public boolean removeProduct(@RequestParam Category category, @RequestParam String productId) {
        return inventoryManager.removeProduct(category, productId);
    }
}
