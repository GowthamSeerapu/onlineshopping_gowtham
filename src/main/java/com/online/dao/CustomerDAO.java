package com.online.dao;

import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public interface CustomerDAO {
	
	public int createCustomerLogin(CustomerDetails customerDetails) throws BusinessException;

}
