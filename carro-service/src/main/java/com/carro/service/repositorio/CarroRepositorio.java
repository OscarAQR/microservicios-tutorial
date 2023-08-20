package com.carro.service.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carro.service.entidad.Carro;

public interface CarroRepositorio extends JpaRepository<Carro, Integer>{
	
	List<Carro> findByUsuarioId(int usuarioId);
}
