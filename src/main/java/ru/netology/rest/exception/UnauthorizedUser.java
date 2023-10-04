package ru.netology.rest.exception;

/**
 * @author Stanislav Rakitov
 */
public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}