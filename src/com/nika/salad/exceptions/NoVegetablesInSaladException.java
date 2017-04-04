package com.nika.salad.exceptions;

/**
 * A custom user exception which is thrown if the salad is empty ( no vegetables are added to the salad) and it's impossible to continue work with the Salad object.
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
