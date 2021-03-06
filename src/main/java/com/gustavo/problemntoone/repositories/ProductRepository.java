package com.gustavo.problemntoone.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gustavo.problemntoone.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("SELECT obj FROM Product obj JOIN FETCH obj.categories WHERE obj IN :products ")
	List<Product> findAllProductsAndCategories(List<Product> products);

}
