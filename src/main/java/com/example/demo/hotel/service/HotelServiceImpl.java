package com.example.demo.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotel.repository.IHotelRepo;
import com.example.demo.hotel.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public List<Hotel> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return hotelRepo.seleccionarInnerJoin();
	}

	
	

}
