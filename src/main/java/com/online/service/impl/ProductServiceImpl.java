package com.online.service.impl;

import com.online.dao.ProductDAO;
import com.online.dao.impl.ProductDAOimpl;
import com.online.exception.BusinessException;
import com.online.model.ProductDetails;
import com.online.service.ProductService;

public class ProductServiceImpl implements ProductService{
	private ProductDAO productDAO = new ProductDAOimpl();
	@Override
	public int createProductService(ProductDetails productDetails) throws BusinessException {
		int q=0;
		if(productDetails==null) {
			throw new BusinessException("Invalid Entry");
		}else {
			//code to DAO here
			ProductDAO ProductDAO = new ProductDAOimpl();
			q = ProductDAO.createProductService(productDetails);
		}
		return q;
	}

}
