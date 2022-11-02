package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.mappers;

import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db.ProvedorBDResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web.ProvedorBasicResponseModel;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.mappers.GenericMapper;


@Mapper(componentModel = "spring")
public interface ProveedorBasicResponseMapper extends GenericMapper<ProvedorBDBasicResponseModel, ProvedorBasicResponseModel>{

	//@Mapping(target="employeeId", source="entity.id")
	
	default List<ProvedorBasicResponseModel> getModels(List<ProvedorBDResponseModel> lst){
		return lst.stream().map(e->getModel(e)).collect(Collectors.toList());
		
	}
	
	default ProvedorBasicResponseModel getModel(ProvedorBDResponseModel e) {
		return ProvedorBasicResponseModel.builder()
				.ruc(e.getRuc())
				.razonSocial(e.getRazonSocial())
				.build();
	}
}
