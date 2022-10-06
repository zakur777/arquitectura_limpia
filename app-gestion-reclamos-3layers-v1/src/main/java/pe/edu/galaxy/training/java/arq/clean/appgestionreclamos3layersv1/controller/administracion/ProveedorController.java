package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.controller.administracion;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.controller.generic.GenericController;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.administracion.ProveedorService;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.exceptions.ServiceException;
import static pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.controller.commons.APIConstant.API_PROVEEDOR;


@RequiredArgsConstructor
@RestController
@RequestMapping(API_PROVEEDOR)
public class ProveedorController extends GenericController{

	private final ProveedorService proveedorService;
	
	@GetMapping
	public ResponseEntity<?> findLikeObject() throws ServiceException{
		
		return ResponseEntity.ok(proveedorService.findLikeObject(null));
		
	}

}
