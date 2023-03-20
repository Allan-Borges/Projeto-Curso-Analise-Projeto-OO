package com.allandev.cursomc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allandev.cursomc.domain.Pedido;
import com.allandev.cursomc.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
	@Autowired
	PedidoService service;
	
	@GetMapping("/{pedidoId}")
	public ResponseEntity<?> find(@PathVariable Integer pedidoId) {
		Pedido obj = service.buscar(pedidoId);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
}
