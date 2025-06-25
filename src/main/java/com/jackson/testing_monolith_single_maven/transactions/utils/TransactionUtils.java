/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.utils;

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

public class TransactionUtils {

    public static String generateTransactionNo() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
        int random = new Random().nextInt(900) + 100;
        return "TXN" + timestamp + random;
    }
}