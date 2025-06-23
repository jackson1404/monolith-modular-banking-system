/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.controller;

import com.jackson.testing_monolith_single_maven.transactions.entity.TransactionEntity;
import com.jackson.testing_monolith_single_maven.transactions.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TransactionController Class.
 * <p>
 * </p>
 *
 * @author
 */
@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<TransactionEntity> getTransactions() {
        return transactionService.getAllTransactions();
    }
}
