package com.example.ecomapp.model.inventory;

import com.example.ecomapp.model.Location;
import com.example.ecomapp.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties
public class Inventory {
    HashMap<Category, List<Product>> categoryProductMap;
    Location location;
    User admin;

    public HashMap<Category, List<Product>> getCategoryProductMap() {
        return categoryProductMap;
    }

    public Inventory(@JsonProperty("categoryProductMap") HashMap<Category, List<Product>> categoryProductMap,
                     @JsonProperty("location") Location location,
                     @JsonProperty("user") User admin) {
        this.categoryProductMap = categoryProductMap;
        this.location = location;
        this.admin = admin;
    }
}
