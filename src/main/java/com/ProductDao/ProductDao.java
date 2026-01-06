package com.ProductDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ProductEntity.ProductEntity;
import com.ProductRepository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository pr;

	public String getAllProduct(List<ProductEntity> a) {
		pr.saveAll(a);
		return "Product details post save Successfully!!";
	}

	public List<ProductEntity> getAll() {
		return pr.findAll();
	}

}
