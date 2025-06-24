package com.jackson.testing_monolith_single_maven.bankingprocessing.exception;

public class BankAccountNotFoundException extends RuntimeException {
    public BankAccountNotFoundException(String message) {
        super(message);
    }
}