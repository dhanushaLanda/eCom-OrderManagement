package com.example.ecomapp.model;

import java.util.List;

public class FoodProduct extends Product{

    WeightMeasure measure;

    public FoodProduct(String title, String description, String id, WeightMeasure weightMeasure) {
        super(title, description, id);
        this.measure = weightMeasure;
    }

}
