package com.electro.electro_app.infraestructure.Error.models.exception;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    } 
}
