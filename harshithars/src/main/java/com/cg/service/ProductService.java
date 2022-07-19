package com.cg.service;

import java.util.List;

import com.cg.entity.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	Product getProductById(int id);
	List<Product> getAllProducts();

}
