package com.online.dao;

import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public interface CustomerValidationDAO {

	public int customerValidateByPassword(String password) throws BusinessException;

	public CustomerDetails isValidUser(String cust_email,String cust_password) throws BusinessException;//This is implemented

}
