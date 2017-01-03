package mx.org.frp.sirnain.dao.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SirnainDAOException extends Exception{
	
	private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
	
	/**
	 * serializacion de la clase para transmision del contenido
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor de la clase SirnainDAOException sin parametros.
	 */
	public SirnainDAOException() {
		super();
	}

	/**
	 * Constructor de la clase SirnainDAOException que recibe el error ocasionado.
	 * @param message Mensaje del error ocasionado.
	 */
	public SirnainDAOException(String message) {
		super(message);		
		System.out.println("--> Ocurrió una SirnainDAOException en el proyecto SirnainDAO: " + dateFormat.format(new Date()) + " " + message);
	}

	/**
	 * Constructor de la clase SirnainDAOException que recibe la causa del error enviado.
	 * @param cause Throwable con el error ocasionado
	 */
	public SirnainDAOException(Throwable cause) {
		super(cause);
		System.out.println("--> Ocurrió una SirnainDAOException en el proyecto SirnainDAO: " + dateFormat.format(new Date()) + " " + cause.getMessage());
	}

	/**
	 * Constructor de la clase SirnainDAOException que recibe el mensaje y el error ocasionado.
	 * @param message Mensaje del error
	 * @param cause Causa del error
	 */
	public SirnainDAOException(String message, Throwable cause) {
		super(message, cause);
		System.out.println("--> Ocurrió una SirnainDAOException en el proyecto SirnainDAO: " + dateFormat.format(new Date()) + " " + message);
	}

	/**
	 * Constructor de la clase SirnainDAOException
	 * @param message Mensaje del error
	 * @param cause Causa del error
	 * @param enableSuppression Booleano que indica si se activa la supresión de errores.
	 * @param writableStackTrace Booleano que indica si se escribirá el trazado de la pila hasta que ocurrió el error.
	 */
	public SirnainDAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		System.out.println("--> Ocurrió una SirnainDAOException en el proyecto SirnainDAO: " + dateFormat.format(new Date()) + " " + message);
	}

}