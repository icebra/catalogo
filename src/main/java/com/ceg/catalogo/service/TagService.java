package com.ceg.catalogo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ceg.catalogo.model.Tag;

@Service
public interface TagService {
	Tag save(Tag tag);

	void deleteById(Long id);

	Optional<Tag> findById(Long id);

	List<Tag> findAll();
}
