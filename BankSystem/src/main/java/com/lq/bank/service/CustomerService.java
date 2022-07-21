package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	public AccountService accountService;
	
	public Map buildCustomerInfo(Customer customer) {
		Map<String, Object> customerInfo = new HashMap<String, Object>();
		
		customerInfo.put("name", customer.getName());
		customerInfo.put("family", customer.getFamily());
		customerInfo.put("age", customer.getAge());
		customerInfo.put("customerId", customer.getId());
		
		return customerInfo;
	}
	
	
	public List<Map> getAllCustomers() {
		List<Map> customerList = new ArrayList<Map>();
		
		Branch branchA = new Branch(1, "Branch A");
		Branch branchB = new Branch(2, "Branch B");
		
		Customer c1 = new Customer(1, "Rodney", "Mckay", 50, branchA);
		Customer c2 = new Customer(2, "Ronnie", "Radke", 10, branchB);
		
		customerList.add(buildCustomerInfo(c1));
		customerList.add(buildCustomerInfo(c2));
		
		return customerList;
		
	}
	
		
	public List<Map> getAllAccounts() {
		
		List<Map> accountList = new ArrayList<Map>();
			
		Map<String, Object> accountInfo = new HashMap<String, Object>();
			
		Branch branchA = new Branch(1, "Branch A");
		Customer c1 = new Customer(1, "Rodney", "Mckay", 50, branchA);
			
		Account ac_1 = new Account(1, "Ch 1", AccountType.SAVINGS, branchA, c1);
			
		accountList.add(accountService.buildAccountInfo(ac_1));
			

		return accountList;
	}
	
	public List<Map> getCustomerInfo() {
		List<Map> customersList = new ArrayList<Map>();
		
		Branch branchA = new Branch(1, "Branch A");
		Customer c1 = new Customer(1, "Rodney", "Mckay", 50, branchA);
		
		customersList.add(buildCustomerInfo(c1));
		
		return customersList;

	}
		
}
