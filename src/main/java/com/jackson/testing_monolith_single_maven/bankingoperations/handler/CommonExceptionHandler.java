package com.jackson.testing_monolith_single_maven.bankingoperations.handler;

import com.jackson.testing_monolith_single_maven.bankingoperations.exception.BankAccountNotFoundException;
import com.jackson.testing_monolith_single_maven.common.api.ApiResponseHandler;
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
