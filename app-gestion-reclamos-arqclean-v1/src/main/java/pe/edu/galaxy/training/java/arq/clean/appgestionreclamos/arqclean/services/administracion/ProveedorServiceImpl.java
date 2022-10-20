package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.administracion;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.mappers.ProveedorOracleMapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.springdata.ProveedorRespository;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.exceptions.InteractorException;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	private final ProveedorRespository proveedorRespository;
	private final ProveedorOracleMapper proveedorMapper;

	@Override
	public List<ProveedorDTO> findLikeObject(ProveedorDTO proveedorDTO ) throws InteractorException {
		try {
			return proveedorMapper.toDTOs(proveedorRespository.findAll());
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new InteractorException(e);
		}
	}

	@Override
	public Optional<ProveedorDTO> findById(ProveedorDTO proveedorDTO ) throws InteractorException {

		return Optional.empty();
	}

	@Override
	public ProveedorDTO save(ProveedorDTO proveedorDTO ) throws InteractorException {

		try {
			return proveedorMapper.toDTO( proveedorRespository.save(proveedorMapper.toEntity(proveedorDTO)));
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			throw new InteractorException(e);
		}
	}

	@Override
	public ProveedorDTO update(ProveedorDTO proveedorDTO ) throws InteractorException {

		return null;
	}

	@Override
	public void delte(ProveedorDTO proveedorDTO ) throws InteractorException {
	

	}

	@Override
	public Optional<ProveedorDTO> findByRUC(String ruc) throws InteractorException {

		return Optional.empty();
	}

}
