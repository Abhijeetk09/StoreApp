package com.vibrantminds.stroreapp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vibrantminds.stroreapp.domain.Product;
import com.vibrantminds.stroreapp.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductRestController {

	@Autowired
	private ProductService ps;
//	To get all the list of products
	@GetMapping
	public List<Product> getAllProducts() {
		return ps.getAllProducts();
	}
//	Search Product by id
	@GetMapping("/{productId}")
	public Product getProductById(@PathVariable("productId") Integer id) {

		return ps.getProduct(id);
	}
//	Delete product by id
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@DeleteMapping("/{productId}")
	public void deleteProductById(@PathVariable("productId") Integer id) {

		ps.deleteProduct(id);
	}
//	Update product
	@PutMapping("/{productId}")
	public Product updateProductById(@PathVariable("productId") Integer id, @RequestBody Product product) {

		return ps.updateProduct(product);
	}
//	add product
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Product addProduct(@RequestBody Product product) {

		return ps.createProduct(product);
	}
}
