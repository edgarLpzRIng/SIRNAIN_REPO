package mx.org.sirnain.utiles;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Edgar López
 * @category Especialización del catálogo de Tipos de persona.
 *
 */
public class RolPersona extends Catalogo {
	
	private List<RolPersona> listaTipoPersona; 

	public RolPersona(Integer id, String descricpion) {
		super(id, descricpion);
	}
	
	public RolPersona(){
		super();
		listaTipoPersona = new ArrayList<>();
		listaTipoPersona.add(new RolPersona(1,"Administrador"));
		listaTipoPersona.add(new RolPersona(1,"Local"));
		listaTipoPersona.add(new RolPersona(1,"Web"));
	}
	
	public RolPersona getTipoPersonaPorId(int id) throws IndexOutOfBoundsException{
		try{
			return listaTipoPersona.get(id);
		} catch(IndexOutOfBoundsException e){
			throw new IndexOutOfBoundsException(e.getMessage());
		}
	}

	public List<RolPersona> getListaTipoPersona() {
		return listaTipoPersona;
	}

	public void setListaTipoPersona(List<RolPersona> listaTipoPersona) {
		this.listaTipoPersona = listaTipoPersona;
	}

}
