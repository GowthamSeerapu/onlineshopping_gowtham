package com.online.dao;

import com.online.exception.BusinessException;
import com.online.model.ProductDetails;

public interface ProductDAO {
	
	public int createProductService(ProductDetails productDetails) throws BusinessException;
	

}
