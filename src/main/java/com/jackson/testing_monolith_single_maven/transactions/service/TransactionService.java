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


    private final List<TransactionEntity> transactions = new ArrayList<>();

    public List<TransactionEntity> getAllTransactions() {
        return transactions;
    }

    public void recordTransaction(AccountEntity account, Double processAmount, TransactionType withdraw, String withdraw_successfully) {
    }


}