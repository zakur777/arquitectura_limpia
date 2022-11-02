package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.entities.administracion;

import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.exceptions.ProveedorException;
import static java.util.Objects.isNull;
import static pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entities.validators.RucValidator.validarRuc;

public class ProveedorImpl implements Proveedor {

	private String razonSocial;

	private String ruc;

	private String correo;

	private String telefono;

	private SituacionProveedorEnum estado;

	public ProveedorImpl(String razonSocial, String ruc) throws ProveedorException{

		if(isNull(razonSocial)) {
			throw new ProveedorException("La razón social es equerida");
		}
		
		if(isNull(ruc)) {
			throw new ProveedorException("El ruc es equerido");
		}
		
		if(!validarRuc(ruc)) {
			throw new ProveedorException("El ruc no cumple el formato establecido");
		}
		
		this.razonSocial=razonSocial;
		this.ruc=ruc;
		this.estado=SituacionProveedorEnum.ACTIVO;
		
		//  ....
		
	}

	public ProveedorImpl(String razonSocial, String ruc, String correo, String telefono)  throws ProveedorException {
		
		// Replicar 
	}

	@Override
	public String getRazonSocial() {

		return razonSocial;
	}

	@Override
	public String getRuc() {

		return ruc;
	}

	@Override
	public String getCorreo() {

		return correo;
	}

	@Override
	public String getTelefono() {

		return telefono;
	}

	@Override
	public SituacionProveedorEnum getEstado() {

		return estado;
	}

	@Override
	public boolean validar() {

		return false;
	}

}
