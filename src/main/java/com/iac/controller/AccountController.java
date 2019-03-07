package com.iac.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Account;
import com.iac.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;
    
    public AccountController(AccountService accountService) {
    	this.accountService = accountService;
    }

    @GetMapping
    public ResponseEntity getKlanten(){
        List<Account> accounts = accountService.getAllAccounts();
        if (accounts == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(accounts);
    }

    @PostMapping
    public void saveKlant(@RequestBody Account Account){
        System.out.println(Account == null);
        accountService.saveAccount(Account);;
    }
}
