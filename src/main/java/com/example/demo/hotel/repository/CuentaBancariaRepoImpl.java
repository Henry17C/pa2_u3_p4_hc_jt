package com.example.demo.hotel.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.hotel.repository.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		entityManager.persist(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		entityManager.merge(bancaria);
	}

	@Override
	public CuentaBancaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public CuentaBancaria seleccionarPorNumero(String numCuenta) {
		// TODO Auto-generated method stub
		
		TypedQuery<CuentaBancaria> query= this.entityManager.createQuery("Select c from CuentaBancaria c where c.numero= :numCuenta",CuentaBancaria.class);
		query.setParameter("numCuenta", numCuenta);
		
		return query.getSingleResult();
	}

}
