package com.nika.salad.exceptions;

/**
 * Created by nika_shkuratava on 3/20/2017.
 */
public class WrongIngredientException extends Exception {

    public WrongIngredientException() {
    }

    public WrongIngredientException(String message) {
        super(message);

    }

    public WrongIngredientException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongIngredientException(Throwable cause) {
        super(cause);
    }

    public WrongIngredientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
