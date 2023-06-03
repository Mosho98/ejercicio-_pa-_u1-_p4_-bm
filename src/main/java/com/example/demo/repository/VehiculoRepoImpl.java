package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepository{

	List<Vehiculo> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		Vehiculo vehiculo = new Vehiculo();
	
		for(Vehiculo veh:baseDatos) {
			if(placa.equals(veh.getPlaca())) {
				vehiculo=veh;
			}
		}
		return vehiculo;
	}
	

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.buscar(placa);
		baseDatos.remove(vehiculo);
	}

}
