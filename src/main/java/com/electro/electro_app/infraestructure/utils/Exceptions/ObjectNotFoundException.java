package com.electro.electro_app.infraestructure.Utils.Exceptions;


public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException( ) {
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }
    public ObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
