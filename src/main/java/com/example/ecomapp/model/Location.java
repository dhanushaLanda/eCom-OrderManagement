package com.example.ecomapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    Double longitude;
    Double latitude;

    public Location(@JsonProperty("longitude") Double longitude,
                    @JsonProperty("latitude") Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
