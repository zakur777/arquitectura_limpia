package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.mappers;

import java.util.List;

public interface GenericMapper<E,D> {

	E toBD(D d);
	
	D toModel(E e);
	
	List<D> toModels(List<E> lstBDs);

	List<E> toBDs(List<D> lstModels);

}
