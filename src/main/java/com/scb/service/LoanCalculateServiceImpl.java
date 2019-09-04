package com.scb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.entity.Loan;
import com.scb.repository.LoanCalculateRepository;

@Service
public class LoanCalculateServiceImpl implements LoanCalculateService{
	@Autowired
	private LoanCalculateRepository loanCalculateRepository;
	
	public String saveLoanDetails(Loan loan) {
	  String result = null;
	  
	  if(loanCalculateRepository.save(loan) != null) {
		  result = "Loan Details Saved Successfully";
	  }
	  else {
		  result = "Please try again later ...";
	  }
	  return result;
	}

}
