package com.iac.service;

import java.util.List;

import com.iac.model.Account;

public interface AccountService {
	List<Account> getAllAccounts();
	
	void saveAccount(Account account);

}
