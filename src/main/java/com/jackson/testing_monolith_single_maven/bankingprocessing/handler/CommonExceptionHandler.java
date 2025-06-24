package com.jackson.testing_monolith_single_maven.bankingprocessing.handler;

import com.jackson.testing_monolith_single_maven.bankingprocessing.exception.BankAccountNotFoundException;
import com.jackson.testing_monolith_single_maven.common.api.ApiResponseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler extends ApiResponseHandler {

    @ExceptionHandler(BankAccountNotFoundException.class)
    public ResponseEntity<?> handleBankAccountNotFound(BankAccountNotFoundException e){
        return fail("Bank Account Not Found!");
    }


}
