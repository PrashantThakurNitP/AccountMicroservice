package com.sapient.accounts.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity//means map to db table, jpa will treat this as pojo represntation of table
@Getter @Setter @ToString
public class Accounts {
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="account_number")
	@Id
	private long accountNumber;
	@Column(name="account_type")
	private String accountType;
	@Column(name="branch_address")
	private String branchAddress;
	@Column(name="created_dt")
	private LocalDate createDt;

}
