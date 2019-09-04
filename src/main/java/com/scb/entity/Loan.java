package com.scb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_info")
public class Loan implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	private Integer loadId;
	@Column(name = "loan_amt")
	private Float loanAmt;
	@Column(name = "rate_of_interest")
	private Float rateOfInterest;
	@Column(name = "loan_tenure")
	private Float tenure;
	@Column(name = "loan_emi")
	private Float emi;
	public Integer getLoadId() {
		return loadId;
	}
	
	public void setLoadId(Integer loadId) {
		this.loadId = loadId;
	}

	public Float getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(Float loanAmt) {
		this.loanAmt = loanAmt;
	}
	public Float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(Float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public Float getTenure() {
		return tenure;
	}
	
	public void setTenure(Float tenure) {
		this.tenure = tenure;
	}
	public Float getEmi() {
		return emi;
	}
	public void setEmi(Float emi) {
		this.emi = emi;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Loan [loadId=" + loadId + ",  loanAmt=" + loanAmt + ", rateOfInterest="
				+ rateOfInterest + ", tenure=" + tenure + ", emi=" + emi + "]";
	}
	
	

}
