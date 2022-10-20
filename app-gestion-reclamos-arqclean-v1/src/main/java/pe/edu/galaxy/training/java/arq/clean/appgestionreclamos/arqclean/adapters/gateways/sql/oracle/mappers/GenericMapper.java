package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.mappers;

import java.util.List;

public interface GenericMapper<E,D> {

	E toEntity(D d);
	
	D toBDRModel(E e);
	
	List<D> toBDRModels(List<E> lstEntities);

	List<E> toEntities(List<D> lstBDRModels);

}
