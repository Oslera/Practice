package com.mockict.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mockict.Interface.DiscountServiceImpl;
import com.mockict.model.Product;

@Controller
public class DiscountController {
	@Autowired
	DiscountServiceImpl service;
	
	//@ResponseBody //Changes to html
	@RequestMapping (value = "/getDiscountedPrice", method = RequestMethod.GET)
	public String discountPage(@ModelAttribute Product product) {
		return "calculatediscount";
	}
	
	@RequestMapping (value = "/calculateDiscountedPrice", method = RequestMethod.POST)
	public String calculateDiscount(@Valid @ModelAttribute Product product, BindingResult result, ModelMap map) {
		double calculateDiscount = service.calculateDiscount(product);
		//Testing System.out.println(calculateDiscount);
		map.addAttribute("cost", calculateDiscount);
		if(result.hasErrors())
			return "calculatediscount";
		return "finalprice";
	}
	
	@ModelAttribute("productTypeList")
	public List<String> populateProductType(){
		List<String> list = new ArrayList<>();
		list.add("Electronics");
		list.add("Toys");
		list.add("Apparels");
		return list;
	}
}
