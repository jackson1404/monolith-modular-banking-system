/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * TransactionEntity Class.
 * <p>
 * </p>
 *
 * @author
 */
@Entity
@Table(name = "tbl_transactions")
@Data
@RequiredArgsConstructor
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private String transactionNo;

    private String fromAccount;

    private String toAccount;

    private Long transactionAmount;



}
