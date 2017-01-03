package mx.org.sirnain.utiles;

/**
 * 
 * @author Edgar L�pez
 * @category Gesti�n de los cat�logos.
 */
public class Catalogo {

	private Integer id;
	private String	descricpcion;
	
	public Catalogo(Integer id, String descricpion) {
		this.id = id;
		this.descricpcion = descricpion;
	}
	
	public Catalogo(){
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricpcion() {
		return descricpcion;
	}

	public void setDescricpcion(String descricpcion) {
		this.descricpcion = descricpcion;
	}
	
	/**
	 * Imprime el identificador y la descricpi�n del cat�logo
	 */
	public String listarCatalogo(){
		return "[El identificar es: ".concat(this.id.toString()).concat(" y su descripci�n es: ").concat(this.descricpcion).concat("]");
	}

	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", descricpcion=" + descricpcion + "]";
	}

}
