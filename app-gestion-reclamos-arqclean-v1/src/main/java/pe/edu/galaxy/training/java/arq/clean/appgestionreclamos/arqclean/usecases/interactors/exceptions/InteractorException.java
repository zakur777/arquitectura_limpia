package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.interactors.exceptions;

public class InteractorException extends Exception{

	private static final long serialVersionUID = -2096680974179326303L;

	public InteractorException() {
		super();
		
	}

	public InteractorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InteractorException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InteractorException(String message) {
		super(message);
		
	}

	public InteractorException(Throwable cause) {
		super(cause);
	
	}



}
