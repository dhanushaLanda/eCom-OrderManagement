package com.example.ecomapp.service;

import com.example.ecomapp.exception.InvaliOrderReceived;
import com.example.ecomapp.model.order.Cart;
import com.example.ecomapp.model.order.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderManager {
    List<Order> orderList;
    InventoryManager inventoryManager;

    public OrderManager(List<Order> orderList, InventoryManager inventoryManager) {
        this.orderList = orderList;
        this.inventoryManager = inventoryManager;
    }

    public String createOrder(String userId, Cart cart) throws InvaliOrderReceived {
        if (inventoryManager.isValidOrder(cart)){
            Order order = new Order("123", cart, userId);
            this.orderList.add(order);
            inventoryManager.dispatchInventory(order.getId(), cart.getItemsWithQuantity());
            return order.getId();
        }else {
            throw new InvaliOrderReceived();
        }

    }

    public Order getOrder(String orderId) {
        return orderList.stream().filter(order -> order.getId().equals(orderId)).findFirst().get();
    }

}
