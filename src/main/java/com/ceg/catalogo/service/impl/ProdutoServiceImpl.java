package com.ceg.catalogo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceg.catalogo.model.Produto;
import com.ceg.catalogo.repository.ProdutoRepository;
import com.ceg.catalogo.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }
 
    @Override
    public void deleteById(Long id) {
    	produtoRepository.deleteById(id);
    }
 
    @Override
    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }
 
    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }
}
