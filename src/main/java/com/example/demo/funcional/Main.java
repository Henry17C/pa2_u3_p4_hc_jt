package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {


	private static final Logger LOG= LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IPersona persona= new PersonaImpl();
		persona.caminar();
		
		//1.SUPPLIER
		//clases
		
			IPersonaSupplier< String> supplier= new PersonaSupplierImpl();
			LOG.info("SUPPLIER CLASE:"+ supplier.getId());
		//lambdas
			IPersonaSupplier<String> supplier2= ()-> "1234";
			LOG.info("SUPPLIER LAMBDA:"+ supplier2.getId());
		
			IPersonaSupplier<String> supplier3= ()-> {
				
				String cedula="1234";
				cedula=cedula.concat("ZZZ");
				return cedula;
			};
			LOG.info("SUPPLIER LAMBDA2:"+ supplier3.getId());
		
		
		
	}

}
