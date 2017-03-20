package com.nika.salad.exceptions;

/**
 * Created by nika_shkuratava on 3/20/2017.
 */
public class NoVegetablesInSaladException extends Exception {
    public NoVegetablesInSaladException() {
    }

    public NoVegetablesInSaladException(String message) {
        super(message);
    }

    public NoVegetablesInSaladException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoVegetablesInSaladException(Throwable cause) {
        super(cause);
    }

    public NoVegetablesInSaladException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
