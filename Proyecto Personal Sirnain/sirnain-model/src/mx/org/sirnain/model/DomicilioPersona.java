package mx.org.sirnain.model;

public class DomicilioPersona {
	
	private Persona persona;
	private Domicilio domicilio;
	
	public DomicilioPersona(Persona persona, Domicilio domicilio) {
		this.persona = persona;
		this.domicilio = domicilio;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
