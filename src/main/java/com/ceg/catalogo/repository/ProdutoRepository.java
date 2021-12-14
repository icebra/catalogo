package com.ceg.catalogo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceg.catalogo.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public Optional<Produto> findById(Long id);

	public List<Produto> findAll();
}
