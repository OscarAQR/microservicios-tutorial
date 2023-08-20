package com.carro.service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.service.entidad.Carro;
import com.carro.service.repositorio.CarroRepositorio;

@Service
public class CarroServicie {
	
	@Autowired
	private CarroRepositorio carroRepositorio;
	
	public List<Carro> getAll(){
		return carroRepositorio.findAll();
	}
	
	public Carro getCarrobyId(int id) {
		return carroRepositorio.findById(id).orElse(null);
	}
	
	public Carro save(Carro carro) {
		Carro nuevoCarro = carroRepositorio.save(carro);
		return nuevoCarro;
	}
	
	public List<Carro> byUsuarioId(int usuarioId){
		return carroRepositorio.findByUsuarioId(usuarioId);
	}
	
}