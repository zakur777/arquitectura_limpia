package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.mappers;

import org.mapstruct.Mapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.db.ProvedorBDRequestModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.web.ProvedorRequestModel;


@Mapper(componentModel = "spring")
public interface ProveedorMapper extends GenericMapper<ProvedorBDRequestModel, ProvedorRequestModel>{

	//@Mapping(target="employeeId", source="entity.id")
}
