package com.online.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.online.dao.dbutil.MySqlDbConnection;
import com.online.dao.ViewProductDAO;
import com.online.exception.BusinessException;
import com.online.model.ProductDetails;

public class ViewProductDAOImpl implements ViewProductDAO {
	private static Logger log = Logger.getLogger(ViewProductDAOImpl.class);

	@Override
	public ProductDetails getProductById(int id) throws BusinessException {
		// ProductDetails productDetails = null;

		return null;
	}

	@Override
	public List<ProductDetails> getProductByName(String productname) throws BusinessException {

		return null;
	}

	@Override
	public List<ProductDetails> getProductByPrice(int product_price) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetails> getProductByBrand(String product_brand) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetails> getProductByCatergory(String product_catergory) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetails> getAllProducts() throws BusinessException {
		List<ProductDetails> productList = new ArrayList<>();
		try (Connection connection = MySqlDbConnection.getConnection()) {
			String sql = "select id,productname,product_price,product_brand,product_catergory from productdetails";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//int id = 0;
			//preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ProductDetails productDetails = new ProductDetails();
				productDetails.setId(resultSet.getInt("id"));
				productDetails.setProductname(resultSet.getString("productname"));
				productDetails.setProduct_price(resultSet.getInt("product_price"));
				productDetails.setProduct_brand(resultSet.getString("product_brand"));
				productDetails.setProduct_catergory(resultSet.getString("product_catergory"));
				productList.add(productDetails);
			}
		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return productList;
	}

}
