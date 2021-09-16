package com.sapient.accounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.sapient.accounts.model.Accounts;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);
	

}
