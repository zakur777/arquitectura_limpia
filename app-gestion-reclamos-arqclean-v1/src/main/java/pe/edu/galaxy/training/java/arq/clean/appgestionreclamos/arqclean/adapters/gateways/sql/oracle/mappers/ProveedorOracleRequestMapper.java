package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.mappers;

import org.mapstruct.Mapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.entity.ProveedorEntity;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDRequestModel;


@Mapper(componentModel = "spring")
public interface ProveedorOracleRequestMapper extends GenericMapper<ProveedorEntity, ProvedorBDRequestModel>{

	//@Mapping(target="employeeId", source="entity.id")
}
