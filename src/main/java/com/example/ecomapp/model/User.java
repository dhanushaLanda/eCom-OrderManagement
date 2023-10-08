package com.example.ecomapp.model;

public class User {
    String name;
    String id;
    Location location;

    public User(String name, String id, Location location) {
        this.name = name;
        this.id = id;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }
}
