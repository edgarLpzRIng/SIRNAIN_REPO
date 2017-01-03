package mx.org.frp.sirnain.view;

import java.util.Scanner;

import mx.org.frp.sirnain.bo.impl.AdministraPersonaBOImpl;
import mx.org.frp.sirnain.bo.impl.CatalogoBOImpl;
import mx.org.frp.sirnain.exception.SirnainBOException;
import mx.org.frp.sirnain.wrapper.DomicilioWrapper;
import mx.org.frp.sirnain.wrapper.PersonaWrapper;
import mx.org.sirnain.utiles.RolPersona;

/**
 * Clase vista que despliega en la consola la aplicaci�n de SIRNAIN.
 * @author Edgar L�pez
 * @category Clase de vista de la aplicaci�n.
 */
public class Vista {
	
	private static final String CABECERA = "::::::::: SISTEMA DE REMESAS NACIONALES - CONSOLA :::::::::";
	private static final String BIENVENIDA = "- Bienvenido a la aplicaci�n -";
	private static final String OPCION_SALIDA = "- Para salir de la aplicaci�n presiona X -";
	private static final String OPCION_REGISTRA_PERSONA = "- 1 Registrar usuario -";
	private static final String OPCION_ACTUALIZA_PERSONA = "- 2 Actualizar Persona -";
	private static final String OPCION_DESACTIVA_PERSONA = "- 3 Desactivar usuario -";

	private static final String DESPEDIDA = "- Gracias por usar SIRNAIN-CONSOLA -";
	private static final String SELECCION_MENU = "- Selecciona una opci�n de men� -";
	private static final String SELECCION_MENU_NO_VALIDO = "- La opci�n seleccionada no es valida -";

	private static final char MENU_SALIDA = 'X';
	private static final char MENU_REGISTRA_PERSONA = '1';
	private static final char MENU_ACTUALIZA_PERSONA = '2';
	private static final char MENU_DESACTIVA_PERSONA = '3';
	
	/**
	 * M�todo constructor que ejecuta el men� de bienvenida. 
	 */
	public Vista() {
		imprimeBienvenida();
	}
	
	/**
	 * Recibe las cadenas de entrada del usuario.
	 * @return
	 */
	public String entradaTeclado(){
		Scanner entradaEscaner = new Scanner (System.in);
		String entradaTeclado = "";
        entradaTeclado = entradaEscaner.nextLine();
        //entradaEscaner.close();
        return entradaTeclado;
	}
	
	/**
	 * Men� de la aplicaci�n
	 */
	public void iniciar() {
		char seleccion = '\0';

		do {
			imprimeMenu();
			String seleccionUsuario = entradaTeclado();
			seleccion = seleccionUsuario.toUpperCase().charAt(0);
			switch (seleccion) {
			case MENU_REGISTRA_PERSONA:
				// registro a la persona;
				registrarPersona();
				break;
			case MENU_ACTUALIZA_PERSONA:
				// Actualiza a la persona;
				actualizaPersona();
				break;
			case MENU_DESACTIVA_PERSONA:
				// desactiva a la persona;
				eliminaPersona();
				break;
			case MENU_SALIDA:
				imprimeDespedida();
				break;
			default:
				imprimeSeleccionNoValida();
			}
		} while (seleccion != MENU_SALIDA);
	}
	
	/**
	 * Ejecuta la eliminaci�n de la persona.
	 */
	private void eliminaPersona() {
		AdministraPersonaBOImpl administraPersona = new AdministraPersonaBOImpl();
		String respuesta = administraPersona.eliminarPersona(new PersonaWrapper());
		System.out.println(respuesta);
	}

	/**
	 * Ejecuta la actualizaci�n de la persona
	 */
	private void actualizaPersona() {
		AdministraPersonaBOImpl administraPersona = new AdministraPersonaBOImpl();
		String respuesta = administraPersona.actualizarPersona(new PersonaWrapper());
		System.out.println(respuesta);
	}

