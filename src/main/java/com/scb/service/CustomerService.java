package com.scb.service;

import java.lang.reflect.InvocationTargetException;

import org.springframework.web.bind.annotation.RequestParam;

import com.scb.dto.CustomerDto;
import com.scb.dto.CustomerLoanDetails;
import com.scb.entity.Loan;

public interface CustomerService {
	
	public CustomerLoanDetails saveCustomer(CustomerDto customerDto) throws IllegalAccessException, InvocationTargetException;
	
	public String saveCustomerLoans(Integer loanId, Integer custId);
	
	public Loan getCustomerLoanDtlsByPhone(@RequestParam String phoneNumber);

}
