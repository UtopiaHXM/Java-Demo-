package com.wea.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.wea.Beans.AreaUser;
import com.wea.Tools.JDBCDBCPUtil;

public class AreaDao {
	public AreaUser Login(String username,String password,String address){
		  Connection conn = null;
	      String sql = "select * from t_areaadmin where username=? and password=? and address=?";
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	      AreaUser  areaUser = null;
		try {
		   	conn = JDBCDBCPUtil.getConn();
		   	stmt = conn.prepareStatement(sql);
		   	stmt.setString(1,username);
		   	stmt.setString(2,password);
		   	stmt.setString(3, address);
		   	rs = stmt.executeQuery();
			if(rs.next()){
				areaUser = new AreaUser();
				areaUser.setId(rs.getInt(1));
				areaUser.setUsername(rs.getString(2));
				areaUser.setPassword(rs.getString(3));
				areaUser.setAddress(rs.getString(4));
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			 JDBCDBCPUtil.freeConn(conn, stmt, rs);
		      
		}
		
		return areaUser;
	}
	public void register(AreaUser areaUser){
		Connection conn = null;
	      String sql = "insert into t_areaadmin(username,password,address) values(?,?,?)";
	      PreparedStatement stmt = null;
	      try{
	    		conn = JDBCDBCPUtil.getConn();
			   	stmt = conn.prepareStatement(sql);
			   	stmt.setString(1,areaUser.getUsername());
			   	stmt.setString(2, areaUser.getPassword());
			   	stmt.setString(3, areaUser.getAddress());
			    int n = stmt.executeUpdate();
			  System.out.println("插入成功了："+n);
	      }catch(Exception e){
	    	  e.printStackTrace();
	      }finally{
				 JDBCDBCPUtil.freeConn(conn, stmt, null);
	      }
	}
	
	
}
