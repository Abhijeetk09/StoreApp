package com.vibrantminds.stroreapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vibrantminds.stroreapp.dao.ProductRepository;
import com.vibrantminds.stroreapp.domain.Product;

@SpringBootApplication
public class StoreappApplication implements CommandLineRunner {

	@Autowired
	ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executing the SQL queries");

		repository.save(new Product(null, "TV", 20000.00, "Electronics", "LG"));
		repository.save(new Product(null, "LAPTOP", 10000.00, "Electronics", "SONY"));
		repository.save(new Product(null, "TV", 15000.00, "Electronics", "ONIDA"));
		repository.save(new Product(null, "MOBILE", 5000.00, "Electronics", "SAMSUNG"));
		repository.save(new Product(null, "MOBILE", 1500.00, "Electronics", "NOKIA"));
		repository.save(new Product(null, "MOBILE", 65000.00, "Electronics", "APPLE"));
		repository.save(new Product(null, "TV", 12000.00, "Electronics", "ONEPLUS"));
		repository.save(new Product(null, "FRIDGE", 120000.00, "Electronics", "WHIRLPOOL"));
		repository.save(new Product(null, "FRIDGE", 45000.00, "Electronics", "SAMSUNG"));
		repository.save(new Product(null,"Mouse",100.00,"Electronics","Targus"));
	}

}
