package com.mockict.model;

import javax.validation.constraints.DecimalMin;

public class Product {
	private String productType;
	@DecimalMin(value = "1.0",inclusive = true, message = "Price cannot be empty")
	private double productPrice;

	public Product() {
		super();
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}
