package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.adapter;

import java.util.List;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.entity.ProveedorEntity;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.mappers.ProveedorOracleRequestMapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.mappers.ProveedorOracleResponseMapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.springdata.ProveedorOracleSpringDataRespository;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.ports.output.ProveedorBDGateway;

import static java.util.Objects.isNull;

@RequiredArgsConstructor
@Component
public class ProveedorOracleAdapter implements ProveedorBDGateway{

    private final ProveedorOracleSpringDataRespository proveedorOracleSpringDataRespository;
	
    //private final ProveedorUSPOracleSpringDataRespository proveedorUSPOracleSpringDataRespository;
	
	private final ProveedorOracleRequestMapper proveedorOracleRequestMapper;
	
	private final ProveedorOracleResponseMapper proveedorOracleResponseMapper;
	
	
    @Override
    public boolean validarRazonSocial(String razonSocial) {
		// TODO Auto-generated method stub
        return false;
    }

    @Override
	public boolean validarRUC(String ruc) {
		return proveedorOracleSpringDataRespository.validarRUC(ruc)>0;
    }

    @Override
    public List<ProvedorBDResponseModel> findByLikeRazonSocial(String razonSocial) {
		List<ProveedorEntity> lstProveedorEntity= proveedorOracleSpringDataRespository.findByLikeRazonSocial(razonSocial);
		return proveedorOracleResponseMapper.toBDRModels(lstProveedorEntity);
    }

    @Override
    public List<ProvedorBDBasicResponseModel> findByAllActivos(String razonSocial) {
		// TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean save(ProvedorBDRequestModel provedorBDRequestModel) {
		ProveedorEntity proveedorEntity= proveedorOracleRequestMapper.toEntity(provedorBDRequestModel);
		ProveedorEntity resProveedorEntity =proveedorOracleSpringDataRespository.save(proveedorEntity);
		return !isNull(resProveedorEntity);
    }

	
}
