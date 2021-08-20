package com.online.service;

import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public interface CustomerService {
	
	
	public int createCustomerLogin(CustomerDetails customerDetails) throws BusinessException;
	  
}
