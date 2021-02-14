package com.gustavo.problemntoone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.problemntoone.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
