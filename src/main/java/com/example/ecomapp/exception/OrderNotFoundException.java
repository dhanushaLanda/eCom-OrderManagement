package com.example.ecomapp.exception;

public class OrderNotFoundException extends Exception {

    public String getMessage() {
        return "Could not find order";
    }
}
