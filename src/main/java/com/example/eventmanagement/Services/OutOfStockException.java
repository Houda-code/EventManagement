package com.example.eventmanagement.Services;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
