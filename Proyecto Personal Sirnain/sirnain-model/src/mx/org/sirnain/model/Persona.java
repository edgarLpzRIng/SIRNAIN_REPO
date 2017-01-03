package mx.org.sirnain.model;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author Edgar López
 * @category Administración de la persona.
 */
public class Persona {

	private Integer		idPersona;
	private String 		nombre;
	private String 		primerApellido;
	private String 		segundoApellido;
	private String 		usuario;
	private String 		password;
	private String 		correo;
	private Date		fechaNacimiento;
	private List<DomicilioPersona>	domicilioPersona;
	private List<Perfil>perfiles;
	
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public List<DomicilioPersona> getDomicilioPersona() {
		return domicilioPersona;
	}
	public void setDomicilioPersona(List<DomicilioPersona> domicilio) {
		this.domicilioPersona = domicilio;
	}
	public List<Perfil> getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", primerApellido=" + primerApellido
				+ ", segundoApellido=" + segundoApellido + ", usuario=" + usuario + ", password=" + password
				+ ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	

}
