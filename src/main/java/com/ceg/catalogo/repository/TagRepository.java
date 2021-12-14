package com.ceg.catalogo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceg.catalogo.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
	public Optional<Tag> findById(Long id);

	public List<Tag> findAll();

	public List<Tag> findByTitulo(String titulo);

	public List<Tag> findByDescricao(String descricao);
}
