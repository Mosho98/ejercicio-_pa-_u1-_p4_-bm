package com.example.demo.service;

import com.example.demo.modelo.Propietario;

public interface IPropietarioService {

	public void crear(Propietario propietario);
	public Propietario buscar(String cedula);
	public void eliminar(String cedula);
}
