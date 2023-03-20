package com.allandev.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allandev.cursomc.domain.Pedido;
import com.allandev.cursomc.repository.PedidoRepository;
import com.allandev.cursomc.service.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);

		return obj.orElseThrow(()-> 
			new ObjectNotFoundException("Objeto não encontrado id: " + id
					+ "Tipo: " + Pedido.class.getName()));
	}
}
