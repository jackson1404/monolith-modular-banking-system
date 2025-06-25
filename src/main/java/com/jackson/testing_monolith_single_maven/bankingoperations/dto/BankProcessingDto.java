package com.jackson.testing_monolith_single_maven.bankingoperations.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BankProcessingDto {

    private String accountNo;

    private Double processAmount;


}
