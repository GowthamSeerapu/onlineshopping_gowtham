package com.online.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.online.dao.CustomerDAO;
import com.online.dao.dbutil.MySqlDbConnection;
import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public class CustomerDAOimpl implements CustomerDAO{
	private static Logger log = Logger.getLogger(CustomerDAOimpl.class);
	@Override
	public int createCustomerLogin(CustomerDetails customerDetails) throws BusinessException {
		
		int c=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into customer(cust_name,cust_email,cust_password) values(?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			//preparedStatement.setInt(1, customerDetails.getId());
			preparedStatement.setString(1, customerDetails.getCust_name());
			preparedStatement.setString(2,customerDetails.getCust_email());
			preparedStatement.setString(3, customerDetails.getCust_password());
			
			c=preparedStatement.executeUpdate();
		}catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return c;
	}
	
}
