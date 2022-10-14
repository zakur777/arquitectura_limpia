package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.controller.administracion;

import static pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.controller.commons.APIConstant.API_PROVEEDOR;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.controller.generic.GenericController;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.administracion.ProveedorService;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.exceptions.InteractorException;


@RequiredArgsConstructor
@RestController
@RequestMapping(API_PROVEEDOR)
public class ProveedorController extends GenericController{

	private final ProveedorService proveedorService;
	
	@GetMapping
	public ResponseEntity<?> findLikeObject() throws InteractorException{
		
		return ResponseEntity.ok(proveedorService.findLikeObject(null));
		
	}
	
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody ProveedorDTO proveedorDTO) throws InteractorException{

		return ResponseEntity.status( HttpStatus.CREATED).body(proveedorService.save(proveedorDTO));
		
	}

}
