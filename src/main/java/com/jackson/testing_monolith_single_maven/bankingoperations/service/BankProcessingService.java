package com.jackson.testing_monolith_single_maven.bankingoperations.service;

import com.jackson.testing_monolith_single_maven.accounts.entity.AccountEntity;
import com.jackson.testing_monolith_single_maven.accounts.repository.AccountRepository;
import com.jackson.testing_monolith_single_maven.accounts.service.AccountService;
import com.jackson.testing_monolith_single_maven.bankingoperations.dto.BankProcessingDto;
import com.jackson.testing_monolith_single_maven.bankingoperations.enumerate.TransactionType;
import com.jackson.testing_monolith_single_maven.bankingoperations.exception.BankAccountNotFoundException;
import com.jackson.testing_monolith_single_maven.transactions.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankProcessingService {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private AccountRepository accountRepository;

    public void processWithdraw(BankProcessingDto bankProcessingDto) {
        AccountEntity account = accountRepository
                .findByAccountNo(bankProcessingDto.getAccountNo())
                .orElseThrow(() -> new BankAccountNotFoundException("No bank account found or incorrect account number"));

        Double processAmount = bankProcessingDto.getProcessAmount();

        account.setAccountBalance(account.getAccountBalance() - processAmount);
        accountRepository.save(account);

        transactionService.recordTransaction(account, processAmount, TransactionType.WITHDRAW, "Withdraw successfully");

    }

}
