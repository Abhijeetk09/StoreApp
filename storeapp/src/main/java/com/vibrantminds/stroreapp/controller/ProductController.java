package com.vibrantminds.stroreapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vibrantminds.stroreapp.domain.Product;
import com.vibrantminds.stroreapp.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;
	
//	Method to get all products
	@GetMapping("/list")
	public String index(Model model) {
		model.addAttribute("products", ps.getAllProducts());
		return "index";
	}
	
//	Method to delete product by id
	@GetMapping("/delete/{id}")
	public String index(@PathVariable("id") int id, Model model) {
		ps.deleteProduct(id);
		
		model.addAttribute("products", ps.getAllProducts());
		return "index";
	}
	
//	update product 
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
		
		model.addAttribute("product", ps.getProduct(id));
		return "editProduct";
	}
	
	@PostMapping("/update/{id}")
	public String updateProduct(@PathVariable("id") int id,Product product,  Model model) {
		ps.updateProduct(product);
		
		model.addAttribute("products", ps.getAllProducts());
		return "index";
	}
	
//	create product
	@GetMapping("/new")
	public String newProduct(Model model) {
		
		model.addAttribute("product", new Product());
		return "addProduct";
	}
	
	
	
//	
	@PostMapping("/add")
	public String addProduct(Product product,  Model model) {
		ps.createProduct(product);
		
		model.addAttribute("products", ps.getAllProducts());
		return "index";
	}

}
