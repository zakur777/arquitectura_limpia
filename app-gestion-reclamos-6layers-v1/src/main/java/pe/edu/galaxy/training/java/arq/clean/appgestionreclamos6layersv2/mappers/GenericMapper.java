package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.mappers;

import java.util.List;

public interface GenericMapper<E,D> {

	E toEntity(D d);
	
	D toDTO(E e);
	
	List<D> toDTOs(List<E> lstEntities);

	List<E> toEntities(List<D> lstDtos);

}
