package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {

	
	 final Logger LOG= LoggerFactory.getLogger(MetodosHighOrder.class);

public void metodo(IPersonaSupplier<String> funcion) {
	
	
	LOG.info("Hight Order supplier"+funcion.getId());
	
	

	
}


public static void metodoConsumer(IPersonaConsumer<String> funcion, String cadena) {
	
	 funcion.accept(cadena);
	
	
	
}



public static Boolean metodoPredicate(IPersonaPredicate<Integer> funcion,Integer num) {
	
	return funcion.evaluar(num);
	
}


public static String metodoFuntion(IPersonaFunction<String, Integer> funcion,Integer num) {
	
	return funcion.apply(num);
	
}

public static Integer metodoUnary(IPersonaUnaryOperator< Integer> funcion,Integer num) {
	
	return funcion.apply(num);
	
}




}
