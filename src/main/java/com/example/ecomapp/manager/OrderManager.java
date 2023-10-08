package com.example.ecomapp.manager;

import com.example.ecomapp.model.Cart;
import com.example.ecomapp.model.Inventory;
import com.example.ecomapp.model.Order;
import com.example.ecomapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderManager {
    List<Order> orderList;
    InventoryManager inventoryManager;

    public OrderManager(List<Order> orderList, InventoryManager inventoryManager) {
        this.orderList = orderList;
        this.inventoryManager = inventoryManager;
    }

    public void createOrder(User user, Cart cart) {
        Order order = new Order("123", cart, user.getId());
        System.out.println("Order created for user "+ user.getId() + " and order Id is : "+ order.getId());
        inventoryManager.dispatchInventory(order.getId(), cart.getItemsWithQuantity());
    }


}
