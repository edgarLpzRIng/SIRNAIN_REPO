package mx.edu.unam.dgtic.diplojava;

import java.util.Calendar;
import java.util.Date;

import mx.org.sirnain.model.Persona;
import mx.org.sirnain.utiles.RolPersona;

/**
 * 
 * @author Edgar López
 * @category Instancia Principal de ejecución.
 */
public class Executor {

//	public static void main(String[] args) {
//		
//		System.out.println("***************************** MODULO DE REGISTRO DE PERSONAS *****************************");
//		Persona persona = new Persona();
//		persona.setPassword("contraseña123");
//		persona.setCorreo("elopez@tlakakini.mx");
//		persona.setNombre("Edgar");
//		persona.setPrimerApellido("López");
//		persona.setSegundoApellido("Romero");
//		persona.setUsuario("elopez");
//		//Asignar Domicilio
//		DomicilioPersonal domicilio = new DomicilioPersonal();
//		domicilio.setCalle("Palmas");
//		domicilio.setCiudadMunicipio("CDMX");
//		domicilio.setCodigoPostal("11000");
//		domicilio.setColonia("Lomas de Tecamachalco");
//		domicilio.setNumeroExterior(533);
//		domicilio.setNumeroInterior("3D");
//		domicilio.setPais("México");
//		persona.setDomicilioPersona(domicilio);
//		//Asignar fecha de nacimiento
//		Date fechaNacimiento = new Date();
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(1989,10,27);
//		fechaNacimiento.setTime(calendar.getTimeInMillis());
//		persona.setFechaNacimiento(fechaNacimiento);
//		//Asignar Tipo de Usuario
//		RolPersona tipoPersona = new RolPersona(1, "ADMINISTRADOR");
//		persona.setTipoPersona(tipoPersona);
//		
//		//Imprimir a la persona a registrar
//		System.out.println("Los datos de la persona a registrar son:");
//		persona.imprimePersona();
//		
//		//Hacer operaciones de registro con la persona
//		System.out.println("\n***************************** Iniciando el Proceso de Registro *****************************");
//		Registro registro = new Registro();
//		String respuesta = registro.registrarPersona(persona);
//		System.out.println(respuesta);
//		
//		System.out.println("\n***************************** Iniciando el Proceso de Modificación *****************************");
//		System.out.println("********** Modificando con traseña **********");
//		persona.setPassword("3st0_S1-3s/Un4_C0ntr@señA");
//		persona.imprimePersona();
//		respuesta = registro.modificarPersona(persona);
//		System.out.println(respuesta);
//		
//		System.out.println("\n***************************** Iniciando el Proceso de Baja de Persona *****************************");
//		respuesta = registro.bajaPersona(persona);
//		System.out.println(respuesta);
//		
//		System.out.println("***************************** TERMINA MODULO DE REGISTRO DE PERSONAS *****************************");
//	}

}
