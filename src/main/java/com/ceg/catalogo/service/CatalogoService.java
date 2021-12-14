package com.ceg.catalogo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ceg.catalogo.model.Catalogo;

@Service
public interface CatalogoService {
	Catalogo save(Catalogo catalogo);

	void deleteById(Long id);

	Optional<Catalogo> findById(Long id);
	
	Optional<List<Catalogo>> findByNome(String nome);

	List<Catalogo> findAll();
}
