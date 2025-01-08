package com.scaler.productservice.exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message){
        super(message);     // pass message to runtime exception
    }
}
