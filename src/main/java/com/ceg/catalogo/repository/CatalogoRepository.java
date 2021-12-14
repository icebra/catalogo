package com.ceg.catalogo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceg.catalogo.model.Catalogo;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
	public Optional<Catalogo> findById(Long id);

	public Optional<List<Catalogo>> findByNome(String nome);

	public List<Catalogo> findByIdProduto(Long idProduto);
}
