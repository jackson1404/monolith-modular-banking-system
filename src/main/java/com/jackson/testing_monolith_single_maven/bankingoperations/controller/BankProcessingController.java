package com.jackson.testing_monolith_single_maven.bankingoperations.controller;

import com.jackson.testing_monolith_single_maven.bankingoperations.dto.BankProcessingDto;
import com.jackson.testing_monolith_single_maven.bankingoperations.service.BankProcessingService;
import com.jackson.testing_monolith_single_maven.common.api.ApiResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankProcessingController extends ApiResponseHandler {

    @Autowired
    private BankProcessingService bankProcessingService;

    @PostMapping("/withdraw")
    public ResponseEntity<?> bankWithdraw(@RequestBody BankProcessingDto bankProcessingDto){

        bankProcessingService.processWithdraw(bankProcessingDto);
        return ok(null, "Withdraw Successfully");
    }

    @PostMapping("/deposit")
    public ResponseEntity<?> processDeposit(@RequestBody BankProcessingDto bankProcessingDto){
        bankProcessingService.processDeposit(bankProcessingDto);
        return ok(null,"Deposit Successfully");
    }



}
