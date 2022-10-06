package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.administracion;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.mappers.ProveedorMapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.repository.administracion.ProveedorRespository;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.exceptions.ServiceException;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	private final ProveedorRespository proveedorRespository;
	private final ProveedorMapper proveedorMapper;

	@Override
	public List<ProveedorDTO> findLikeObject(ProveedorDTO proveedorDTO ) throws ServiceException {
		try {
			return proveedorMapper.toDTOs(proveedorRespository.findAll());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException(e);
		}
	}

	@Override
	public Optional<ProveedorDTO> findById(ProveedorDTO proveedorDTO ) throws ServiceException {

		return Optional.empty();
	}

	@Override
	public ProveedorDTO save(ProveedorDTO proveedorDTO ) throws ServiceException {

		try {
			return proveedorMapper.toDTO( proveedorRespository.save(proveedorMapper.toEntity(proveedorDTO)));
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new ServiceException(e);
		}
	}

	@Override
	public ProveedorDTO update(ProveedorDTO proveedorDTO ) throws ServiceException {

		return null;
	}

	@Override
	public void delte(ProveedorDTO proveedorDTO ) throws ServiceException {
	

	}

	@Override
	public Optional<ProveedorDTO> findByRUC(String ruc) throws ServiceException {

		return Optional.empty();
	}

}
