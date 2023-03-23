package com.edu.jwtplatformnew.exception;

public class ConcurrentRequestException extends Exception {
    public ConcurrentRequestException(String message) {
        super(message);
    }
}
