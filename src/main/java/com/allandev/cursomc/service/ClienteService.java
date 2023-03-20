package com.allandev.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allandev.cursomc.domain.Cliente;
import com.allandev.cursomc.repository.ClienteRepository;
import com.allandev.cursomc.service.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);

		return obj.orElseThrow(()-> 
			new ObjectNotFoundException("Objeto não encontrado id: " + id
					+ "Tipo: " + Cliente.class.getName()));
	}
}
