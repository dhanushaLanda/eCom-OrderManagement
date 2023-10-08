package com.example.ecomapp;

import com.example.ecomapp.manager.InventoryManager;
import com.example.ecomapp.manager.OrderManager;
import com.example.ecomapp.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class OrderManagementApplicationTests {

    @Test
    void contextLoads() {
        FoodProduct laddu = new FoodProduct("Laddu", "Bhundhi laddu", "1234",
                new WeightMeasure(Double.valueOf(500), Double.valueOf(250)));

        HashMap<Category, Product> categoryFoodProductHashMap = new HashMap<>();
        categoryFoodProductHashMap.put(Category.SWEET, laddu);
        Location location = new Location(1234.099, 1231.987);

        Inventory inventory = new Inventory(categoryFoodProductHashMap, location,
                new User("Admin", "user123", location));
        InventoryManager inventoryManager = new InventoryManager(inventory);
        OrderManager orderManager = new OrderManager(new ArrayList<>(), inventoryManager);
        Cart cart = new Cart(new HashMap<>());
        cart.addItem(laddu,4);
        orderManager.createOrder(new User("Dhanu","Dhanu123",location ), cart);
    }


}
