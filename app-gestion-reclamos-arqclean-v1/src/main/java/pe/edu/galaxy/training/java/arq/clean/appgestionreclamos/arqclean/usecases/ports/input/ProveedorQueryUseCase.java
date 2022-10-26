package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.ports.input;

import java.util.List;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.web.ProvedorBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.web.ProvedorResponseModel;

public interface ProveedorQueryUseCase {

	List<ProvedorResponseModel> findByLikeRazonSocial(String razonSocial);

	List<ProvedorBasicResponseModel> findByAllActivos(String razonSocial); 
	
}
