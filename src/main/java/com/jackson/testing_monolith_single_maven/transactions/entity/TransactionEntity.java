/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.entity;

import com.jackson.testing_monolith_single_maven.bankingoperations.enumerate.TransactionType;
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

    @Column(unique = true)
    private String transactionNo;

    private String fromAccount;

    private String toAccount;

    private String transactionDescription;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private Double transactionAmount;

}
