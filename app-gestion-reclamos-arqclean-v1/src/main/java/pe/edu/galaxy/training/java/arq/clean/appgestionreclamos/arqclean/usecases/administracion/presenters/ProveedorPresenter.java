package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.presenters;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorResponseModel;

public interface ProveedorPresenter {
	
	String prepareText(ProvedorResponseModel provedorResponseModel);
	
	ProvedorResponseModel prepareObject(ProvedorResponseModel provedorResponseModel);

}
 