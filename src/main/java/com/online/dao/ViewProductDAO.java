package com.online.dao;

import java.util.List;

import com.online.exception.BusinessException;
import com.online.model.ProductDetails;

public interface ViewProductDAO {
	public ProductDetails getProductById(int id) throws BusinessException;

	//public List<ProductDetails> getAllProducts(int id) throws BusinessException;

	public List<ProductDetails> getProductByPrice(int product_price) throws BusinessException;

	public List<ProductDetails> getProductByBrand(String product_brand) throws BusinessException;

	public List<ProductDetails> getProductByCatergory(String product_catergory) throws BusinessException;

	List<ProductDetails> getProductByName(String productname) throws BusinessException;

	public List<ProductDetails> getAllProducts() throws BusinessException;

}
