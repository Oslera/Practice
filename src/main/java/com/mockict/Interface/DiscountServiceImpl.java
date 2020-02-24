package com.mockict.Interface;

import org.springframework.stereotype.Service;

import com.mockict.model.Product;

@Service
public class DiscountServiceImpl implements DiscountServiceInterface {
	
	@Override
	public double calculateDiscount(Product product) {
		
		String type = product.getProductType();
		double price = product.getProductPrice();
		double amount = 0;
		if(type.equalsIgnoreCase("Electronics"))
			amount=price-(price*0.25);
		else if(type.equalsIgnoreCase("Toys"))
			amount=price-(price*0.5);
		else if(type.equalsIgnoreCase("Apparels"))
			amount=price-(price*0.1);
		return amount;
	}

}
