package mx.org.frp.sirnain;

import mx.org.frp.sirnain.view.Vista;

/**
 * Clase inicial que ejecuta el programa.
 * @author Edgar López
 * @category Clase Inicial.
 */
public class Ejecutor {

	/**
	 * Método principal de la app
	 * @param args argumentos de entrada de la aplicación.
	 */
	public static void main(String[] args) {
		Vista app = new Vista();
		app.iniciar();
	}

}
