package com.example.demo.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel.repository.ICuentaBancariaRepo;
import com.example.demo.hotel.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService  {

	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		bancariaRepo.insertar(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		bancariaRepo.actualizar(bancaria);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		return bancariaRepo.seleccionar(id);
	}

	@Override
	public CuentaBancaria buscarPorNumero(String numCuenta) {
		// TODO Auto-generated method stub
		return bancariaRepo.seleccionarPorNumero(numCuenta);
	}

	
	
	
	
}
