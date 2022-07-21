package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class AccountService {
	
	public Map<String,Object> buildAccountInfo(Account account) {
		Map<String, Object> accountInfo = new HashMap<String, Object>();
		
		accountInfo.put("accountId", account.getId());
		accountInfo.put("type", account.getType());
		accountInfo.put("balance", 1500.98);
		accountInfo.put("customerId", account.getCustomer().getId());
		accountInfo.put("label", account.getLabel());
		accountInfo.put("branchId", account.getBranch().getId());
		
		return accountInfo;
	}

	public List<Map<String,Object>> getAllAccounts() {
		List<Map<String,Object>> accountList = new ArrayList<Map<String,Object>>();
		
		Branch branchA = new Branch(1, "Branch A");
		Branch branchB = new Branch(2, "Branch B");
		
		Customer c1 = new Customer(1, "Rodney", "Mckay", 50, branchA);
		Customer c2 = new Customer(1, "Ronnie", "Radke", 10, branchB);
		
		Account ac_1 = new Account(1, "Ch 1", AccountType.SAVINGS, branchA, c1);
		Account ac_2 = new Account(2, "Ch 2", AccountType.CHECKING, branchB, c2);
		
		accountList.add(buildAccountInfo(ac_1));
		accountList.add(buildAccountInfo(ac_1));
		
		return accountList;
	
	}
	public List<Map> getAccountInfo(Account account){
		List<Map> accountList = new ArrayList<Map>();
		Branch branchA = new Branch(1, "Branch A");
		
		Customer c1 = new Customer(1, "Rodney", "Mckay", 50, branchA);
		
		Account ac_1 = new Account(1, "Ch 1", AccountType.SAVINGS, branchA, c1);
		
		accountList.add(buildAccountInfo(ac_1));
		

		return accountList;
	}
	
}
