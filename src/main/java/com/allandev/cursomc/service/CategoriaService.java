package com.allandev.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allandev.cursomc.domain.Categoria;
import com.allandev.cursomc.repository.CategoriaRepository;
import com.allandev.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(()-> 
			new ObjectNotFoundException("Objeto não encontrado id: " + id
					+ "Tipo: " + Categoria.class.getName()));
	}
}
