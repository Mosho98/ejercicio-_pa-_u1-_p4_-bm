package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class valorMatriculaManual implements IValorMatricula{

	@Override
	public BigDecimal valorMatricula(BigDecimal valor) {
		
		BigDecimal val = valor.multiply(new BigDecimal(0.10));
		
		return val;
	}

}
