package com.online.service.impl;

import com.online.dao.CustomerValidationDAO;
import com.online.dao.impl.CustomerValidationDAOImpl;
import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;
import com.online.service.CustomerValidationService;

public class CustomerValidationServiveImpl implements CustomerValidationService{
	CustomerValidationDAO customerValidationDAO=new CustomerValidationDAOImpl();

	public CustomerDetails isValidUser(String cust_email,String cust_password)throws BusinessException {
		CustomerDetails customerDetails1 = new CustomerDetails();
		customerDetails1 = customerValidationDAO.isValidUser(cust_email,cust_password);
		
		return customerDetails1;
	}

	
	

}
