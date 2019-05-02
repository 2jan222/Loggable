package com.github.jan222ik.exceptions;

/**
 * Loggerable Exception.
 * @author Janik Mayr on 27.09.2018
 */
public class LoggerableException extends RuntimeException {
    public LoggerableException(String message) {
        super(message);
    }
    public LoggerableException(String message, Throwable cause) {
        super(message, cause);
    }
}
