package ru.netology.rest.exception;

/**
 * @author Stanislav Rakitov
 */
public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}