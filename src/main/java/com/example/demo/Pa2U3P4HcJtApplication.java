package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.hotel.repository.modelo.CuentaBancaria;
import com.example.demo.hotel.repository.modelo.Estudiante;
import com.example.demo.hotel.repository.modelo.Habitacion;
import com.example.demo.hotel.repository.modelo.Hotel;
import com.example.demo.hotel.repository.modelo.Materia;
import com.example.demo.hotel.repository.modelo.Transferencia;
import com.example.demo.hotel.service.ICuentaBancariaService;
import com.example.demo.hotel.service.IEstudianteService;
import com.example.demo.hotel.service.IHotelService;
import com.example.demo.hotel.service.IMateriaService;
import com.example.demo.hotel.service.IMatriculaService;
import com.example.demo.hotel.service.ITransferenciaService;

@SpringBootApplication
public class Pa2U3P4HcJtApplication implements CommandLineRunner {

@Autowired
private IEstudianteService estudianteService;
@Autowired
private IMateriaService iMateriaService;
@Autowired
private IMatriculaService iMatriculaService;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

/*
		Estudiante estudiante= new Estudiante();
		
		estudiante.setApellido("Freire");
		estudiante.setCedula("12345");
		estudiante.setNombre("Fernado");
		
		estudianteService.ingresar(estudiante);
		
		
		Materia materia= new Materia();
		materia.setCodigo("H1");
		materia.setNombre("Historia del arte");
		materia.setNumeroCreditos(5);
		
		Materia materia1= new Materia();
		materia1.setCodigo("M1");
		materia1.setNombre("Matematicas");
		materia1.setNumeroCreditos(5);
		
		Materia materia2= new Materia();
		materia2.setCodigo("F1");
		materia2.setNombre("Fisica");
		materia2.setNumeroCreditos(5);
	
		iMateriaService.ingresar(materia);
		iMateriaService.ingresar(materia1);
		iMateriaService.ingresar(materia2);
		
		
		*/
		
		List<String> codigos= new ArrayList<>();
		codigos.add("H1");
		codigos.add("M1");
		
		codigos.add("F1");
		
		
		//Estudiante estudiante= this.estudianteService.buscarPorCedula("12345");
		//System.err.println(estudiante);
		
		
		//System.err.println(iMateriaService.buscarPorCodigo("H1"));
		
		iMatriculaService.matricular("12345", codigos);
		
		
		
		
		
		
		
		
		
		
			}
		
	}


