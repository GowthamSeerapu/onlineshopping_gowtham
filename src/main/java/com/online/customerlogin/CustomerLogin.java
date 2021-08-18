package com.online.customerlogin;

import com.online.exception.BusinessException;

public interface CustomerLogin {
	
	public CustomerLogin getCustomerByName(String name) throws BusinessException;
	public CustomerLogin getCustomerByID(int id) throws BusinessException;
	public CustomerLogin getCustomerByEmail(String email) throws BusinessException;
	  
}
