package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
import com.example.demo.hotel.repository.modelo.Provincia;
import com.example.demo.hotel.repository.modelo.Semestre;
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

	
		Provincia provincia= new Provincia();
		provincia.setCantidadHabitantes(200.0);
		provincia.setNombre("pichincha");
		provincia.setSalarioPromedio(new BigDecimal(1000));
		
		
		Estudiante estudiante= new Estudiante();
		estudiante.setApellido("Lopez");
		estudiante.setCedula("555");
		estudiante.setNombre("Martin");
		estudiante.setProvincia(provincia);
		
	
		
		Semestre semestre= new Semestre();
		semestre.setFechaFin(LocalDateTime.now());
		semestre.setFechaInicio(LocalDateTime.now());
		semestre.setNivel(4);
		
		Materia materia= new Materia();
		materia.setCodigo("C1");
		materia.setNombre("Calculo");
		materia.setNumeroCreditos(30);
		materia.setSemestre(semestre);
		
		//iMateriaService.ingresar(materia);
		
		

		
		//estudianteService.ingresar(estudiante);
		
		
		
		List<String> codigos= new ArrayList<>();
		codigos.add("C1");
		
		
		
		
		iMatriculaService.matricular("555", codigos);
		
		
		
		
		
		
		
		
		
		
			}
		
	}


