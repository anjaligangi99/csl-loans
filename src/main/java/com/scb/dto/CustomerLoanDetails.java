package com.scb.dto;

import java.io.Serializable;
import java.util.List;

import com.scb.entity.Loan;

public class CustomerLoanDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer custId;
	private List<Loan> loans;
	
	
	public CustomerLoanDetails() {
		super();
	}
	public CustomerLoanDetails(Integer custId, List<Loan> loans) {
		super();
		this.custId = custId;
		this.loans = loans;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	@Override
	public String toString() {
		return "CustomerLoanDetails [custId=" + custId + ", loans=" + loans + "]";
	}
	
	

}
