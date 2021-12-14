package com.ceg.catalogo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceg.catalogo.model.Tag;
import com.ceg.catalogo.repository.TagRepository;
import com.ceg.catalogo.service.TagService;

@Service
public class TagServiceImpl implements TagService {
	@Autowired
	private TagRepository tagRepository;

	@Override
	public Tag save(Tag tag) {
		return tagRepository.save(tag);
	}

	@Override
	public void deleteById(Long id) {
		tagRepository.deleteById(id);
	}

	@Override
	public Optional<Tag> findById(Long id) {
		return tagRepository.findById(id);
	}

	@Override
	public List<Tag> findAll() {
		return tagRepository.findAll();
	}
}
