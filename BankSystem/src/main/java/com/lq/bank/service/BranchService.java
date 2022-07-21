package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.bank.data.BranchRepository;
import com.lq.bank.model.Branch;

@Service
public class BranchService {
	
	@Autowired
	private BranchRepository branchRepository;
	
	public void newBranch(String name) {
		Branch newBranch = new Branch(name);
		branchRepository.save(newBranch);
	}
	
	public List<Map<String, Object>> getAllBranches() {
		
		List<Map<String,Object>> branchList = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> branchInfo = new HashMap<String, Object>();
		
		Branch branchA = new Branch(1, "Branch A");
		
		branchInfo.put("name", branchA.getName());
		branchInfo.put("branchId", branchA.getId());
		
		Map<String, Object> branchInfo2 = new HashMap<String, Object>();

		Branch branchB = new Branch(2, "Branch B");
		
		branchInfo2.put("name", branchB.getName());
		branchInfo2.put("branchId", branchB.getId());
		
		branchList.add(branchInfo);
		branchList.add(branchInfo2);
		
		return branchList;
	}
	
	
	
	
	
}
