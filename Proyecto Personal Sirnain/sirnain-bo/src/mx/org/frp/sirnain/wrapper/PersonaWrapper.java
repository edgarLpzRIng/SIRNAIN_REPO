package mx.org.frp.sirnain.wrapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import mx.org.frp.sirnain.exception.SirnainBOException;
import mx.org.sirnain.model.Persona;
import mx.org.sirnain.utiles.RolPersona;

public class PersonaWrapper {
	
	private String 				nombre;
	private String 				primerApellido;
	private String 				segundoApellido;
	private String 				usuario;
	private String 				contrasenia;
	private String 				correo;
	private Integer				idTipoPersona;
	private String				fechaNacimiento;
	private DomicilioWrapper	domicilioWrapper;
	private Persona				persona;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Integer getIdTipoPersona() {
		return idTipoPersona;
	}
	public void setIdTipoPersona(Integer idTipoPersona) {
		this.idTipoPersona = idTipoPersona;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public DomicilioWrapper getDomicilioWrapper() {
		return domicilioWrapper;
	}
	public void setDomicilioWrapper(DomicilioWrapper domicilioWrapper) {
		this.domicilioWrapper = domicilioWrapper;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public Persona toPersona() throws SirnainBOException{
		persona.setPassword(contrasenia);
		persona.setCorreo(correo);
//		persona.setDomicilioPersona(domicilioWrapper.toDomicilio());
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
		try{
			fechaDate = formato.parse(fechaNacimiento);
			persona.setFechaNacimiento(fechaDate);
		}catch(ParseException e){
			throw new SirnainBOException("Error al convertir la fecha. Debe tener un formato \"dd/mm/aaaa\" "+e.getMessage());
		}
		persona.setNombre(nombre);
		persona.setPrimerApellido(primerApellido);
		persona.setSegundoApellido(segundoApellido);
		RolPersona tipoPersona = new RolPersona();
		try{
//			persona.setTipoPersona(tipoPersona.getTipoPersonaPorId(idTipoPersona));
		} catch(IndexOutOfBoundsException e){
			throw new SirnainBOException("El tipo de persona ingresado no existe. "+e.getMessage());
		}
		persona.setUsuario(usuario);
		return persona;
	}

}
