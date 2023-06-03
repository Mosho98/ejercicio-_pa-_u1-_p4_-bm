package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4BmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4BmApplication.class, args);
	}

	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Chevrolet");
		v1.setModelo("Sail");
		v1.setPlaca("123");
		v1.setPrecio(new BigDecimal(5000));
		v1.setTipo("manual");
		this.iVehiculoService.crear(v1);
		
		
		
		
		this.iVehiculoService.actualizar(v1);
		
		
		Propietario p1 = new Propietario();
		p1.setNombre("Bryan");
		p1.setApellido("Mullo");
		p1.setCedula("1753054285");
		p1.setFechaNacimiento(LocalDateTime.now());
		this.iPropietarioService.crear(p1);
		
		Matricula m1 = new Matricula();
		m1.setPropietario(p1);
		m1.setVehiculo(v1);
		
		System.out.println(m1);
	}

}
