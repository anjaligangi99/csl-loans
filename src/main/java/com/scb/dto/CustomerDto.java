package com.scb.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.scb.entity.Gender;

public class CustomerDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Gender gender;
	
	private String firstName;
	
	private String lastname;
	
	private String panId;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dateOfBirth;
	
	private String phoneNumber;
	
	private String email;
	
	private String propertyType;
	
	private Float propertyValue;

	private Float salary;
	
	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "CustomerDto [firstName=" + firstName + ", lastname=" + lastname + ", panId="
				+ panId + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", propertyType=" + propertyType + ", propertyValue=" + propertyValue + ", gener=" + gender+ "]";
	}
	
	

}
