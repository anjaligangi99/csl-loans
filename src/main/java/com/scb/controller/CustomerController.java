package com.scb.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.dto.CustomerDto;
import com.scb.dto.CustomerLoanDetails;
import com.scb.entity.Loan;
import com.scb.service.CustomerService;
import com.scb.validation.Validation;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	private static final Logger logger = LogManager.getLogger(CustomerController.class);

	@PostMapping("/save")
	public ResponseEntity<?> saveCustomer(@RequestBody CustomerDto custDto) throws IllegalAccessException, InvocationTargetException {

		if (!StringUtils.isEmpty(custDto)) {
			logger.debug("enter into controller main logic");

			HashMap map = Validation.validate(custDto);
			if (map.size() > 0)
				return new ResponseEntity<Map<?, ?>>(map, HttpStatus.OK);
			return new ResponseEntity<CustomerLoanDetails>(customerService.saveCustomer(custDto), HttpStatus.CREATED);
		}
		return null;
	}

	@PostMapping("/saveLoans")
	public ResponseEntity<String> saveCustomerLoans(@RequestParam Integer loanId, Integer custId) {
		return new ResponseEntity<String>(customerService.saveCustomerLoans(loanId, custId), HttpStatus.CREATED);

	}

	@GetMapping("/searchLoans")
	public ResponseEntity<Loan> getCustomerLoanDtlsByPhone(@RequestParam String phoneNumber) {
		return new ResponseEntity<Loan>(customerService.getCustomerLoanDtlsByPhone(phoneNumber), HttpStatus.OK);
	}
}
