package com.example.ecomapp.model.inventory;

import com.example.ecomapp.model.inventory.Measure;

public class WeightMeasure extends Measure {
    Double weight;
    Double price;

    public WeightMeasure(Double weight, Double price) {
        this.weight = weight;
        this.price = price;
    }
}
