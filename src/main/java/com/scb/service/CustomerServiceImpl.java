package com.scb.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.scb.dto.CustomerDto;
import com.scb.dto.CustomerLoanDetails;
import com.scb.entity.Customer;
import com.scb.entity.CustomerLoan;
import com.scb.entity.Loan;
import com.scb.entity.Property;
import com.scb.repository.CustomerLoanRepository;
import com.scb.repository.CustomerRepository;
import com.scb.repository.LoanCalculateRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerLoanRepository custLoanRepository;
	
	@Autowired
	private LoanCalculateRepository loanRepository;

	@Override
	public CustomerLoanDetails saveCustomer(CustomerDto customerDto) throws IllegalAccessException, InvocationTargetException {
		Customer customer = new Customer();
		Property property = new Property();
		CustomerLoanDetails custLoanDetails = null;
		List<Loan> loans = null;
		if (customerDto!=null) {
			BeanUtils.copyProperties(customer, customerDto);
			BeanUtils.copyProperties(property, customerDto);
			customer.setProperty(property);
			Customer customer2=customerRepository.save(customer);
			Float loanAmt = (customerDto.getPropertyValue()*80)/100;
			loans = loanRepository.showLoans(loanAmt);
			custLoanDetails = new CustomerLoanDetails();
			custLoanDetails.setCustId(customer2.getCustId());
			custLoanDetails.setLoans(loans);
			
		}
			return custLoanDetails;
	}
	
	public String saveCustomerLoans(Integer loanId, Integer custId) {
		String result = null;
		CustomerLoan custLoan = null;
		if(loanId != null && custId != null) {
			custLoan = new CustomerLoan(loanId, custId);
			if(custLoanRepository.save(custLoan) != null)
			 result = "Customer Loan Details Saved Successfully.";
			else
				result = "Something went wrong, Could you please try again.";
		}
		
		return result;
		
	}

	@Override
	public Loan getCustomerLoanDtlsByPhone(String phoneNumber) {
		if (!StringUtils.isEmpty(phoneNumber)) {
			return loanRepository.getCustomerLoanDtlsByPhone(phoneNumber);
		}
		return null;
	}

}
