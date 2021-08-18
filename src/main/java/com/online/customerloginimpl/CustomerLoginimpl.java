package com.online.customerloginimpl;

import java.sql.Connection;

import com.online.dao.dbutil.MySqlDbConnection;
import com.online.customerlogin.CustomerLogin;
import com.online.exception.BusinessException;

public class CustomerLoginimpl implements CustomerLogin {

	@Override
	public CustomerLogin getCustomerByName(String name) throws BusinessException {
		CustomerLogin customerLogin=null;
		if(name==null)
		{
			throw new BusinessException("Invalid Entry");
		}else {
			//code here to DAO
			
			}
		return customerLogin;
	}

	@Override
	public CustomerLogin getCustomerByID(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerLogin getCustomerByEmail(String email) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
