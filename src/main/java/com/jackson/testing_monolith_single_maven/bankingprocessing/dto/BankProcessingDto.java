package com.jackson.testing_monolith_single_maven.bankingprocessing.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
public class BankProcessingDto {

    private String accountNo;

    private Long processAmount;


}
