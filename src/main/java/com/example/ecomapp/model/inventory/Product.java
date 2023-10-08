package com.example.ecomapp.model.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Product {
    String title;
    String description;
    String id;
    Category category;
    private Measure measure;

    public Product(@JsonProperty("title") String title,
                   @JsonProperty("description") String description,
                   @JsonProperty("id") String id,
                   @JsonProperty("measure") Measure measure,
                   @JsonProperty("category") Category category
                   ) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.measure = measure;
        this.category = category;
    }

}
