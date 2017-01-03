package mx.org.frp.sirnain;

import mx.org.frp.sirnain.view.Vista;

/**
 * Clase inicial que ejecuta el programa.
 * @author Edgar L�pez
 * @category Clase Inicial.
 */
public class Ejecutor {

	/**
	 * M�todo principal de la app
	 * @param args argumentos de entrada de la aplicaci�n.
	 */
	public static void main(String[] args) {
		Vista app = new Vista();
		app.iniciar();
	}

}
