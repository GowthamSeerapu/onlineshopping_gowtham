package com.online.service.impl;

import java.util.List;

import com.online.dao.ViewProductDAO;
import com.online.dao.impl.ViewProductDAOImpl;
import com.online.exception.BusinessException;
import com.online.model.ProductDetails;
import com.online.service.ViewProductService;

public class ViewProductServiceImpl implements ViewProductService {
	private ViewProductDAO viewProductDAO = new ViewProductDAOImpl();

	@Override
	public ProductDetails getProductById(int id) throws BusinessException {
		return null;
	}

	@Override
	public List<ProductDetails> getProductByName(String productname) throws BusinessException {
		// TODO Auto-generated method stub
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
		List<ProductDetails> productDetails = null;
		
			// code here to DAO
			productDetails = viewProductDAO.getAllProducts();

		return (List<ProductDetails>) productDetails;
	}

}
