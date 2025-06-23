/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.accounts.service;

import com.jackson.testing_monolith_single_maven.accounts.dto.AccountDto;
import com.jackson.testing_monolith_single_maven.accounts.entity.AccountEntity;
import com.jackson.testing_monolith_single_maven.accounts.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AccountService Class.
 * <p>
 * </p>
 *
 * @author
 */

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<AccountEntity> getAllAccounts() {
        return accountRepository.findAll();
    }

    public void createAccount(AccountDto accountDto) {

        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setAccountName(accountDto.getAccountName());
        accountEntity.setAccountBalance(accountDto.getAccountBalance());
        accountEntity.setAccountNo(accountDto.getAccountNo());

        accountRepository.save(accountEntity);
        System.out.println("success saved");

    }
}