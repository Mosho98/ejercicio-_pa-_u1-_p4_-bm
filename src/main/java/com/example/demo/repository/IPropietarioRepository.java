package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario propietario);
	public Propietario buscar(String cedula);
	public void eliminar(String cedula);
	
}
