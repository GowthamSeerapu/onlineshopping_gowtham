package com.online.service;

import java.util.List;

import com.online.exception.BusinessException;
import com.online.model.ProductDetails;

public interface ViewProductService {
	public ProductDetails getProductById(int id) throws BusinessException;

	public List<ProductDetails> getProductByName(String productname) throws BusinessException;

	public List<ProductDetails> getProductByPrice(int product_price) throws BusinessException;

	public List<ProductDetails> getProductByBrand(String product_brand) throws BusinessException;

	public List<ProductDetails> getProductByCatergory(String product_catergory) throws BusinessException;

	public List<ProductDetails> getAllProducts() throws BusinessException;

}
