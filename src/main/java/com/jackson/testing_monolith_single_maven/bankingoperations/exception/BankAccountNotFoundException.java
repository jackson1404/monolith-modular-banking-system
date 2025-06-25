package com.jackson.testing_monolith_single_maven.bankingoperations.exception;

public class BankAccountNotFoundException extends RuntimeException {
    public BankAccountNotFoundException(String message) {
        super(message);
    }
}