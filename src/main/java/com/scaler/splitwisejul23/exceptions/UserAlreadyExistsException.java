package com.scaler.splitwisejul23.exceptions;

public class UserAlreadyExistsException extends Exception {

    @Override
    public String getMessage() {
        return this.getClass().getSimpleName().toString();
    }
}
