package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.entity.ProveedorEntity;

@Repository
public interface ProveedorOracleSpringDataRespository extends GenericOracleSpringDataRespository<ProveedorEntity, Long> {

	
	// JPQL (Java Persistence Query Languaje
    @Query("select p from ProveedorEntity p where upper(p.razonSocial) like upper(:razonSocial) and p.estado='1'")
    List<ProveedorEntity> findByLikeRazonSocial(@Param("razonSocial") String razonSocial);
	
	// Query Native
	@Modifying
	@Query(nativeQuery =true, value = "select count(*) from TBL_PROVEEDOR  where RUC=:ruc")
	Integer validarRUC(@Param("ruc") String ruc);
	
	
	// Projections
	
	
	// Paging & Sorting
	
}
