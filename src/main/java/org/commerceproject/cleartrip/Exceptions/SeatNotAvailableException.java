package org.commerceproject.cleartrip.Exceptions;

public class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String errorMessage) {
        super(errorMessage);
    }
}
