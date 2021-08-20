package com.online.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.online.dao.ProductDAO;
import com.online.dao.dbutil.MySqlDbConnection;
import com.online.exception.BusinessException;
import com.online.model.ProductDetails;

public class ProductDAOimpl implements ProductDAO {
	private static Logger log = Logger.getLogger(ProductDAOimpl.class);
	
	@Override
	public int createProductService(ProductDetails productDetails) throws BusinessException {
		log.info("Inside createProductService");
		//log.info(productDetails);
		int p=0;
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="insert into productdetails(productname,product_price,product_brand,product_catergory) values(?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			log.debug(productDetails.getProductname());
			preparedStatement.setString(1, productDetails.getProductname());
			preparedStatement.setInt(2,productDetails.getProduct_price());
			preparedStatement.setString(3, productDetails.getProduct_brand());
			preparedStatement.setString(4, productDetails.getProduct_catergory());
			
			p=preparedStatement.executeUpdate();
		}catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return p;
	}
}
