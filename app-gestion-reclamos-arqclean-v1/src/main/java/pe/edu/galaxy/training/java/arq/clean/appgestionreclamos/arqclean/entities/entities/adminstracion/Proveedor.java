package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.entities.adminstracion;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.SituacionProveedorEnum;

public interface Proveedor {

	String getRazonSocial();
	
	String getRuc();
	
	String getCorreo();
	
	String getTelefono();
	
	SituacionProveedorEnum getEstado();
	
	
	// Enterprise Business Rules
	boolean validar();
	
}
