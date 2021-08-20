package com.online.service;

//import java.util.List;

import com.online.exception.BusinessException;
import com.online.model.ProductDetails;

public interface ProductService {
	
	public int createProductService(ProductDetails productDetails) throws BusinessException;
}
