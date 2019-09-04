package com.scb.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "id")
	private Integer custId;
	
	@NotNull
	@Size(max=65)
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull
	@Size(max=65)
	@Column(name = "last_name")
	private String lastname;
	
	@NotNull
	@Size(max=10)
	@Column(name = "pan_id")
	private String panId;
	
	@Column(name="dob")
	@com.fasterxml.jackson.annotation.JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dateOfBirth;
	
	@Column(name = "phone_number")
	@Size(max=15)
	private String phoneNumber;
	
	@NotNull
	@Email
	@Column(unique = true)
	@Size(max = 100)
	private String email;
	
	@Column(name = "salary")
	private Float salary;
	
	@Enumerated(EnumType.STRING)
	@Column(length=10)
	private Gender gender;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="prop_id", referencedColumnName="prop_id")
	private Property property;
	
	public Customer() {
		
	}
	
	public Customer(Integer custId, @NotNull @Size(max = 65) String firstName, @NotNull @Size(max = 65) String lastname,
			@NotNull @Size(max = 10) String panId, LocalDate dateOfBirth, @Size(max = 15) String phoneNumber,
			@NotNull @Email @Size(max = 100) String email, @NotNull Integer age, Float salary, Gender gender,
			Property property) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.panId = panId;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.salary = salary;
		this.gender = gender;
		this.property = property;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
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

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
