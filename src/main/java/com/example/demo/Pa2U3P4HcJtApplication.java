package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hotel.repository.modelo.Habitacion;
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
	
		System.err.println("---INNER JOIN----");
		List<Hotel> hoteles= hotelService.buscarInnerJoin();
		
		for (Hotel hotel : hoteles) {
			System.out.println(hotel.getNombre());
			System.out.println("Tiene las siguiente habitaciones");
			
			for (Habitacion ha : hotel.getHabitaciones()) {
				System.out.println(ha.getNumero());
				
			}
			
		}
		
		
		
		System.err.println("---SQl Join Fetch ---  ");
		List<Hotel> hoteles1= 	hotelService.buscarJoinFetch();
		
		for (Hotel hotel : hoteles1) {
			System.out.println(hotel.getNombre());
			System.out.println("Tiene las siguiente habitaciones");
			
			for (Habitacion ha : hotel.getHabitaciones()) {
				System.out.println(ha.getNumero());
				
			}
			
		}
		
		
		
		
		Hotel hotel= new Hotel();
		Habitacion habitacion= new Habitacion();
		
		
		
		
		
		List<Habitacion> habitaciones=new ArrayList<>();
		habitaciones.add(habitacion);
		habitacion.setNumero("MX1");
		habitacion.setValor(new BigDecimal(200));
		
		
		hotel.setDireccion("AV.123");
		hotel.setNombre("Mexico");
		hotel.setHabitaciones(habitaciones);
		
		hotelService.guardar(hotel);
		
		
		
	
		
		
			}
		
	}


