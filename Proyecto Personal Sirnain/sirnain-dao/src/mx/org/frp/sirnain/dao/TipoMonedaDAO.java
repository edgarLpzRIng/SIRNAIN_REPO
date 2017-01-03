package mx.org.frp.sirnain.dao;

import mx.org.frp.sirnain.dao.exception.SirnainDAOException;
import mx.org.sirnain.model.TipoMoneda;

public interface TipoMonedaDAO {
	
	TipoMoneda actualizaTipoMoneda(TipoMoneda tipoMoneda) throws SirnainDAOException;
	TipoMoneda altaTipoMoneda(TipoMoneda tipoMoneda) throws SirnainDAOException;
	String bajaTipoMoneda(Integer idTipoMoneda) throws SirnainDAOException;

}
