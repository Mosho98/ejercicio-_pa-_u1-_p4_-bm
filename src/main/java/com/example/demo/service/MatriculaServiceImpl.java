package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.IVehiculoRepository;



@Service
public class MatriculaServiceImpl implements IMatriculaService{

	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Autowired
	@Qualifier("manual")
	private IValorMatricula iValorMatricula;
	
	List<Matricula> matricula = new ArrayList<>();
	@Override
	public void realizarMatricula(String identificacion, String placa) {
		
		Vehiculo ve=this.iVehiculoRepository.buscar(placa);
		Propietario pro = this.iPropietarioRepository.buscar(identificacion);
		BigDecimal valor = this.iValorMatricula.valorMatricula(ve.getPrecio());
		Matricula mat = new Matricula();
		mat.setPropietario(pro);
		mat.setVehiculo(ve);
		mat.setFechaMatricula(LocalDateTime.now());
		mat.setValorMatricula(valor);
		
	}



}
