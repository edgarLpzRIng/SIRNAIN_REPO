package mx.org.frp.sirnain.dao.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import mx.org.frp.sirnain.dao.TipoMonedaDAO;
import mx.org.frp.sirnain.dao.exception.SirnainDAOException;
import mx.org.frp.sirnain.dao.impl.TipoMonedaDAOImpl;
import mx.org.sirnain.model.TipoMoneda;

public class AltaTipoMonedaDAOImplIUTest {

	@Test
	public void altaTipoMoneda() {
		TipoMonedaDAO tipoMonedaDAO = new TipoMonedaDAOImpl();
		TipoMoneda tipoMoneda = new TipoMoneda();
		tipoMoneda.setDescricpcion("Euro");
		try {
			tipoMonedaDAO.altaTipoMoneda(tipoMoneda);
		} catch (SirnainDAOException e) {
			System.out.println("Error J_UNIT_TEST_CASE: "+e.getMessage());
		}
		
		System.out.println("EL tipo de moneda se actualizó a: "+tipoMoneda);
		
		assertTrue(tipoMoneda.getId()>0);
		
	}

}
