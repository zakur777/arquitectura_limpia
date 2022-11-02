package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.mappers;

import org.mapstruct.Mapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.entity.ProveedorEntity;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDBasicResponseModel;


@Mapper(componentModel = "spring")
public interface ProveedorOracleBasicResponseMapper extends GenericMapper<ProveedorEntity, ProvedorBDBasicResponseModel>{

	//@Mapping(target="employeeId", source="entity.id")
}
