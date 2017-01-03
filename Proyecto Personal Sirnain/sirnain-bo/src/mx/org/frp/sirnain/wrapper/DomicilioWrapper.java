package mx.org.frp.sirnain.wrapper;

import mx.org.frp.sirnain.exception.SirnainBOException;
import mx.org.sirnain.model.DomicilioPersona;

public class DomicilioWrapper {
	
	private String 		calle;
	private String		numeroExterior;
	private String		numeroInterior;
	private String 		colonia;
	private String 		codigoPostal;
	private String		ciudadMunicipio;
	private String 		pais;
	private DomicilioPersona	domicilio;
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public String getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCiudadMunicipio() {
		return ciudadMunicipio;
	}
	public void setCiudadMunicipio(String ciudadMunicipio) {
		this.ciudadMunicipio = ciudadMunicipio;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public DomicilioPersona getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(DomicilioPersona domicilio) {
		this.domicilio = domicilio;
	}
	
//	public DomicilioPersona toDomicilio() throws SirnainBOException{
//		domicilio.setCalle(calle);
//		domicilio.setCiudadMunicipio(ciudadMunicipio);
//		domicilio.setCodigoPostal(codigoPostal);
//		domicilio.setColonia(colonia);
//		try {
//			Integer numExterior = Integer.valueOf(numeroExterior);
//			domicilio.setNumeroExterior(numExterior);
//		} catch(NumberFormatException e){
//			throw new SirnainBOException("Error al registrar el numero exterior, el dato "+numeroExterior+" es inválido."+e.getMessage());
//		}
//		domicilio.setNumeroInterior(numeroInterior);
//		domicilio.setPais(pais);
//		return domicilio;
//	}

}
