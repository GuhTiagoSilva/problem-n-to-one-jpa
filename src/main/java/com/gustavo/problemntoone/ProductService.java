package com.gustavo.problemntoone;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gustavo.problemntoone.dto.ProductDTO;
import com.gustavo.problemntoone.entities.Product;
import com.gustavo.problemntoone.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	public Page<ProductDTO> findAllPaged(PageRequest pageRequest) {
		Page<Product> page = repository.findAll(pageRequest);
		repository.findAllProductsAndCategories(page.stream().collect(Collectors.toList()));
		return page.map(product -> new ProductDTO(product));
	}

}
