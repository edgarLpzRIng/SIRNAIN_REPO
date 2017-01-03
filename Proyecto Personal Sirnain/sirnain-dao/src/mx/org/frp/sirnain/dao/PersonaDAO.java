package mx.org.frp.sirnain.dao;

import java.util.List;

import mx.org.sirnain.model.Domicilio;
import mx.org.sirnain.model.Persona;
import mx.org.sirnain.utiles.RolPersona;

public interface PersonaDAO {
	
	Persona guardarPersona(Persona persona, Domicilio domicilio, RolPersona rolPersona);

}
