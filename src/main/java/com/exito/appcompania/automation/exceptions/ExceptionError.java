package com.exito.appcompania.automation.exceptions;

public class ExceptionError extends AssertionError {

    public ExceptionError(String message, Throwable cause) {
        super(message, cause);
    }
}