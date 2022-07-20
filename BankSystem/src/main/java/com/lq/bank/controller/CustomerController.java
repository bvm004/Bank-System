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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lq.bank.service.AccountService;
import com.lq.bank.service.CustomerService;

@RestController
@RequestMapping("/api/customers")

public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List<Map> listOfAllCustomers() {
		
		return customerService.getAllCustomers() ;
	}
	
	@GetMapping("/{id}/accounts")
	public List<Map> listAllAccounts() {
		return customerService.getAllAccounts();
	}
	
	
	@GetMapping("/{id}")
	public List<Map> getCustomerInfo( @PathVariable("id") int userId ) {
		return customerService.getCustomerInfo();
	}
	
	@PostMapping
	public String createNewCustomer() {
		return "Soon Create";
	}
	
	@PutMapping("/{id}")
	public String updateCustomer() {
		return "Soon Update";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer() {
		return "Soon Delete";
	}

	
	
	
	
/*	
	@GetMapping
	public Map<String,List<Map>> listOfAllCustomers() {
		
		Map<String,List<Map>> returnData = new HashMap<String, List<Map>>();
		
		List<Map> customerList = new ArrayList<Map>();
		
		Map<String,Object> r1 = new HashMap();
		r1.put("name", "John");
		r1.put("family", "Doe");
		r1.put("age", 15);
		
		Map<String,Object> r2 = new HashMap();
		r2.put("name", "Jane");
		r2.put("family", "Doe");
		r2.put("age", 35);
		
		customerList.add(r1);
		customerList.add(r2);
		returnData.put("customers", customerList);
		return returnData;	
		
	}
	@GetMapping("/api/hello")
	public String hello() {
		
		return "Hello World";
		
	}
*/

}
