/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.transactions.repository;

import com.jackson.testing_monolith_single_maven.transactions.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * TransactionRepository Class.
 * <p>
 * </p>
 *
 * @author
 */
@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {

    @Query("SELECT t.transactionNo from TransactionEntity t ORDER BY t.transactionNo DESC")
    String findMaxTransactionNo();

}
