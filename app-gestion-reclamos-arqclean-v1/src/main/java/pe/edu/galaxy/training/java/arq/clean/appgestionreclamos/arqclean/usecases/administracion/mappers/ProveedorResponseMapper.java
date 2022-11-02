package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.mappers;

import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.mappers.GenericMapper;


@Mapper(componentModel = "spring")
public interface ProveedorResponseMapper extends GenericMapper<ProvedorBDResponseModel, ProvedorResponseModel>{

	//@Mapping(target="employeeId", source="entity.id")
	

}
