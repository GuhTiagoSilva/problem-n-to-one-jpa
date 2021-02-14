package com.gustavo.problemntoone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.problemntoone.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
