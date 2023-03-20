package com.allandev.cursomc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allandev.cursomc.domain.Categoria;
import com.allandev.cursomc.domain.Cidade;
import com.allandev.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
}