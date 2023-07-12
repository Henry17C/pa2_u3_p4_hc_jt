package com.example.demo;

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
	
		System.out.println("---RIGHT----");
		List<Hotel> hoteles= 	hotelService.buscarOuterRightJoin();
		
		for (Hotel hotel : hoteles) {
			System.out.println(hotel);
		}
		
		
		
		
		System.out.println("---LEFT----");
		List<Hotel> hoteles1= 	hotelService.buscarOuterLeftJoin();
		
		for (Hotel hotel : hoteles1) {
			System.out.println(hotel);
		}
		
		
		System.out.println("---LEFT----");
		List<Habitacion> habitaciones = this.hotelService.seleccionarHabitacionOuterLeftJoin();
		 for (Habitacion habitacion : habitaciones) {
			System.out.println(habitacion);
		}
		 
		 System.out.println("-----FULL JOIN-----");
		 List<Hotel> hot = this.hotelService.buscarOuterFullJoin();
	
		for (Hotel hotel : hot) 
			if(hotel==null) {
				System.err.println("no existe aun un hotel");
			
			}else {
				System.out.println(hotel.getNombre());
			}
		
		
		
		 System.out.println("-----WHERE JOIN-----");
		 List<Hotel> hott = this.hotelService.buscarWhereJoin();
	
		for (Hotel hotel : hott) 
			if(hotel==null) {
				System.err.println("no existe aun un hotel");
			
			}else {
				System.out.println(hotel);
			}
		
		
		
		
		
		
		
			}
		
	}


