package com.moto.service.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.moto.service.entidad.Moto;

public interface MotoRepositorio extends JpaRepository<Moto, Integer>{

	List<Moto> findByUsuarioId(int usuarioId);
}
