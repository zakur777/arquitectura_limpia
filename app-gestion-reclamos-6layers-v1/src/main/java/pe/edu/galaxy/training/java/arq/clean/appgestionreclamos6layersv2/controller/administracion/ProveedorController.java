package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.controller.administracion;

import static pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.controller.commons.APIConstant.API_PROVEEDOR;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.controller.generic.GenericController;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.administracion.ProveedorService;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.exceptions.ServiceException;


@RequiredArgsConstructor
@RestController
@RequestMapping(API_PROVEEDOR)
public class ProveedorController extends GenericController{

	private final ProveedorService proveedorService;
	
	@GetMapping
	public ResponseEntity<?> findLikeObject() throws ServiceException{
		
		return ResponseEntity.ok(proveedorService.findLikeObject(null));
		
	}
	
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody ProveedorDTO proveedorDTO) throws ServiceException{

		return ResponseEntity.status( HttpStatus.CREATED).body(proveedorService.save(proveedorDTO));
		
	}

}
