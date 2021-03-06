package com.mockict.discount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
public class DiscountApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DiscountApplication.class, args);
	}

}
