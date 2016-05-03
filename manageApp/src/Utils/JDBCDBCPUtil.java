package Utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class JDBCDBCPUtil {

	private static DataSource dataSource = null;
	
	static{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Properties properties = new Properties();
			InputStream inputStream = JDBCDBCPUtil.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
			properties.load(inputStream);
			dataSource =BasicDataSourceFactory.createDataSource(properties);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection(){
		try {
			Connection conn = dataSource.getConnection();
			
			return conn;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	
	    	return null;
	     }	
	}
	

	public static void free(Connection conn,Statement stmt,ResultSet rs) {
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				if(stmt!=null){
					stmt.close();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				try {
					if(conn !=null){
						conn.close();
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		}
	}
	
}
