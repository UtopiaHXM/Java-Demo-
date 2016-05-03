package com.wea.Tools;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class JDBCDBCPUtil {
	private static String user = "root";
	private static String password = "root";
	private static String Url = "jdbc:mysql://localhost:3306/weathermonitor";
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//获取数据库连接
	public static Connection getConn(){
		
		Connection conn = null;
		try {
			conn  = DriverManager.getConnection(Url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	//关闭数据库，释放链接
	public static void freeConn(Connection conn,Statement stmt,ResultSet rs){
		try {
			if(rs!=null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				if(stmt!=null){
					stmt.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				try {
					if(conn!=null){
						conn.close();
					}
				} catch (Exception e3) {
					// TODO: handle exception
					e3.printStackTrace();
				}
			}
		}
	}
	
}
