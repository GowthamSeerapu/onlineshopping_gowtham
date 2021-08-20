package com.online.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.online.dao.CustomerValidationDAO;
import com.online.dao.dbutil.MySqlDbConnection;
import com.online.exception.BusinessException;
import com.online.model.CustomerDetails;

public class CustomerValidationDAOImpl implements CustomerValidationDAO{

	@Override
	public int customerValidateByPassword(String password) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CustomerDetails isValidUser(String cust_email,String cust_password) throws BusinessException {
		CustomerDetails customerDetails=new CustomerDetails();
		String email;
		String password;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="select cust_email,cust_password from customer where cust_email=? and cust_password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,cust_email);
			preparedStatement.setString(2,cust_password);
			ResultSet resultSet = preparedStatement.executeQuery();
		
			if(resultSet.next()) {
				 email=resultSet.getString("cust_email");
				password=resultSet.getString("cust_password");
				System.out.println(email);
				System.out.println(password);

				customerDetails.setCust_password(password);
				customerDetails.setCust_email(email);
			}
			else {
				System.out.println("Invalid Credentials. Please try again later");
				//throw new BusinessException("Entered Email id doesn't exist");
			}

		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return customerDetails;
	}
	
	
	

}
