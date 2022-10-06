package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.repository.administracion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos3layersv1.entity.ProveedorEntity;

@Repository
public interface ProveedorRespository extends JpaRepository<ProveedorEntity, Long> {

	
	// JPQL
	
	
	// Projections
	
	
	// Paging & Sorting
	
}
