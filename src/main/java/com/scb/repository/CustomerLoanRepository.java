package com.scb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scb.entity.CustomerLoan;

public interface CustomerLoanRepository extends JpaRepository<CustomerLoan, Integer> {

	
	
}
