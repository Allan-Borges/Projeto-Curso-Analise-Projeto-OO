package com.allandev.cursomc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allandev.cursomc.domain.Cliente;
import com.allandev.cursomc.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService service;
	
	@GetMapping("/{clientesId}")
	public ResponseEntity<?> find(@PathVariable Integer clientesId) {
		Cliente obj = service.buscar(clientesId);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
}
