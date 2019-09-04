package com.scb.validation;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

import org.springframework.util.StringUtils;

import com.scb.dto.CustomerDto;

public class Validation {
	
	public static final String LESS_AGE_MSG="We are regret to inform you that you are not meeting the criteria ....Your age is less than 20";
	public static final String GREATER_AGE_MSG="We are regret to inform you that you are not meeting the criteria ....Your age is greater than 60";
	public static final String SALARY_MSG="We are regret to inform you that you are not meeting the criteria ....Your salary is less than 20000";
	
	
	public static HashMap<? , ?> validate(CustomerDto customerDto){
	   HashMap map = new HashMap();
	   int age = calculateAge(customerDto.getDateOfBirth(),LocalDate.now());
		if(!StringUtils.isEmpty(customerDto)) {
			if(customerDto.getSalary()<20000)
				map.put(customerDto.getSalary(), SALARY_MSG);
			if (age<20) {
				map.put(age, LESS_AGE_MSG);
			if(age>60)	
				map.put(age, GREATER_AGE_MSG);
			}
		}
		return map;
	}
	
	public static int calculateAge(LocalDate birthDate,
			  LocalDate currentDate) {
		
		if(birthDate!=null && currentDate!=null)
			return Period.between(birthDate, currentDate).getYears();
		return 0;
	}

}
