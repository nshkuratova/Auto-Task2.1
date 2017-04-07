package com.nika.salad.exceptions;

/**
 * A custom user exception which is thrown when non-existent vegetable name was passed from the external source
 */
public class WrongVegetableException extends Exception {

    public WrongVegetableException() {
    }

    public WrongVegetableException(String message) {
        super(message);

    }

    public WrongVegetableException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongVegetableException(Throwable cause) {
        super(cause);
    }

    public WrongVegetableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
