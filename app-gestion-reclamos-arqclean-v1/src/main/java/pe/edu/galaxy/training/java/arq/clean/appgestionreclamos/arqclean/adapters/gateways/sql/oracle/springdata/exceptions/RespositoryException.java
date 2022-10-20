package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.adapters.gateways.sql.oracle.springdata.exceptions;

public class RespositoryException extends Exception {

	private static final long serialVersionUID = 7715409400055844459L;

	public RespositoryException() {
		
	}

	public RespositoryException(String message) {
		super(message);
		
	}

	public RespositoryException(Throwable cause) {
		super(cause);
		
	}

	public RespositoryException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public RespositoryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
