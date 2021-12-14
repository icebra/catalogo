package com.ceg.catalogo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceg.catalogo.exception.ResourceNotFoundException;
import com.ceg.catalogo.model.Catalogo;
import com.ceg.catalogo.service.CatalogoService;

@RestController
@RequestMapping("/catalogo")
public class CatalogoController {
	@Autowired
	private CatalogoService service;

	@PostMapping
	public Catalogo addCatalogo(@RequestBody Catalogo catalogo) {
		return service.save(catalogo);
	}

	@GetMapping("/{id}")
	public Optional<Catalogo> findCatalogoById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping("/{nome}")
	public Optional<List<Catalogo>> findProductByName(@PathVariable String nome) {
		return service.findByNome(nome);
	}

	@PutMapping
	public Catalogo updateCatalogo(@RequestBody Catalogo catalogo) {
		return service.save(catalogo);
	}

	@DeleteMapping("/{id}")
	public String deleteCatalogo(@PathVariable Long id) {
		return service.findById(id).map(c -> {
			service.deleteById(id);
			return "Catalogo removido";
		}).orElseThrow(() -> new ResourceNotFoundException("catalogoId " + id + " não encontrado"));
	}
}
