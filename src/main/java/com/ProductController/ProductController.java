package com.ProductController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProductEntity.ProductEntity;
import com.ProductService.ProductService;

@RestController
@RequestMapping(value = "/product/api")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping(value = "/getAllProduct")
	public String getAllProduct(@RequestBody List<ProductEntity> a) {
		return ps.getAllProduct(a);
	}
	
	@GetMapping(value = "/getAll")
	public List<ProductEntity> getAll(){
		return ps.getAll();
	}
}
