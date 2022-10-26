package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.ports.input;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.exceptions.InteractorException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.web.ProvedorRequestModel;

public interface ProveedorSaveUseCase {

	boolean save(ProvedorRequestModel provedorRequestModel) throws InteractorException;

}
