package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.factory;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.entities.administracion.Proveedor;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.entities.administracion.ProveedorImpl;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.exceptions.ProveedorException;

public class ProveedorFactoryImpl implements ProveedorFactory{

	@Override
	public Proveedor create(String razonSocial, String ruc) throws ProveedorException {
		//....
		return new ProveedorImpl(razonSocial, ruc);
	}

	@Override
	public Proveedor create(String razonSocial, String ruc, String correo, String telefono) throws ProveedorException {
	
		return new ProveedorImpl(razonSocial, ruc,correo,telefono);
	}

	
}
