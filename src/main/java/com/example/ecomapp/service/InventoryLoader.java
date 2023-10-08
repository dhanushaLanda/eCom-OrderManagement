package com.example.ecomapp.service;

import com.example.ecomapp.model.inventory.Inventory;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Paths;

public class InventoryLoader {
    public static Inventory loadDefaultInventory() throws IOException {
        String path = Paths.get("src/main/resources/defaultInventory.json").toAbsolutePath().toString();
        Inventory inventory = new ObjectMapper().readValue(new File(path), Inventory.class);
        return inventory;
    }
}
