package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hotel.repository.modelo.CuentaBancaria;
import com.example.demo.hotel.repository.modelo.Habitacion;
import com.example.demo.hotel.repository.modelo.Hotel;
import com.example.demo.hotel.repository.modelo.Transferencia;
import com.example.demo.hotel.service.ICuentaBancariaService;
import com.example.demo.hotel.service.IHotelService;
import com.example.demo.hotel.service.ITransferenciaService;

@SpringBootApplication
public class Pa2U3P4HcJtApplication implements CommandLineRunner {

@Autowired
private ITransferenciaService iTransferenciaService;
@Autowired
private ICuentaBancariaService bancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*
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
		
		*/
		CuentaBancaria bancaria= new CuentaBancaria();
		bancaria.setNumero("111");
		bancaria.setSaldo(new BigDecimal(600));
		bancaria.setTipo("A");
		
		CuentaBancaria bancaria1= new CuentaBancaria();
		bancaria1.setNumero("222");
		bancaria1.setSaldo(new BigDecimal(100));
		bancaria1.setTipo("B");
		
		bancariaService.insertar(bancaria1);
		bancariaService.insertar(bancaria);
	
	
		
		iTransferenciaService.transferir("111", "222", new BigDecimal(10));
		
		System.out.println("Reporte: ");
		List<Transferencia> transferencias  =iTransferenciaService.buscarTodos();
		for (Transferencia transferencia : transferencias) {
			System.out.println(transferencia);
		}
		
		
			}
		
	}


