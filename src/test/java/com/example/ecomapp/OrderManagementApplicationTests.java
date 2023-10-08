package com.example.ecomapp;

import com.example.ecomapp.exception.InvaliOrderReceived;
import com.example.ecomapp.model.inventory.*;
import com.example.ecomapp.model.order.Cart;
import com.example.ecomapp.service.InventoryManager;
import com.example.ecomapp.service.OrderManager;
import com.example.ecomapp.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class OrderManagementApplicationTests {

    @Test
    void contextLoads() throws IOException, InvaliOrderReceived {
        FoodProduct laddu = new FoodProduct("Laddu", "Bhundhi laddu", "1234",
                new WeightMeasure(Double.valueOf(500), Double.valueOf(250)), Category.SWEET);

        System.out.println(laddu.toString());
        HashMap<Category, List<Product>> categoryFoodProductHashMap = new HashMap<>();
        categoryFoodProductHashMap.put(Category.SWEET, List.of(laddu));
        Location location = new Location(1234.099, 1231.987);

        Inventory inventory = new Inventory(categoryFoodProductHashMap, location,
                new User("Admin", "user123", location));
        InventoryManager inventoryManager = new InventoryManager();
        OrderManager orderManager = new OrderManager(new ArrayList<>(), inventoryManager);
        Cart cart = new Cart(new ArrayList<>());
        cart.addItem(laddu,4);
        orderManager.createOrder("Dhanu123", cart);
    }


}
