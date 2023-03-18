package com.allandev.cursomc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allandev.cursomc.domain.Categoria;
import com.allandev.cursomc.service.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {
	
	@Autowired
	CategoriaService service;
	
	@GetMapping("/{categoriaId}")
	public ResponseEntity<?> find(@PathVariable Integer categoriaId) {
		Categoria obj = service.buscar(categoriaId);
		
		return ResponseEntity.ok().body(obj);
	}
}
