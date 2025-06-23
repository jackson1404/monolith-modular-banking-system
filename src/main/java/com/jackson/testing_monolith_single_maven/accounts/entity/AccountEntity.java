/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.accounts.entity;

import com.jackson.testing_monolith_single_maven.accounts.dto.AccountDto;
import com.jackson.testing_monolith_single_maven.common.base.AuditableEntity;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

/**
 * AccountEntity Class.
 * <p>
 * </p>
 *
 * @author
 */
@Entity
@Table(name = "tbl_accounts")
public class AccountEntity extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private String accountNo;

    private String accountName;

    private Long accountBalance;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountEntity(){}

    public AccountEntity(Long accountId, String accountNo, String accountName, Long accountBalance) {
        this.accountId = accountId;
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
}
