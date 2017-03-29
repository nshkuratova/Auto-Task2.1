package com.nika.salad.exceptions;

/**
 * Created by nika_shkuratava on 3/20/2017.
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