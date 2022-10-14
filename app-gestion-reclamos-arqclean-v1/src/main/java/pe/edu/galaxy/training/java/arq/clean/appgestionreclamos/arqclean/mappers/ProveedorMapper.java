package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.mappers;

import org.mapstruct.Mapper;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entity.ProveedorEntity;


@Mapper(componentModel = "spring")
public interface ProveedorMapper extends GenericMapper<ProveedorEntity, ProveedorDTO>{

	//@Mapping(target="employeeId", source="entity.id")
}
