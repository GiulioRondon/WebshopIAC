package com.iac.service.implementatie;

import org.springframework.stereotype.Service;

import com.iac.model.Account;
import com.iac.repository.AccountRepo;
import com.iac.service.interfaces.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
	
	public final AccountRepo accountRepo;
	
	public AccountServiceImpl(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}
	
	@Override
	public List<Account> getAllAccounts(){
		return accountRepo.findAll();
	}

	@Override
	public void saveAccount(Account account) {
		accountRepo.save(account);
	}
}
