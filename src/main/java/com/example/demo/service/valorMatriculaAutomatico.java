package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automatico")
public class valorMatriculaAutomatico implements IValorMatricula{

	@Override
	public BigDecimal valorMatricula(BigDecimal valor) {
		BigDecimal val = valor.multiply(new BigDecimal(0.15));
		return val;
	}

}
