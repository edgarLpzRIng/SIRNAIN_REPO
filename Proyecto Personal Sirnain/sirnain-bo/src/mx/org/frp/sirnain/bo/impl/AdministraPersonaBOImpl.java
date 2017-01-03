package mx.org.frp.sirnain.bo.impl;

import mx.org.frp.sirnain.bo.IAdministraPersonaBO;
import mx.org.frp.sirnain.exception.SirnainBOException;
import mx.org.frp.sirnain.wrapper.PersonaWrapper;
import mx.org.sirnain.model.Persona;

/**
 * 
 * @author Edgar López
 * @category Interface de administración de personas Business Object 
 */
public class AdministraPersonaBOImpl implements IAdministraPersonaBO {

	@Override
	public Persona registrarPersona(PersonaWrapper registrarPersona) throws SirnainBOException {
		Persona persona = registrarPersona.toPersona();
		//Simulamos que la persona se registra en la BD con el siguiente ID.
		Double idUsuario = Math.random() * Math.PI;
		persona.setIdPersona(idUsuario.intValue());
		//Regresa a la persona registrada
		return persona;
	}

	@Override
	public String actualizarPersona(PersonaWrapper persona) {
		//TODO implementar cuando se encuentre la BD.
		return "Persona Actualzada Exitosamente";
	}

	@Override
	public String eliminarPersona(PersonaWrapper persona) {
		// TODO Implementar cuando el sistema cuente con la BD
		return "Persona dada de baja exitosamente.";
	}

}
