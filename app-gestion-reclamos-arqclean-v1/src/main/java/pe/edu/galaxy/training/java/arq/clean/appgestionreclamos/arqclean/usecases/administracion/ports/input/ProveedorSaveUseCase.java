package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.input;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.interactors.exceptions.InteractorException;

public interface ProveedorSaveUseCase {

	boolean save(ProvedorRequestModel provedorRequestModel) throws InteractorException;

}
