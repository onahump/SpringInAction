package com.makingdevs.nahum

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam	
import org.springframework.web.bind.annotation.GetMapping

@RestController /* Significa que no queremos renderear vistas 
				   pero queremos escribir un resultado*/
class HomeController{

	@GetMapping /* Por defecto mapea la ruta raiz("/")  */
	
	/*El metodo induca que necesita una respuesta via HTTP
	  pero si esta viene vacia no pasa nada*/
	String greeting(@RequestParam(required = false , 
		defaultValue = "") String name){
		name.equals("") ? "Hey!" : "Hey, " + name + "!" 
		/* http://localhost:8080?name=Greg
		   Si el nombre es igual a "" entonce imprime "Hey!" 
		   si el nombre con valor entonces "Hey, <<nombre>>!"
	}
}