package com.example.demo.modelo;

import java.math.BigDecimal;

public class Vehiculo {

	private String Marca;
	private String Placa;
	private String Modelo;
	private BigDecimal precio;
	private String tipo;
	
	
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [Marca=" + Marca + ", Placa=" + Placa + ", Modelo=" + Modelo + ", precio=" + precio + ", tipo="
				+ tipo + "]";
	}
	
	

	
}
