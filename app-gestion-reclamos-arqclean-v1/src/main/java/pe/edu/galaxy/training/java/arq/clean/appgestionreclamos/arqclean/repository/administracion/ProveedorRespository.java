package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.repository.administracion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entity.ProveedorEntity;

@Repository
public interface ProveedorRespository extends JpaRepository<ProveedorEntity, Long> {

	
	// JPQL
	
	
	// Projections
	
	
	// Paging & Sorting
	
}
