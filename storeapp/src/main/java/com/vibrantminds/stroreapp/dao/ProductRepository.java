package com.vibrantminds.stroreapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vibrantminds.stroreapp.domain.Product;

@Repository
public interface ProductRepository extends  JpaRepository<Product, Integer>{

}
