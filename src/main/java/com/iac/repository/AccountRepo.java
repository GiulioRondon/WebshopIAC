package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iac.model.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {
}
