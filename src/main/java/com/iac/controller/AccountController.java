package com.iac.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Account;
import com.iac.model.AccountRequest;
import com.iac.service.AccountService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController()
@RequestMapping("/accounts")
public class AccountController {
    
	private final AccountService accountService;
    
    public AccountController(AccountService accountService) {
    	this.accountService = accountService;
    }

    @GetMapping
    public ResponseEntity getAccounts(){
        List<Account> accounts = accountService.getAllAccounts();
        if (accounts == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(accounts);
    }

    @PostMapping("/create")
    //@RequestMapping(value = "/create",method=RequestMethod.POST)
    public void saveAccount(@RequestBody AccountRequest request /**@FormParam("email") String mail**/){
    	Account account = new Account();
    	account.setGebruikersnaam(request.getEmail());
    	account.setWachtwoord(request.getPassword());
    	
    	// accountService.saveAccount(account);
    	// System.out.println("hello");
        /*accountService.saveAccount(Account);*/
    }
}
