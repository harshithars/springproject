package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository; 
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.findBy(id).get();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
