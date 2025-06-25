/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.utils;

import com.jackson.testing_monolith_single_maven.transactions.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * TransactionUtils Class.
 * <p>
 * </p>
 *
 * @author
 */
@Component
public class TransactionUtils {

    // comment
    @Autowired
    private TransactionRepository transactionRepository;

    public String generateTransactionNo() {

        String maxNumber = transactionRepository.findMaxTransactionNo();

        int nextNumber = 1;

        if(maxNumber!= null){
            String numericPart = maxNumber.substring(3);
            int currentNumber = Integer.parseInt(numericPart);
            nextNumber = currentNumber + 1;
        }

        return "TXN" + String.format("%08d" , nextNumber); // TXN00000001
    }
}