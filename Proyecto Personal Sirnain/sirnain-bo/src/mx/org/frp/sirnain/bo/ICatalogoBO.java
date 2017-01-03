package mx.org.frp.sirnain.bo;

import java.util.List;

import mx.org.frp.sirnain.exception.SirnainBOException;

public interface ICatalogoBO {
	
	public List<String> listarTipoUsuario() throws SirnainBOException;
	public String encontrarTipousuarioPorId(int id) throws SirnainBOException;

}
