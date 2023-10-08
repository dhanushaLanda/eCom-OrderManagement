package com.example.ecomapp.model.inventory;

import lombok.Getter;

@Getter
public class FoodProduct extends Product {

    private WeightMeasure measure;

    public FoodProduct(String title, String description, String id, WeightMeasure weightMeasure, Category category) {
        super(title, description, id, weightMeasure,category);
    }

}
