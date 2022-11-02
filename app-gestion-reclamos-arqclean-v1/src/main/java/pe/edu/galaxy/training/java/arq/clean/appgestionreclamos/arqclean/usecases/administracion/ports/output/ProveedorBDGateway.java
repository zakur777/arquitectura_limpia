package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.output;

import java.util.List;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDResponseModel;

public interface ProveedorBDGateway {

	boolean validarRazonSocial (String razonSocial);
	
	boolean validarRUC(String ruc);
	
	List<ProvedorBDResponseModel> findByLikeRazonSocial(String razonSocial); // Agretations

	List<ProvedorBDBasicResponseModel> findByAllActivos(String razonSocial); 
	
	boolean save(ProvedorBDRequestModel provedorBDRequestModel);

}
