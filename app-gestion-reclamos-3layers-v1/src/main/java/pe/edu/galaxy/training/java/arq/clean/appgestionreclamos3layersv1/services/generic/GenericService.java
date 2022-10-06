package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.generic;

import java.util.List;
import java.util.Optional;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.services.exceptions.ServiceException;

public interface GenericService<T> {

	List<T> findLikeObject(T t) throws ServiceException;
	
	Optional<T> findById(T t) throws ServiceException;
	
	T save(T t) throws ServiceException;
	
	T update(T t) throws ServiceException;
	
	void delte(T t) throws ServiceException;

}
