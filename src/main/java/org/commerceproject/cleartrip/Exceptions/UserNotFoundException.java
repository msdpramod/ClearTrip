package org.commerceproject.cleartrip.Exceptions;

public  class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}