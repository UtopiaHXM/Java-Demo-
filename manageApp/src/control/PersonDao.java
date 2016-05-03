package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.org.apache.regexp.internal.recompile;


import Utils.JDBCDBCPUtil;
import beans.Person;

public class PersonDao {

	//查找
	
	/*
	 * 按姓名查找
	 */
	public  static Person findByname(Person person){
		  
		  Person p = null;
		  Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	
	    String sql = "select * from t_person where Name='"+person.getName()+"'";
	      
	      try {
	    	  
	    	  conn = JDBCDBCPUtil.getConnection();
	    	  conn.setAutoCommit(false);
System.out.println("*****"+person.getName());
              stmt = conn.prepareStatement(sql);
			  //stmt.setString(1, person.getName());
			  //stmt.setString(2, person.getTel());
			  //stmt.setString(3, person.getEmail());
			  
			  rs = stmt.executeQuery(sql);
			  
			  while(rs.next()){

				  p = new Person(null, null, null);
				  p.setId(rs.getInt(1));
				  p.setName(rs.getString(2));
				  p.setTel(rs.getString(3));
				  p.setEmail(rs.getString(4));
			  }
			  
			  conn.commit();
			  
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
			  try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    }finally{
		    	JDBCDBCPUtil.free(conn, stmt, rs);
		    }
		    
		  return p;
	}
	
	/*
	 * 按Tel查找
	 */
	public  static Person findByTel(Person person){
		  
		  Person p = null;
		  Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	
	    String sql = "select * from t_person where Tel='"+person.getTel()+"'";
	      
	      try {
	    	  
	    	  conn = JDBCDBCPUtil.getConnection();
	    	  conn.setAutoCommit(false);
System.out.println("*****"+person.getTel());
              stmt = conn.prepareStatement(sql);
			  //stmt.setString(1, person.getName());
			  //stmt.setString(2, person.getTel());
			  //stmt.setString(3, person.getEmail());
			  
			  rs = stmt.executeQuery(sql);
			  
			  while(rs.next()){

				  p = new Person(null, null, null);
				  p.setId(rs.getInt(1));
				  p.setName(rs.getString(2));
				  p.setTel(rs.getString(3));
				  p.setEmail(rs.getString(4));
			  }
			  
			  conn.commit();
			  
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
			  try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    }finally{
		    	JDBCDBCPUtil.free(conn, stmt, rs);
		    }
		    
		  return p;
	}
	
	/*
	 * 按姓名查找
	 */
	public  static Person findByEmail(Person person){
		  
		  Person p = null;
		  Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	
	    String sql = "select * from t_person where Email='"+person.getEmail()+"'";
	      
	      try {
	    	  
	    	  conn = JDBCDBCPUtil.getConnection();
	    	  conn.setAutoCommit(false);
System.out.println("*****"+person.getEmail());
              stmt = conn.prepareStatement(sql);
			  //stmt.setString(1, person.getName());
			  //stmt.setString(2, person.getTel());
			  //stmt.setString(3, person.getEmail());
			  
			  rs = stmt.executeQuery(sql);
			  
			  while(rs.next()){

				  p = new Person(null, null, null);
				  p.setId(rs.getInt(1));
				  p.setName(rs.getString(2));
				  p.setTel(rs.getString(3));
				  p.setEmail(rs.getString(4));
			  }
			  
			  conn.commit();
			  
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
			  try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    }finally{
		    	JDBCDBCPUtil.free(conn, stmt, rs);
		    }
		    
		  return p;
	}
	
	/*
	 * 全条件查找
	 */
	public  static Person find(Person person){
		  
		  Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	      Person p = null;
	
	      String sql = "select * from t_person where Name='"+person.getName()+"'AND Tel='"+person.getTel()+"'AND Email='"+person.getEmail()+"'";
	      
	      try {
	    	  
	    	  conn = JDBCDBCPUtil.getConnection();
	    	  conn.setAutoCommit(false);
System.out.println("========"+person.getName());
System.out.println("========"+person.getTel());
System.out.println("========"+person.getEmail());
              stmt = conn.prepareStatement(sql);

			  /*stmt.setString(1, person.getName());
			  stmt.setString(2, person.getTel());
			  stmt.setString(3, person.getEmail());
			  */
			  rs = stmt.executeQuery(sql);
			  while(rs.next()){

				  p = new Person(null, null, null);
				  p.setId(rs.getInt(1));
				  p.setName(rs.getString(2));
				  p.setTel(rs.getString(3));
				  p.setEmail(rs.getString(4));
			  }
			  
			  conn.commit();
			  
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
			  try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    }finally{
		    	JDBCDBCPUtil.free(conn, stmt, rs);
		    }
	      
		  return p;
	}
	
	public static void delete(Person person){
		
		  Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	      
	      String sql = "delete from t_person where Name='"+person.getName()+"'AND Tel='"+person.getTel()+"'AND Email='"+person.getEmail()+"'";
	      
	      try {
	    	  
	    	  conn = JDBCDBCPUtil.getConnection();
	    	  conn.setAutoCommit(false);
	    	  stmt = conn.prepareStatement(sql);
			  
			  stmt.executeUpdate(sql);
System.out.println("删除成功");			  
			  conn.commit();
			  
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
			  try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    }finally{
		    	JDBCDBCPUtil.free(conn, stmt, rs);
		    }

	}
	
	public static void add(Person person){
		
		  Connection conn = null;
	      PreparedStatement stmt = null;
	      ResultSet rs = null;
	
	      String sql = "insert into t_person values(null,'"+person.getName()+"','"+person.getTel()+"','"+person.getEmail()+"')";
System.out.println(sql);
	      try {
	    	  
	    	  conn = JDBCDBCPUtil.getConnection();
	    	  conn.setAutoCommit(false);
	    	  stmt = conn.prepareStatement(sql);
			 
			  stmt.executeUpdate(sql);
System.out.println("插入成功");
			  conn.commit();
			  
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			  e.printStackTrace();
			  try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    }finally{
		    	JDBCDBCPUtil.free(conn, stmt, rs);
		    }

		
	}
}
