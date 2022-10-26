package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.ports.output;

import java.util.List;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.db.ProvedorBDBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.db.ProvedorBDRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.db.ProvedorBDResponseModel;

public interface ProveedorBDGateway {

	boolean validarRazonSocial (String razonSocial);
	
	boolean validarRUC(String ruc);
	
	List<ProvedorBDResponseModel> findByLikeRazonSocial(String razonSocial); // Agretations

	List<ProvedorBDBasicResponseModel> findByAllActivos(String razonSocial); 
	
	boolean save(ProvedorBDRequestModel provedorBDRequestModel);

}
