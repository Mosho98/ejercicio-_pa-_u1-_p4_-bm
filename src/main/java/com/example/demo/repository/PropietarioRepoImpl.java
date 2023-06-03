package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepository{

	
	List<Propietario> baseProp = new ArrayList<>();
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseProp.add(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		Propietario pro = new Propietario();
		
		for(Propietario prop :baseProp) {
			if(cedula.equals(prop.getCedula())) {
				pro=prop;
			}
		}
		return pro;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Propietario prop = this.buscar(cedula);
		baseProp.remove(prop);
	}

}
