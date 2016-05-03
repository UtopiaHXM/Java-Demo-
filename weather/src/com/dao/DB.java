/*package com.dao;
//import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;

public class DB {
	static String userName="root";
	static String password="jiangyan";
	static String url="jdbc:mysql://localhost/weather";
	static Connection con=null;
	static Statement stmt=null;
	
	static{
	try{	
		Class.forName("com.mysql.jdbc.Driver");	
	
		}
	catch(ClassNotFoundException e)
	{
		System.out.print("加载异常");
	}
	
	}
	
	
	public static Connection getConnection()
	{
		try{
			
			Class.forName("com.mysql.jdbc.Driver");	
	}catch(ClassNotFoundException e)
	{
		e.printStackTrace();	
	}	
		
		try{
			
			Connection con=DriverManager.getConnection(url, userName, password);
			return con;
					}
		catch(SQLException e)
		{
			e.toString();
			return null;
		}
	}
	
	
	
	
	public static void free(Connection con,Statement stmt,ResultSet rs)
	{
		try{
			if(rs!=null)
			{
				rs.close();
	}
	}catch(SQLException e )
	{
		e.printStackTrace();
	}
		finally{
			try{
				if(stmt!=null)
				{
					stmt.close();
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally{
				try{
				if(con!=null)
				{
					con.close();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			}						
		}		
	}
}

*/