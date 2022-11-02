package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.controllers.rest.generic;

import org.springframework.http.ResponseEntity;


public abstract class GenericController {

	protected ResponseEntity<?> noContent(){
		return ResponseEntity.noContent().build();
	}

}
