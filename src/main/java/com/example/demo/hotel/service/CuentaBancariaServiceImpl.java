package com.example.demo.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.hotel.repository.ICuentaBancariaRepo;
import com.example.demo.hotel.repository.modelo.CuentaBancaria;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService  {

	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	
	@Autowired
	private IPruebaService iPruebaService;
	
	@Override
	//@Transactional(value = TxType.REQUIRED)//le decimos que esto es una transaccion, si no especifico por defecto es required

	public void insertar(CuentaBancaria cuentaBancaria) {
		System.out.println("Service: "+TransactionSynchronizationManager.isActualTransactionActive());//me dice si hay alguna transaccion activa
		bancariaRepo.insertar(cuentaBancaria);
		//this.iPruebaService.pueba();
		//this.iPruebaService.pueba2();
		//iPruebaService.pruebaNotSuppots();
		//iPruebaService.required();
		this.iPruebaService.requiresNew();

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

	@Override
	@Transactional(value = TxType.NEVER)//le decimos que esto es una transaccion, si no especifico por defecto es required

	public void prueba() {
		// TODO Auto-generated method stub
		System.err.println("hola");
	}


	
	
	
}
