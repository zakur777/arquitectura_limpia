package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.controllers.rest.administracion;

import static pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.controllers.rest.commons.APIConstant.API_PROVEEDOR;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.controllers.rest.generic.GenericController;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.input.ProveedorQueryUseCase;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.interactors.exceptions.InteractorException;
import static java.util.Objects.isNull;


@RequiredArgsConstructor
@RestController
@RequestMapping(API_PROVEEDOR)
public class ProveedorController extends GenericController{

	private final ProveedorQueryUseCase proveedorQueryUseCase;
	// Http Code Response
	// Swagger
	
	@GetMapping
	public ResponseEntity<?> findByAllActivos() throws InteractorException{
		
		List<ProvedorBasicResponseModel> lst=	 proveedorQueryUseCase.findByAllActivos();
		
		if (isNull(lst) || lst.isEmpty()) {
			//return ResponseEntity.noContent().build();
			return super.noContent();
		}
		
		return ResponseEntity.ok(lst);
		
	}
	
	@GetMapping("razon-social")
	public ResponseEntity<?> findByLikeRazonSocial(@RequestParam(value = "razonSocial", defaultValue = "") String razonSocial ) throws InteractorException{
		
		List<ProvedorResponseModel> lst=	 proveedorQueryUseCase.findByLikeRazonSocial(razonSocial);
		
		if (isNull(lst) || lst.isEmpty()) {
			//return ResponseEntity.noContent().build();
			return super.noContent();
		}
		
		return ResponseEntity.ok(lst);
		
	}
	
	@GetMapping("text")
	public ResponseEntity<?> findByAllActivosText() throws InteractorException{
		
		List<String> lst=	 proveedorQueryUseCase.findByAllActivosText();
		
		if (isNull(lst) || lst.isEmpty()) {
			//return ResponseEntity.noContent().build();
			return super.noContent();
		}
		
		return ResponseEntity.ok(lst);
		
	}
	
	/*
	@PostMapping
	public ResponseEntity<?> save(@RequestBody ProveedorDTO proveedorDTO) throws InteractorException{

		return ResponseEntity.status( HttpStatus.CREATED).body(proveedorService.save(proveedorDTO));
		
	}*/

}
