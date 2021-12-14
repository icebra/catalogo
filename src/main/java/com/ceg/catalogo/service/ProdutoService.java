package com.ceg.catalogo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ceg.catalogo.model.Produto;

@Service
public interface ProdutoService {
	Produto save(Produto product);

	void deleteById(Long id);

	Optional<Produto> findById(Long id);

	List<Produto> findAll();
}
