package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.services.exceptions;

public class ServiceException extends Exception{

	private static final long serialVersionUID = -2096680974179326303L;

	public ServiceException() {
		super();
		
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ServiceException(String message) {
		super(message);
		
	}

	public ServiceException(Throwable cause) {
		super(cause);
	
	}



}
