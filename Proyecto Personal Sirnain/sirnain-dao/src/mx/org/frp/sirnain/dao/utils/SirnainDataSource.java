package mx.org.frp.sirnain.dao.utils;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class SirnainDataSource {
	
	private final static String DRIVER 			= "com.mysql.jdbc.Driver";
	private final static String USER_NAME 		= "root";
	private final static String USER_PASSWORD	= "edgar";
	private final static String URL_CONNECTION 	= "jdbc:mysql://localhost:3306/";
	private final static String DATABASE_NAME	= "sirnain";
	
	private DataSource dataSource;
	
	public SirnainDataSource(){
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(DRIVER);
		basicDataSource.setUrl(URL_CONNECTION.concat(DATABASE_NAME));
		basicDataSource.setUsername(USER_NAME);
		basicDataSource.setPassword(USER_PASSWORD);
		dataSource = basicDataSource;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
}
