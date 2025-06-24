package com.jackson.testing_monolith_single_maven.bankingprocessing.service;

import com.jackson.testing_monolith_single_maven.accounts.entity.AccountEntity;
import com.jackson.testing_monolith_single_maven.accounts.repository.AccountRepository;
import com.jackson.testing_monolith_single_maven.accounts.service.AccountService;
import com.jackson.testing_monolith_single_maven.bankingprocessing.dto.BankProcessingDto;
import com.jackson.testing_monolith_single_maven.bankingprocessing.exception.BankAccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankProcessingService {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRepository accountRepository;

    public void processWithdraw(BankProcessingDto bankProcessingDto) {
        AccountEntity account = accountRepository
                .findByAccountNo(bankProcessingDto.getAccountNo())
                .orElseThrow(() -> new BankAccountNotFoundException("No bank account found or incorrect account number"));

        account.setAccountBalance(account.getAccountBalance() - bankProcessingDto.getProcessAmount());
        accountRepository.save(account);
    }

}
