package com.nika.salad.exceptions;

/**
 * A custom user exception which is thrown if wrong Vitamin type is entered by the user.
 */
public class WrongVitaminTypeException extends Exception {
    public WrongVitaminTypeException() {
    }

    public WrongVitaminTypeException(String message) {
        super(message);
    }

    public WrongVitaminTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongVitaminTypeException(Throwable cause) {
        super(cause);
    }

    public WrongVitaminTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
