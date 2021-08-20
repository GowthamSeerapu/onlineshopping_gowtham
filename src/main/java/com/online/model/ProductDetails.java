package com.online.model;

public class ProductDetails {
	private int id;
	private int product_price;
	private String productname;
	private String product_brand;
	private String product_catergory;
	
	

	public ProductDetails(int product_price, String productname, String product_brand, String product_catergory) {
		super();
		this.product_price = product_price;
		this.productname = productname;
		this.product_brand = product_brand;
		this.product_catergory = product_catergory;
	}

	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}

	public String getProduct_catergory() {
		return product_catergory;
	}

	public void setProduct_catergory(String product_catergory) {
		this.product_catergory = product_catergory;
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", product_price=" + product_price + ", productname=" + productname
				+ ", product_brand=" + product_brand + ", product_catergory=" + product_catergory + "]";
	}

}
