package com.ceg.catalogo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceg.catalogo.model.Catalogo;
import com.ceg.catalogo.repository.CatalogoRepository;
import com.ceg.catalogo.service.CatalogoService;

@Service
public class CatalogoServiceImpl implements CatalogoService {
	@Autowired
	private CatalogoRepository catalogoRepository;
	
	@Override
    public Catalogo save(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }
 
    @Override
    public void deleteById(Long id) {
    	catalogoRepository.deleteById(id);
    }
 
    @Override
    public Optional<Catalogo> findById(Long id) {
        return catalogoRepository.findById(id);
    }
    
    @Override
    public Optional<List<Catalogo>> findByNome(String nome) {
        return catalogoRepository.findByNome(nome);
    }
 
    @Override
    public List<Catalogo> findAll() {
        return catalogoRepository.findAll();
    }
}
