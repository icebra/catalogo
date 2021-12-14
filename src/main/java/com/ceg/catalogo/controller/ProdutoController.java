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
import com.ceg.catalogo.model.Produto;
import com.ceg.catalogo.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private ProdutoService service;
	
	@PostMapping
    public Produto addProduto(@RequestBody Produto produto) {
        return service.save(produto);
    }

    @GetMapping("/all")
    public List<Produto> findAllProdutos() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> findProdutoById(@PathVariable Long id) {
        return service.findById(id);
    }

//    @GetMapping("/{name}")
//    public Produto findProdutoByName(@PathVariable String name) {
//        return service.getProdutoByName(name);
//    }

    @PutMapping
    public Produto updateProduto(@RequestBody Produto produto) {
        return service.save(produto);
    }

    @DeleteMapping("/{id}")
    public String deleteProduto(@PathVariable Long id) {
    	return service.findById(id).map(p -> {
			service.deleteById(id);
			return "Produto removido";
		}).orElseThrow(() -> new ResourceNotFoundException("produtoId " + id + " não encontrado"));
	}
}
