package com.example.ecomapp.controller;


import com.example.ecomapp.exception.InvaliOrderReceived;
import com.example.ecomapp.exception.OrderNotFoundException;
import com.example.ecomapp.service.OrderManager;
import com.example.ecomapp.model.order.Cart;
import com.example.ecomapp.model.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderManagerController {
    @Autowired
    OrderManager orderManager;

    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable String orderId) throws OrderNotFoundException {
        try {
            return orderManager.getOrder(orderId);
        } catch (RuntimeException e) {
            throw new OrderNotFoundException();
        }
    }

    @PostMapping("create/{userId}")
    public String createOrder(@PathVariable String userId, @RequestBody Cart cart) throws InvaliOrderReceived {
        return orderManager.createOrder(userId, cart);
    }

}
