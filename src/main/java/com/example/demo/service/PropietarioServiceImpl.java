package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.insertar(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(cedula);
	}

}
