package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.input;

import java.util.List;
import java.util.Optional;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorResponseModel;

public interface ProveedorQueryUseCase {
	
	Optional<ProvedorResponseModel> findByRUC(String ruc);

	List<ProvedorResponseModel> findByLikeRazonSocial(String razonSocial);

	List<ProvedorBasicResponseModel> findByAllActivos(); 
	
	List<String> findByAllActivosText();
	
}
