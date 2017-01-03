package mx.org.frp.sirnain.bo;

import mx.org.frp.sirnain.exception.SirnainBOException;
import mx.org.frp.sirnain.wrapper.PersonaWrapper;
import mx.org.sirnain.model.Persona;

public interface IAdministraPersonaBO {

	/**
	 * Registra a una persona en el sistema 
	 * @param persona Persona a registrar
	 * @return Devuleve a la persona registrada con su identificador asignado
	 * @throws SirnainBOException 
	 */
	Persona registrarPersona(PersonaWrapper persona) throws SirnainBOException;
	/**
	 * Actualiza a una persona registrada en el sistema
	 * @param persona Datos de la persona a actualizar por el id.
	 * @return Mensaje de actualización
	 * @throws SirnainBOException
	 */
	String actualizarPersona(PersonaWrapper persona) throws SirnainBOException;
	/**
	 * Elimina de manera lógica a una persona registrada en el sistema
	 * @param persona Persona a eliminar de manera lógica del sistema
	 * @return mensaje de eliminado
	 * @throws SirnainBOException
	 */
	String eliminarPersona(PersonaWrapper persona) throws SirnainBOException;
	
}
