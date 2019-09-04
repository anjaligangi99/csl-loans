package com.scb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cust_properties")
public class Property implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prop_id")
	private Integer propertyId;
	
	@Column(name = "cust_property_type")
	@NotNull
	private String propertyType;
	
	@NotNull
	@Column(name = "cust_property_value")
	private Float propertyValue;
	
	@OneToOne(mappedBy="property")
	private Customer customer;

	public Property() {
		super();
	}

	public Property(Integer propertyId, @NotNull String propertyType, @NotNull Float propertyValue, Customer customer) {
		super();
		this.propertyId = propertyId;
		this.propertyType = propertyType;
		this.propertyValue = propertyValue;
		this.customer = customer;
	}

	public Integer getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public Float getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(Float propertyValue) {
		this.propertyValue = propertyValue;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
  }
