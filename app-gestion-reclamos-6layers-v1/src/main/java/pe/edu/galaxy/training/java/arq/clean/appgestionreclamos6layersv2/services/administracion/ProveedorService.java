package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.administracion;

import java.util.Optional;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.exceptions.ServiceException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.generic.GenericService;

public interface ProveedorService extends GenericService<ProveedorDTO>{

	Optional<ProveedorDTO> findByRUC(String ruc) throws ServiceException;
	
}
