package com.online.service.impl;

import java.sql.Connection;

import com.online.dao.CustomerDAO;
import com.online.dao.dbutil.MySqlDbConnection;
import com.online.dao.impl.CustomerDAOimpl;
import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;
import com.online.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
//implement

	@Override
	public int createCustomerLogin(CustomerDetails customerDetails) throws BusinessException {
//		CustomerDetails customerDetails = null;
		int w=0;
		if (customerDetails == null) {
			throw new BusinessException("Invalid Entry");
		} else {
			// code here to DAO
			CustomerDAO customerLoginDAO = new CustomerDAOimpl();
			w = customerLoginDAO.createCustomerLogin(customerDetails);
			// customerLogin=CustomerLoginDAO.getCustomerByName(name);
		}
		return w;

	}

}
