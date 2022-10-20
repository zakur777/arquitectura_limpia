package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.service;

import java.util.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.entities.adminstracion.Proveedor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.exceptions.ProveedorException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.factory.ProveedorFactory;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.exceptions.InteractorException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.ports.input.ProveedorQueryUseCase;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.ports.input.ProveedorSaveUseCase;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.ports.output.ProveedorBDGateway;

@RequiredArgsConstructor
@Service
public class ProveedorInteractor implements ProveedorQueryUseCase, ProveedorSaveUseCase{
	
    private final ProveedorBDGateway proveedorBDGateway;
	private final ProveedorFactory   proveedorFactory;
    // Presenter

	// Application Business Rule
	
    @Override
	public boolean save(ProvedorRequestModel provedorRequestModel) throws InteractorException {
		
		try {
			
		//Proveedor proveedor= new Proveedor(); // No es posible crear objetos de interfaces
			
		// Enterprise Business Rule
			
		// Verifivar Razon Social
		if (proveedorBDGateway.validarRazonSocial(provedorRequestModel.getRazonSocial())) {
			throw new InteractorException("La razon social "+ provedorRequestModel.getRazonSocial()+ " ya existe");
    }
		
		// Verifivar RUC
		if (proveedorBDGateway.validarRUC(provedorRequestModel.getRuc())) {
			throw new InteractorException("El RUC "+ provedorRequestModel.getRuc()+ " ya existe");
    }
			
		Proveedor proveedor= proveedorFactory.create(provedorRequestModel.getRazonSocial(), provedorRequestModel.getRuc());
		
		// Aquí
		
            if (proveedor.validar()) {
			
			ProvedorBDRequestModel provedorBDRequestModel= ProvedorBDRequestModel.builder()
                        .razonSocial(proveedor.getRazonSocial())
                        .ruc(proveedor.getRuc())
                        .build();
			
			proveedorBDGateway.save(provedorBDRequestModel);
            }

		return true;
		
		} catch (ProveedorException e) {
            throw new InteractorException(e.getMessage());
        }

	}

	@Override
	public List<ProvedorResponseModel> findByLikeRazonSocial(String razonSocial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProvedorBasicResponseModel> findByAllActivos(String razonSocial) {
		// TODO Auto-generated method stub
		return null;
    }

	
}
