package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	

}
