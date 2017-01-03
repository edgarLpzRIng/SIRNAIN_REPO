package mx.org.sirnain.utiles;

/**
 * 
 * @author Edgar López
 * @category Gestión de los catálogos.
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
	 * Imprime el identificador y la descricpión del catálogo
	 */
	public String listarCatalogo(){
		return "[El identificar es: ".concat(this.id.toString()).concat(" y su descripción es: ").concat(this.descricpcion).concat("]");
	}

	@Override
	public String toString() {
		return "Catalogo [id=" + id + ", descricpcion=" + descricpcion + "]";
	}

}
