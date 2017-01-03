package mx.org.sirnain.model;

import mx.org.sirnain.utiles.RolPersona;

public class Perfil {
	
	private Persona 	persona;
	private RolPersona	tipoUsuario;

	public Perfil(Persona usuario, RolPersona tipoUsuario) {
		this.persona = usuario;
		this.tipoUsuario = tipoUsuario;
	}
	
	public Persona getUsuario() {
		return persona;
	}
	public void setUsuario(Persona usuario) {
		this.persona = usuario;
	}
	public RolPersona getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(RolPersona tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	@Override
	public String toString() {
		return "Perfil [usuario=" + persona + ", tipoUsuario=" + tipoUsuario + "]";
	}

}
