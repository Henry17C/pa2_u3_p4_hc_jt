package com.example.demo.hotel.service;

import com.example.demo.hotel.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	
public void insertar(CuentaBancaria cuentaBancaria);
	
	public void actualizar(CuentaBancaria bancaria);
	
	public CuentaBancaria buscar(Integer id);
	public CuentaBancaria buscarPorNumero(String numCuenta);
	
	

}
