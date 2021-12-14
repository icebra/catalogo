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
import com.ceg.catalogo.model.Tag;
import com.ceg.catalogo.service.TagService;

@RestController
@RequestMapping("/tag")
public class TagController {
	@Autowired
	private TagService service;

	@PostMapping
	public Tag addTag(@RequestBody Tag tag) {
		return service.save(tag);
	}

	@GetMapping("/all")
	public List<Tag> findAllTags() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Tag> findTagById(@PathVariable Long id) {
		return service.findById(id);
	}

//    @GetMapping("/{name}")
//    public Tag findTagByName(@PathVariable String name) {
//        return service.getTagByName(name);
//    }

	@PutMapping
	public Tag updateTag(@RequestBody Tag tag) {
		return service.save(tag);
	}

	@DeleteMapping("/{id}")
	public String deleteTag(@PathVariable Long id) {
		return service.findById(id).map(p -> {
			service.deleteById(id);
			return "Tag removido";
		}).orElseThrow(() -> new ResourceNotFoundException("tagId " + id + " não encontrado"));
	}
}
