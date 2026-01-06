package com.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProductDao.ProductDao;
import com.ProductEntity.ProductEntity;

@Service
public class ProductService {

	@Autowired
	ProductDao pd;
	
	public String getAllProduct(List<ProductEntity> a) {
		return pd.getAllProduct(a);
	}

	public List<ProductEntity> getAll() {
		return pd.getAll();
	}

}
