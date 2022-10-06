package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.administracion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.entity.ProveedorEntity;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.repository.administracion.ProveedorRespository;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.exceptions.ServiceException;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	
	private final ProveedorRespository proveedorRespository;

	/*
	public ProveedorServiceImpl(final ProveedorRespository proveedorRespository) {
		this.proveedorRespository=proveedorRespository;
	}*/
	
	@Override
	public List<ProveedorEntity> findLikeObject(ProveedorEntity t) throws ServiceException {
		try {
			return proveedorRespository.findAll();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException(e);
		}
	}

	@Override
	public Optional<ProveedorEntity> findById(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public ProveedorEntity save(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProveedorEntity update(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delte(ProveedorEntity t) throws ServiceException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<ProveedorEntity> findByRUC(String ruc) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
