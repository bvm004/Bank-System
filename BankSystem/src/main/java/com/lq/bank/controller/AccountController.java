package com.lq.bank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	/*
	 * checking => 1 savings => 2 salary => 3 credit => 4
	 */
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public List<Map<String,Object>> listAllAccounts() {
		
		return accountService.getAllAccounts();
	}
	
	@GetMapping("/{id}")
	public List<Map> getAccountInfo() {
		return accountService.getAccountInfo(null);
	}
	
	@PostMapping
	public String createNewAccount() {
		return "Soon Create";
	}
	
	@PutMapping("/{id}")
	public String updateAccount() {
		return "Soon Update";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAccount() {
		return "Soon Delete";
	}

	@PostMapping("/{id}/deposit")
	public String depositAccount() {
		return "Soon update";
	}
	@PostMapping("/{id}/withdrawal")
	public String withdrawalAccount() {
		return "Soon update";
	}
		
	
}
