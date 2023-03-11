package com.vibrantminds.stroreapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vibrantminds.stroreapp.dao.ProductRepository;
import com.vibrantminds.stroreapp.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Product createProduct(Product product) {

		return repository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {

		return repository.save(product);
	}

	@Override
	public Product getProduct(Integer id) {

		return repository.findById(id).get();
	}

	@Override
	public boolean deleteProduct(Integer id) {

		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<Product> getAllProducts() {

		return repository.findAll();
	}

}
