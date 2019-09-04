package com.scb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_loan")
public class CustomerLoan implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="id")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	@Column(name="loan_id")
	private Integer loadId;
	
	@Column(name="cust_id")
	private Integer custId;
	
	public CustomerLoan() {
		super();
	}
	
	public CustomerLoan(Integer loadId, Integer custId) {
		super();
		this.loadId = loadId;
		this.custId = custId;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLoadId() {
		return loadId;
	}
	public void setLoadId(Integer loadId) {
		this.loadId = loadId;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	
	

}
