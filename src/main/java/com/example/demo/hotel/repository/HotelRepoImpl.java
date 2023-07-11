package com.example.demo.hotel.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.hotel.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		//select * from Hotel h inner join Habitacion ha"
		// "on h.hote_id = ha.habi_id_hotel
		TypedQuery<Hotel> query= this.entityManager.createQuery("SELECT h FROM Hotel h JOIN  h.habitaciones ha", Hotel.class);
		//hago referencia a donde tengo mi relacion
		return query.getResultList();
	}

	
	
}
