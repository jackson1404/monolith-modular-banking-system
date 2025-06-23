/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.testing_monolith_single_maven.accounts.controller;

//import com.jackson.testing_monolith_single_maven.common.ApiResponse;
import com.jackson.testing_monolith_single_maven.accounts.dto.AccountDto;
import com.jackson.testing_monolith_single_maven.accounts.entity.AccountEntity;
import com.jackson.testing_monolith_single_maven.accounts.service.AccountService;
import com.jackson.testing_monolith_single_maven.common.api.ApiResponse;
import com.jackson.testing_monolith_single_maven.common.api.ResponseHandler;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * AccountController Class.
 * <p>
 * </p>
 *
 * @author
 */

@RestController
@RequestMapping("/api/account/")
public class AccountController extends ResponseHandler {

    private final ModelMapper modelMapper;

    private final AccountService accountService;

    public AccountController(ModelMapper modelMapper, AccountService accountService) {
        this.modelMapper = modelMapper;
        this.accountService = accountService;
    }

    @GetMapping("/getAllAccounts")
    public ResponseEntity<?> getAccounts() {
        List<AccountEntity> accounts = accountService.getAllAccounts();

        if (accounts.isEmpty()) return ok(Collections.EMPTY_LIST, "No Account Found!");

        String returnMessage = String.format("Fetched %d Account%s", accounts.size(), accounts.size()==1 ? "" : "s");

        return ok(accounts, returnMessage);
    }

    @PostMapping("/createAccount")
    public ResponseEntity<?> createAccount(@RequestBody AccountDto accountDto){
        accountService.createAccount(accountDto);
        return created("Successfully Created");
    }


//    @GetMapping("/all")
//    public ResponseEntity<ApiResponse<List<AccountDto>>> getAllAccounts() {
//
//        System.out.println("reach all ");
//        List<AccountDto> dto = accountService.getAllAccounts()
//                .stream()
//                .map(account -> modelMapper.map(account, AccountDto.class))
//                .toList();
//        System.out.println("dto list {} " + dto);
//
//        return ResponseEntity.ok(new ApiResponse<>())
//    }


}