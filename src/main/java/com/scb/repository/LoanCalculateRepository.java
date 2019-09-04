package com.scb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scb.entity.Loan;

@Repository
public interface LoanCalculateRepository extends JpaRepository<Loan, Integer>{

	@Query("from Loan where loanAmt <= :loanAmt")
	public List<Loan> showLoans(@Param("loanAmt") Float loanAmt);
	
	@Query(value = "SELECT li.loan_id,li.loan_amt,li.rate_of_interest,li.loan_tenure,li.loan_emi FROM loan_info li JOIN  cust_loan cl ON li.loan_id=cl.loan_id JOIN customers c ON cl.cust_id=c.id and c.phone_number = :phoneNumber", nativeQuery = true)
	public Loan getCustomerLoanDtlsByPhone(@Param("phoneNumber") String phoneNumber);
	
	
	

}
