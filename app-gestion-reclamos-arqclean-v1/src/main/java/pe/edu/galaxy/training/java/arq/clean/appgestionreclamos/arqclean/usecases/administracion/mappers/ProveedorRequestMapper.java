package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.mappers;

import org.mapstruct.Mapper;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.mappers.GenericMapper;


@Mapper(componentModel = "spring")
public interface ProveedorRequestMapper extends GenericMapper<ProvedorBDRequestModel, ProvedorRequestModel>{

	//@Mapping(target="employeeId", source="entity.id")
}
