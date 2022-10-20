package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.mappers;

import org.mapstruct.Mapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.entity.ProveedorEntity;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDResponseModel;


@Mapper(componentModel = "spring")
public interface ProveedorOracleResponseMapper extends GenericMapper<ProveedorEntity, ProvedorBDResponseModel>{

	//@Mapping(target="employeeId", source="entity.id")
}
