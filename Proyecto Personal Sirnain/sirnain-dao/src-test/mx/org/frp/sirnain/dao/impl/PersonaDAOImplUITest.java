package mx.org.frp.sirnain.dao.impl;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import mx.org.frp.sirnain.dao.PersonaDAO;
import mx.org.frp.sirnain.dao.impl.PersonaDAOImpl;
import mx.org.sirnain.model.Colonia;
import mx.org.sirnain.model.Domicilio;
import mx.org.sirnain.model.Persona;
import mx.org.sirnain.model.TipoDomicilio;
import mx.org.sirnain.utiles.RolPersona;

public class PersonaDAOImplUITest {

	@Test
	public void guardarPersona() {
		System.out.println("Método de guardar persona.");
		PersonaDAO personaDAO = new PersonaDAOImpl();
		
		Persona persona = personaDAO.guardarPersona(creaPersona(), creaDomicilio(), creaRolPersona());
		
		System.out.println("La persona creada es: "+persona);
		
		assertTrue(persona.getIdPersona()>0);
		
	}
	
	private Persona creaPersona(){
		Persona persona = new Persona();
		persona.setNombre("Edgar");
		persona.setPrimerApellido("López");
		persona.setSegundoApellido("Romero");
		persona.setUsuario("EDGARLRFI");
		persona.setPassword("3dg4r");
		persona.setCorreo("edgar.lr@hola.com");
		Date fechaNacimiento = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			fechaNacimiento = dateFormat.parse("27/11/1989");
		} catch (ParseException e) {
			System.out.println("Imposible Convertir la fecha asignada");
			e.printStackTrace();
		}
		persona.setFechaNacimiento(fechaNacimiento);
		
		return persona;
	}
	
	private Domicilio creaDomicilio(){
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle("Avenida Lago");
		domicilio.setNumeroExterior("45");
		domicilio.setNumeroInterior("511A");
		Colonia colonia = new Colonia();
		colonia.setIdentificador(2);
		domicilio.setColonia(colonia);
		TipoDomicilio tipoDomicilio = new TipoDomicilio();
		tipoDomicilio.setId(2);
		domicilio.setTipoDomicilio(tipoDomicilio);
		return domicilio;
	}
	
	private RolPersona creaRolPersona(){
		RolPersona rolPersona = new RolPersona();
		rolPersona.setId(2);
		return rolPersona;
	}

}
