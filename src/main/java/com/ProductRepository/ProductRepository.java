package com.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductEntity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
