package mx.org.frp.sirnain.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.sql.DataSource;

import mx.org.frp.sirnain.dao.PersonaDAO;
import mx.org.frp.sirnain.dao.utils.SirnainDataSource;
import mx.org.sirnain.model.Domicilio;
import mx.org.sirnain.model.DomicilioPersona;
import mx.org.sirnain.model.Perfil;
import mx.org.sirnain.model.Persona;
import mx.org.sirnain.utiles.RolPersona;

public class PersonaDAOImpl implements PersonaDAO {
	
	private DataSource dataSource;
	
	public PersonaDAOImpl() {
		dataSource = new SirnainDataSource().getDataSource();
	}

	@Override
	public Persona guardarPersona(Persona persona, Domicilio domicilio, RolPersona rolPersona) {
		Connection conn = null;
		String sql = "insert into persona "
				+ " (nombre,primer_apellido,segundo_apellido,usuario,password,email, fecha_nacimiento, fecha_alta) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = dataSource.getConnection();
			conn.setAutoCommit(false);
			try(PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);){
				
				Calendar cal = Calendar.getInstance();
				Timestamp timeStamp = new Timestamp(cal.getTimeInMillis());
				
				pst.setString(1, persona.getNombre());
				pst.setString(2, persona.getPrimerApellido());
				pst.setString(3, persona.getSegundoApellido());
				pst.setString(4, persona.getUsuario());
				pst.setString(5, persona.getPassword());
				pst.setString(6, persona.getCorreo());
				pst.setDate(7, new Date(persona.getFechaNacimiento().getTime()));
				pst.setTimestamp(8, timeStamp);
				
				pst.executeUpdate();
				
				try(ResultSet rs = pst.getGeneratedKeys();){
					if(rs.next()){
						persona.setIdPersona(rs.getInt(1));
					}
				}
				
				sql = "insert into domicilio "
						+ " (calle, num_exterior, num_interior, id_colonia, id_tipo_domicilio) "
						+ " values (?, ?, ?, ?, ?);";
				
				try(PreparedStatement pstDom = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
					
					pstDom.setString(1, domicilio.getCalle());
					pstDom.setString(2, domicilio.getNumeroExterior());
					pstDom.setString(3, domicilio.getNumeroInterior());
					pstDom.setInt(4, domicilio.getColonia().getIdentificador());
					pstDom.setInt(5, domicilio.getTipoDomicilio().getId());
					
					pstDom.executeUpdate();
					
					try(ResultSet rs = pstDom.getGeneratedKeys();){
						if(rs.next()){
							domicilio.setId(rs.getInt(1));
							
							sql = "insert into domicilio_persona (id_persona,id_domicilio,fecha_alta) values (?,?,?) ";
							List<DomicilioPersona> domiciliosPersona = new ArrayList<>();
							try(PreparedStatement pstDomPer = conn.prepareStatement(sql)){
								pstDomPer.setInt(1, persona.getIdPersona());
								pstDomPer.setInt(2, domicilio.getId());
								pstDomPer.setTimestamp(3, timeStamp);
								pstDomPer.executeUpdate();
								
								DomicilioPersona domPer = new DomicilioPersona(persona, domicilio);
								domiciliosPersona.add(domPer);
								persona.setDomicilioPersona(domiciliosPersona);
								
							}
						}
					}
				}
				sql = "insert into perfil (id_usuario,id_rol_usuario) values (?, ?)";
				List<Perfil> perfiles = new ArrayList<>();
				try(PreparedStatement pstPer = conn.prepareStatement(sql)){
					pstPer.setInt(1, persona.getIdPersona());
					pstPer.setInt(2, rolPersona.getId());
					
					pstPer.executeUpdate();
					
					Perfil perfil = new Perfil(persona, rolPersona);
					perfiles.add(perfil);
					
					persona.setPerfiles(perfiles);					
				}
			}
			conn.commit();
		} catch (Exception e) {
			try {conn.rollback();} catch(Exception ex){}
			System.out.println("Excepcion en UsuarioDAOImpl: " + e.getMessage());
		} finally {
			if(conn!=null){
				try {
					conn.close();
				} catch(Exception ex){}
			}
		}
		return persona;
	}

}
