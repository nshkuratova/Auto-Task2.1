package com.nika.salad.exceptions;

/**
 * A custom user exception which is thrown if wrong sorting parameter is chosen by the user.
 */
public class WrongSortTypeException extends Exception {


    public WrongSortTypeException() {
    }

    public WrongSortTypeException(String message) {
        super(message);
    }

    public WrongSortTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongSortTypeException(Throwable cause) {
        super(cause);
    }

    public WrongSortTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}