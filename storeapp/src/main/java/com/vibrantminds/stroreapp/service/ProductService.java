package com.vibrantminds.stroreapp.service;

import java.util.List;

import com.vibrantminds.stroreapp.domain.Product;

public interface ProductService {

	public Product createProduct(Product product);

	public Product updateProduct(Product product);

	public Product getProduct(Integer id);

	public boolean deleteProduct(Integer id);

	public List<Product> getAllProducts();

}
