package com.example.demo.hotel.service;

import java.util.List;

import com.example.demo.hotel.repository.modelo.Hotel;

public interface IHotelService {
	
	public List<Hotel> buscarInnerJoin();
}
