package com.wea.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.wea.Beans.User;
import com.wea.Tools.JDBCDBCPUtil;

public class UserDao {

	public User Login(String username,String password){
		  Connection conn = null;
	      String sql = "select * from t_user where username=? and password=?";
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	      User user = null;
		try {
		   	conn = JDBCDBCPUtil.getConn();
		   	stmt = conn.prepareStatement(sql);
		   	stmt.setString(1,username);
		   	stmt.setString(2,password);
		   	rs = stmt.executeQuery();
			if(rs.next()){
				user = new User();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(password);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			 JDBCDBCPUtil.freeConn(conn, stmt, rs);
		      
		}
		
		return user;
	}
}
