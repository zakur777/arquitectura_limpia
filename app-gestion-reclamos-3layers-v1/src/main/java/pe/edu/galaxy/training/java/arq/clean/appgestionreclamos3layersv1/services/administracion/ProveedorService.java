package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.administracion;

import java.util.Optional;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.entity.ProveedorEntity;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.exceptions.ServiceException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.generic.GenericService;

public interface ProveedorService extends GenericService<ProveedorEntity>{

	Optional<ProveedorEntity> findByRUC(String ruc) throws ServiceException;
	
}
