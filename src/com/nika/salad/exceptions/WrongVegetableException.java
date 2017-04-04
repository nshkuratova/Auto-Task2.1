package com.nika.salad.exceptions;

/**
 * Created by nika_shkuratava on 3/20/2017.
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
