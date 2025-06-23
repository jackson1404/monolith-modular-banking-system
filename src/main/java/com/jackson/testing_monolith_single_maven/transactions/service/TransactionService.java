/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.service;

import com.jackson.testing_monolith_single_maven.transactions.entity.TransactionEntity;
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
    private final List<TransactionEntity> transactions = new ArrayList<>();

    public List<TransactionEntity> getAllTransactions() {
        return transactions;
    }
}