package mx.org.frp.sirnain.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import mx.org.frp.sirnain.dao.TipoMonedaDAO;
import mx.org.frp.sirnain.dao.exception.SirnainDAOException;
import mx.org.sirnain.model.TipoMoneda;

public class BajaTipoMonedaDAOImplIUTest {

	@Test
	public void test() {
		TipoMonedaDAO tipoMonedaDAO = new TipoMonedaDAOImpl();
		TipoMoneda tipoMoneda = new TipoMoneda();
		//Colocar el ID de la moneda a eliminar.
		tipoMoneda.setId(3);
		tipoMoneda.setDescricpcion("Euro");
		String mensaje = "";
		try {
			mensaje = tipoMonedaDAO.bajaTipoMoneda(tipoMoneda.getId());
		} catch (SirnainDAOException e) {
			System.out.println("Error J_UNIT_TEST_CASE: "+e.getMessage());
		}
		
		System.out.println("Baja Tipo Moneda: "+mensaje);
		
		assertTrue(!mensaje.isEmpty());
	}

}
