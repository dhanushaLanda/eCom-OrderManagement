package com.example.ecomapp.model;

import java.util.HashMap;

public class Inventory {
    HashMap<Category, Product> categoryProductMap;
    Location location;
    User admin;

    public Inventory(HashMap<Category, Product> categoryProductMap, Location location, User admin) {
        this.categoryProductMap = categoryProductMap;
        this.location = location;
        this.admin = admin;
    }
}
