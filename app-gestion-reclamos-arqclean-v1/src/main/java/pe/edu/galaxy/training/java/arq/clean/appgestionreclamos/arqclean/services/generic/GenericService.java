package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.services.generic;

import java.util.List;
import java.util.Optional;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.exceptions.InteractorException;

public interface GenericService<T> {

	List<T> findLikeObject(T t) throws InteractorException;
	
	Optional<T> findById(T t) throws InteractorException;
	
	T save(T t) throws InteractorException;
	
	T update(T t) throws InteractorException;
	
	void delte(T t) throws InteractorException;

}
