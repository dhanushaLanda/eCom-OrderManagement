package com.example.ecomapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    String name;
    String id;
    Location location;

    public User(@JsonProperty("name") String name,
                @JsonProperty("id") String id,
                @JsonProperty("location") Location location) {
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
