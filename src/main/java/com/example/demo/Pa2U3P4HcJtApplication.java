package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hotel.repository.modelo.Hotel;
import com.example.demo.hotel.service.IHotelService;

@SpringBootApplication
public class Pa2U3P4HcJtApplication implements CommandLineRunner {

@Autowired
private IHotelService hotelService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
		List<Hotel> hoteles= 	hotelService.buscarInnerJoin();
		
		for (Hotel hotel : hoteles) {
			System.out.println(hotel);
		}
		
	
		
		
	}

}
