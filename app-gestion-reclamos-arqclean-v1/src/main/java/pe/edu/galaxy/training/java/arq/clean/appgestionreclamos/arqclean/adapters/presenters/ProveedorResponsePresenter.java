package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.presenters;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.presenters.ProveedorPresenter;
import static java.util.Objects.isNull;

import org.springframework.stereotype.Component;

@Component
public class ProveedorResponsePresenter implements ProveedorPresenter{

	@Override
	public String prepareText(ProvedorResponseModel provedorResponseModel) {
	
		if (isNull(provedorResponseModel)) {
			return "";
		}
		
		//return provedorResponseModel.getRuc().concat(" : ").concat(provedorResponseModel.getRazonSocial());
		return provedorResponseModel.getRazonSocial()
				.concat(" (")
				.concat(provedorResponseModel.getRuc()
				.concat(") "));
	}

	@Override
	public ProvedorResponseModel prepareObject(ProvedorResponseModel provedorResponseModel) {
		
		return null;
	}


}
