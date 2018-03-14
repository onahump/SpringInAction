package com.makingdevs.nahum

import lombok.Data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Data /* Genera getters,setters, el metodo toString(),  
		 metodo equals(), a hashCode() y todos sus constructores */
@Document /* Indica que la clase se puede almacenar en el almacen de 
			 datos de MongoDB*/

class Chapter{

	@Id  /*llave primaria del documento Mongo*/
	Integer id
	String name
}