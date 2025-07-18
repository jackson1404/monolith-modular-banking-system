/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.service;

import com.jackson.testing_monolith_single_maven.accounts.entity.AccountEntity;
import com.jackson.testing_monolith_single_maven.bankingoperations.enumerate.TransactionType;
import com.jackson.testing_monolith_single_maven.transactions.entity.TransactionEntity;
import com.jackson.testing_monolith_single_maven.transactions.repository.TransactionRepository;
import com.jackson.testing_monolith_single_maven.transactions.utils.TransactionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * TransactionService Class.
 * <p>
 * </p>
 *
 * @author
 */

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private TransactionUtils transactionUtils;

    public List<TransactionEntity> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public void recordTransaction(AccountEntity fromAccount, Double processAmount, TransactionType withdraw, String description) {

        TransactionEntity transaction = new TransactionEntity();
        transaction.setTransactionNo(transactionUtils.generateTransactionNo());
        transaction.setTransactionAmount(processAmount);
        transaction.setFromAccount(fromAccount.getAccountName());
        transaction.setTransactionDescription(description);
        transaction.setTransactionType(withdraw);

        transactionRepository.save(transaction);
    }


}