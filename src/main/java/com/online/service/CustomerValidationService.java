package com.online.service;

import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public interface CustomerValidationService {
	
	public CustomerDetails isValidUser(String cust_email,String cust_password) throws BusinessException;

}
