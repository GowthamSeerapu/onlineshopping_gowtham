package com.gowtham.dao;

import com.online.customerlogin.CustomerLogin;
import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public interface CustomerLoginDAO {
	//public CustomerLogin getCustomerByName(String name) throws BusinessException;
	public CustomerLogin getCustomerByID(int id) throws BusinessException;
	public CustomerLogin getCustomerByEmail(String email) throws BusinessException;
	public int createCustomerLogin(CustomerDetails customerDetails) throws BusinessException;
}
