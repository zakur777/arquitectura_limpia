package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.mappers;

import org.mapstruct.Mapper;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.dto.ProveedorDTO;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.entity.ProveedorEntity;


@Mapper(componentModel = "spring")
public interface ProveedorMapper extends GenericMapper<ProveedorEntity, ProveedorDTO>{

	//@Mapping(target="employeeId", source="entity.id")
}
