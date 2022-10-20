package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.factory;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.entities.adminstracion.Proveedor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.exceptions.ProveedorException;

public interface ProveedorFactory {

	Proveedor create( String razonSocial, String ruc) throws ProveedorException;
	
	Proveedor create( String razonSocial, String ruc, String correo, String telefono) throws ProveedorException;
}
