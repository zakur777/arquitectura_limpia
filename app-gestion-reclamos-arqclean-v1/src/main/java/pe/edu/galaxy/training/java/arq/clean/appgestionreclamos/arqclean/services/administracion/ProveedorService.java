package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.administracion;

import java.util.Optional;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.generic.GenericService;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.exceptions.InteractorException;

public interface ProveedorService extends GenericService<ProveedorDTO>{

	Optional<ProveedorDTO> findByRUC(String ruc) throws InteractorException;
	
}
