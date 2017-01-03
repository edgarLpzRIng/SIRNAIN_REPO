package mx.org.frp.sirnain.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase que realiza el manejo de excepciones del proyecto SIRNAIN
 * @author Edgar López
 * @category Manejo de Excepciones sistema SIRNAIN
 *
 */
public class SirnainBOException extends Exception{
	
private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
	
	/**
	 * serializacion de la clase para transmision del contenido
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor de la clase SirnainBOException sin parametros.
	 */
	public SirnainBOException() {
		super();
	}

	/**
	 * Constructor de la clase SirnainBOException que recibe el error ocasionado.
	 * @param message Mensaje del error ocasionado.
	 */
	public SirnainBOException(String message) {
		super(message);		
		System.out.println("--> Ocurróo una BOException en el proyecto SIRNAIN: " + dateFormat.format(new Date()) + " " + message);
	}

	/**
	 * Constructor de la clase SirnainBOException que recibe la causa del error enviado.
	 * @param cause Throwable con el error ocasionado
	 */
	public SirnainBOException(Throwable cause) {
		super(cause);
		System.out.println("--> Ocurrió una BOException en el proyecto SIRNAIN: " + dateFormat.format(new Date()) + " " + cause.getMessage());
	}

	/**
	 * Constructor de la clase SirnainBOException que recibe el mensaje y el error ocasionado.
	 * @param message Mensaje del error
	 * @param cause Causa del error
	 */
	public SirnainBOException(String message, Throwable cause) {
		super(message, cause);
		System.out.println("--> Ocurrió una BOException en el proyecto SIRNAIN: " + dateFormat.format(new Date()) + " " + message);
	}

	/**
	 * Constructor de la clase SirnainBOException
	 * @param message Mensaje del error
	 * @param cause Causa del error
	 * @param enableSuppression Booleano que indica si se activa la supresión de errores.
	 * @param writableStackTrace Booleano que indica si se escribirá el trazado de la pila hasta que ocurrió el error.
	 */
	public SirnainBOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		System.out.println("--> Ocurrió una BOException en el proyecto SIRNAIN: " + dateFormat.format(new Date()) + " " + message);
	}

}