	/**
	 * Ejecuta el registro de la persona.
	 */
	private void registrarPersona(){
		PersonaWrapper personaWrapper = new PersonaWrapper();
		CatalogoBOImpl tipoPersona = new CatalogoBOImpl();
		String entrada = "";
		System.out.println("Ingresa el nombre de usuario:");
		entrada = entradaTeclado();
		personaWrapper.setNombre(entrada);
		System.out.println("Ingresa el Primer Apellido:");
		entrada = entradaTeclado();
		personaWrapper.setPrimerApellido(entrada);
		System.out.println("Ingresa el Segundo Apellido:");
		entrada = entradaTeclado();
		personaWrapper.setSegundoApellido(entrada);
		System.out.println("Ingresa tu nombre de usuario:");
		entrada = entradaTeclado();
		personaWrapper.setUsuario(entrada);
		System.out.println("Ingresa la contrase�a:");
		entrada = entradaTeclado();
		personaWrapper.setContrasenia(entrada);
		System.out.println("Ingresa el correo:");
		entrada = entradaTeclado();
		personaWrapper.setCorreo(entrada);
		System.out.println("Ingresa la fecha de Nacimiento en formato dd/mm/aaaa:");
		entrada = entradaTeclado();
		personaWrapper.setFechaNacimiento(entrada);
		System.out.println("Ingresa el n�mero del tipo de persona que desea dar de alta:");
//		try {
//			tipoPersona.listarTipoPersona();
//		} catch (SirnainBOException e) {
//			System.out.println("Ocurri� un error al Listar las personas: "+e.getMessage());
//			return;
//		}
		entrada = entradaTeclado();
		try{
			personaWrapper.setIdTipoPersona(Integer.valueOf(entrada));
		}catch(NumberFormatException e){
			System.out.println("El valor ingresado "+entrada+" no es un dato num�rico.");
			return;
		}
		System.out.println("Desea registrar el domicilio de la persona? 1=SI 2=NO");
		entrada = entradaTeclado();
		if(entrada.equals("1")){
			DomicilioWrapper domicilioWrapper = new DomicilioWrapper();
			System.out.println("Ingresa la calle:");
			entrada = entradaTeclado();
			domicilioWrapper.setCalle(entrada);
			System.out.println("Ingresa la ciudad o municipio:");
			entrada = entradaTeclado();
			domicilioWrapper.setCiudadMunicipio(entrada);
			System.out.println("Ingresa el c�digo postal:");
			entrada = entradaTeclado();
			domicilioWrapper.setCodigoPostal(entrada);
			System.out.println("Ingresa la colonia:");
			entrada = entradaTeclado();
			domicilioWrapper.setColonia(entrada);
			System.out.println("Ingresa el n�mero exterior:");
			entrada = entradaTeclado();
			domicilioWrapper.setNumeroExterior(entrada);
			System.out.println("Ingresa el n�mero interior:");
			entrada = entradaTeclado();
			domicilioWrapper.setNumeroInterior(entrada);
			System.out.println("Ingresa el pa�s:");
			entrada = entradaTeclado();
			domicilioWrapper.setPais(entrada);
			personaWrapper.setDomicilioWrapper(domicilioWrapper);
		} else if(entrada.equals("2")) {
			System.out.println("No se registrar� domicilio.");
		} else {
			System.out.println("El valor ingresado no es v�lido. No se registrar� domicilio.");
		}
		
		//Registrar la persona
		AdministraPersonaBOImpl administraPersona = new AdministraPersonaBOImpl();
		try {
			administraPersona.registrarPersona(personaWrapper);
			//System.out.println("La persona se registr� con el id de Persona: "+personaWrapper.getIdPersona()+"\n");
		} catch (SirnainBOException e) {
			System.out.println("Ocurrio el siguiente error al registrar la persona: "+e.getMessage());
		}
	}
	
	/**
	 * Imprime la bienvenida al sistema.
	 */
	private void imprimeBienvenida() {
		System.out.println(CABECERA);
		System.out.println(BIENVENIDA);
	}
	
	/**
	 * Imprime la despedida del sistema
	 */
	private void imprimeDespedida() {
		System.out.println(DESPEDIDA);
	}
	
	/**
	 * Imprime mensaje de opcion erronea
	 */
	private void imprimeSeleccionNoValida() {
		System.out.println(SELECCION_MENU_NO_VALIDO);
	}

	/**
	 * Imprime las opciones del men�
	 */
	private void imprimeMenu() {
		System.out.println("\n"+SELECCION_MENU);
		System.out.println(OPCION_REGISTRA_PERSONA);
		System.out.println(OPCION_ACTUALIZA_PERSONA);
		System.out.println(OPCION_DESACTIVA_PERSONA);
		System.out.println(OPCION_SALIDA);
	}

}
