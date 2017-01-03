package mx.org.frp.sirnain.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import mx.org.frp.sirnain.dao.TipoMonedaDAO;
import mx.org.frp.sirnain.dao.exception.SirnainDAOException;
import mx.org.frp.sirnain.dao.utils.SirnainDataSource;
import mx.org.sirnain.model.TipoMoneda;

public class TipoMonedaDAOImpl implements TipoMonedaDAO {
	
	private DataSource dataSource;
	
	public TipoMonedaDAOImpl() {
		this.dataSource = new SirnainDataSource().getDataSource();
	}

	@Override
	public TipoMoneda actualizaTipoMoneda(TipoMoneda tipoMoneda) throws SirnainDAOException {
		String sql = "update tipo_moneda set descripcion = ? where id = ? ";
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			){
			pst.setString(1, tipoMoneda.getDescricpcion());
			pst.setInt(2, tipoMoneda.getId());
			pst.executeUpdate();
			
			try(ResultSet rs = pst.getGeneratedKeys();){
				if(rs.next()){
					tipoMoneda.setId(rs.getInt(1));
				}
			}
			
		}catch (SQLException e) {
			throw new SirnainDAOException("Excepcion en TipoMonedaDAOImpl.altaTipoMoneda: "+e.getMessage());
		}
		return tipoMoneda;
	}

	@Override
	public TipoMoneda altaTipoMoneda(TipoMoneda tipoMoneda) throws SirnainDAOException {
		String sql = "insert into tipo_moneda (descripcion) values (?)";
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			){
			pst.setString(1, tipoMoneda.getDescricpcion());
			pst.executeUpdate();
			
			try(ResultSet rs = pst.getGeneratedKeys();){
				if(rs.next()){
					tipoMoneda.setId(rs.getInt(1));
				}
			}
			
		}catch (SQLException e) {
			throw new SirnainDAOException("Excepcion en TipoMonedaDAOImpl.altaTipoMoneda: "+e.getMessage());
		}
		return tipoMoneda;
	}

	@Override
	public String bajaTipoMoneda(Integer idTipoMoneda) throws SirnainDAOException {
		String sql = "delete from tipo_moneda where id = ? ";
		try(
			Connection conn = dataSource.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			){
			pst.setInt(1, idTipoMoneda);
			pst.executeUpdate();
			return "Moneda eliminada";
			
		}catch (SQLException e) {
			throw new SirnainDAOException("Excepcion en TipoMonedaDAOImpl.altaTipoMoneda: "+e.getMessage());
		}
	}

}
