package com.nika.salad.exceptions;

/**
 * A custom user exception which is thrown if wrong searching parameter is chosen by the user.
 */
public class WrongSearchTypeException extends Exception {
    public WrongSearchTypeException() {
    }

    public WrongSearchTypeException(String message) {
        super(message);
    }

    public WrongSearchTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongSearchTypeException(Throwable cause) {
        super(cause);
    }

    public WrongSearchTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
