package com.sapient.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.accounts.model.Accounts;
import com.sapient.accounts.model.Customer;
import com.sapient.accounts.repository.AccountsRepository;

@RestController
public class AccountsController {
	@Autowired
	private AccountsRepository accountsRepository;
	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		
		Accounts accounts= accountsRepository.findByCustomerId(customer.getCustomerId());
		if(accounts!=null) {
			return accounts;
		}
		else {
			return null; 
		}
		
		
	}
}
