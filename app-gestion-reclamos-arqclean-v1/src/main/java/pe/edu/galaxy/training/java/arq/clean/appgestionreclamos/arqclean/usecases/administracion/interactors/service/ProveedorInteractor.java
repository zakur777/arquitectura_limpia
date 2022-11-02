package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.interactors.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.entities.administracion.Proveedor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.exceptions.ProveedorException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.factory.ProveedorFactory;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.factory.ProveedorFactoryImpl;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.mappers.ProveedorBasicResponseMapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.mappers.ProveedorResponseMapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.input.ProveedorQueryUseCase;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.input.ProveedorSaveUseCase;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.output.ProveedorBDGateway;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.presenters.ProveedorPresenter;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.interactors.exceptions.InteractorException;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.interactors.service.GenericInteractor;

@RequiredArgsConstructor // IoC Nivel 4
@Service
public class ProveedorInteractor extends GenericInteractor implements ProveedorQueryUseCase, ProveedorSaveUseCase {

	private final ProveedorBDGateway proveedorBDGateway;
	private final ProveedorFactory   proveedorFactory;
	// Presenter
	private final ProveedorPresenter proveedorPresenter;

	// Mappers
	private final ProveedorResponseMapper proveedorResponseMapper;

	private final ProveedorBasicResponseMapper proveedorBasicResponseMapper;

	// Application Business Rule

	@Override
	public boolean save(ProvedorRequestModel provedorRequestModel) throws InteractorException {

		try {

			// Proveedor proveedor= new Proveedor(); // No es posible crear objetos de
			// interfaces

		// Enterprise Business Rule

		// Verifivar Razon Social
		if (proveedorBDGateway.validarRazonSocial(provedorRequestModel.getRazonSocial())) {
				throw new InteractorException(
						"La razon social " + provedorRequestModel.getRazonSocial() + " ya existe");
		}

		// Verifivar RUC
		if (proveedorBDGateway.validarRUC(provedorRequestModel.getRuc())) {
				throw new InteractorException("El RUC " + provedorRequestModel.getRuc() + " ya existe");
		}

			// ProveedorFactory proveedorFactory= new ProveedorFactoryImpl();
			Proveedor proveedor = proveedorFactory.create(provedorRequestModel.getRazonSocial(),
					provedorRequestModel.getRuc());

		// Aquí

		if (proveedor.validar()) {

				ProvedorBDRequestModel provedorBDRequestModel = ProvedorBDRequestModel.builder()
						.razonSocial(proveedor.getRazonSocial()).ruc(proveedor.getRuc()).build();

			proveedorBDGateway.save(provedorBDRequestModel);
		}

		return true;

		} catch (ProveedorException e) {
			throw new InteractorException(e.getMessage());
		}

	}

	@Override
	public List<ProvedorResponseModel> findByLikeRazonSocial(String razonSocial) {
		List<ProvedorBDResponseModel> lst = proveedorBDGateway.findByLikeRazonSocial(razonSocial);
		lst.forEach(System.out::println);
		return proveedorResponseMapper.toModels(lst);
	}

	@Override
	public List<ProvedorBasicResponseModel> findByAllActivos() {
		List<ProvedorBDBasicResponseModel> lst = proveedorBDGateway.findByAllActivos();
		lst.forEach(System.out::println);
		return proveedorBasicResponseMapper.toModels(lst);
	}

	@Override
	public Optional<ProvedorResponseModel> findByRUC(String ruc) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<String> findByAllActivosText() {

		List<String> lstString = new ArrayList<>();

		List<ProvedorBDBasicResponseModel> lst = proveedorBDGateway.findByAllActivos();
		/*
		lst.forEach(p->{
	
			lstString.add("");
		});*/

		for (ProvedorBDBasicResponseModel p : lst) {
			lstString.add(proveedorPresenter.prepareText(
					ProvedorResponseModel.builder().ruc(p.getRuc()).razonSocial(p.getRazonSocial()).build()));
		}
		return lstString;
	}

}
