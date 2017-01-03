package mx.org.sirnain.model;

public class Domicilio {
	
	private Integer id;
	private String	calle;
	private String 	numeroExterior;
	private String	numeroInterior;
	private Colonia	colonia;
	private TipoDomicilio tipoDomicilio;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Colonia getColonia() {
		return colonia;
	}
	public void setColonia(Colonia idColonia) {
		this.colonia = idColonia;
	}
	public TipoDomicilio getTipoDomicilio() {
		return tipoDomicilio;
	}
	public void setTipoDomicilio(TipoDomicilio idTipoDomicilio) {
		this.tipoDomicilio = idTipoDomicilio;
	}

}
