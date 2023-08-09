package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.demo.hotel.repository.modelo.CuentaBancaria;
import com.example.demo.hotel.service.ICuentaBancariaService;
import com.example.demo.hotel.service.IEstudianteService;
import com.example.demo.hotel.service.IMateriaService;
import com.example.demo.hotel.service.IMatriculaService;
import com.example.demo.hotel.service.ITransferenciaService;

@SpringBootApplication
@EnableAsync
public class Pa2U3P4HcJtApplication implements CommandLineRunner {

@Autowired
private IEstudianteService estudianteService;
@Autowired
private IMateriaService iMateriaService;
@Autowired
private IMatriculaService iMatriculaService;


@Autowired
private ICuentaBancariaService cuentaBancariaService;
	
@Autowired
private ITransferenciaService iTransferenciaService;


private static final Logger LOGGER = LoggerFactory.getLogger(Pa2U3P4HcJtApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	
	/*	
		 //Asincrono futuro sin respuesta

        List<CuentaBancaria> listaCuentas = new ArrayList<>();

        long tiempoInicial = System.currentTimeMillis();

        for (int i =0; i<=10; i++){

            CuentaBancaria cuentaBancaria = new CuentaBancaria();

            cuentaBancaria.setNumero(String.valueOf(i));

            cuentaBancaria.setTipo("Corriente");

            cuentaBancaria.setSaldo(new BigDecimal(2000));

            listaCuentas.add(cuentaBancaria);

           this.cuentaBancariaService.agregarAsincrono(cuentaBancaria);

        }

       

        //List<String> listaFinal = listaCuentas.parallelStream()

                //.map(cuenta ->this.cuentaBancariaService.agregarDos(cuenta))

                //.collect(Collectors.toList());

        

        //Cuando se mantiene una lista en el registro con funcionalidad forEach

        //Stream<String> listaFinal = listaCuentas.parallelStream().map(cuenta ->this.cuentaBancariaService.agregarDos(cuenta));

        //LOGGER.info("Se guardaron las siguientes cuentas: ");

        //listaFinal.forEach(cadena ->LOGGER.info(cadena));

       

        //Fin

        long tiempoFinal = System.currentTimeMillis();

        long tiempoTranscurrido = (tiempoFinal - tiempoInicial)/1000;

        LOGGER.info("Tiempo Transcurrido: "+(tiempoFinal - tiempoInicial));

        LOGGER.info("Tiempo Transcurrido: "+tiempoTranscurrido);

        LOGGER.info("Se termino de procesar todo");
  */      
        
        
        
        //Asincrono futuro con respuesta
        
        List<CuentaBancaria> listaCuentas = new ArrayList<>();

        long tiempoInicial = System.currentTimeMillis();

        List<CompletableFuture<String>> listaRespuestas= new ArrayList<>();
        for (int i =0; i<=10; i++){

            CuentaBancaria cuentaBancaria = new CuentaBancaria();

            cuentaBancaria.setNumero(String.valueOf(i));

            cuentaBancaria.setTipo("Corriente");

            cuentaBancaria.setSaldo(new BigDecimal(2000));

            listaCuentas.add(cuentaBancaria);

         CompletableFuture<String > respueta  =  this.cuentaBancariaService.agregarAsincrono2(cuentaBancaria);//asincrono con respuesta

         listaRespuestas.add(respueta); //se agregan todas las respuetas que estoy esperando
    
         
         
         
        }

        
        //sentencia que espera que se procesen todo los hilos para obtener la respueta
        CompletableFuture.allOf(listaRespuestas.get(0),listaRespuestas.get(1),
        		listaRespuestas.get(0),listaRespuestas.get(2),listaRespuestas.get(3),
        		listaRespuestas.get(4),listaRespuestas.get(5),listaRespuestas.get(6),
        		listaRespuestas.get(7),
        		listaRespuestas.get(8),listaRespuestas.get(9));
        
        LOGGER.info("Respueta 0: "+ listaRespuestas.get(0).get());

        
        
        long tiempoFinal = System.currentTimeMillis();

        long tiempoTranscurrido = (tiempoFinal - tiempoInicial)/1000;

        LOGGER.info("Tiempo Transcurrido: "+(tiempoFinal - tiempoInicial));

        LOGGER.info("Tiempo Transcurrido: "+tiempoTranscurrido);

        LOGGER.info("Se termino de procesar todo");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
			}
		
	}


