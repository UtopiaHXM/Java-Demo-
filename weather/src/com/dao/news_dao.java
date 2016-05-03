package com.dao;
import com.wea.Tools.JDBCDBCPUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class news_dao {
	//��ѯ��ݿ��е����
	public ResultSet query()
	{
		Connection con=null;
	    Statement stmt=null; 
		ResultSet rs=null;
		try{
			  
			   con=JDBCDBCPUtil.getConn();
			 
			stmt=con.createStatement(); 
			rs=stmt.executeQuery("select * from newspolitical");
		}catch(Exception e)
		{ 
			e.printStackTrace();
			return null;
		}
		return rs;		
	}	
	//����ݿ�������
	public void insert(String sql)
	{  
		Connection con=null;
		Statement stmt=null;
		try{
			con=JDBCDBCPUtil.getConn();
			stmt=con.createStatement();
			int affectRows=stmt.executeUpdate(sql);
	}
       catch(Exception e)
       {
    	   System.out.print(e.toString());
       }
       finally
       {
    	   
       }
		
	
	}
	
	//����ݿ���ɾ�����
	public void delete (String sql)
	{
		Connection con=null;
		Statement stmt=null;
		try{
			con=JDBCDBCPUtil.getConn();
			stmt=con.createStatement();
			int affectRows=stmt.executeUpdate(sql);	
	}
		catch(Exception e)
	       {
	    	   System.out.print(e.toString());
	       }
	       finally
	       {
	    	   
	       }
}
	
	
	public void update(String sql)
	{  
		Connection con=null;
		Statement stmt=null;
		try{
			con=JDBCDBCPUtil.getConn();
			stmt=con.createStatement();
			int affectRows=stmt.executeUpdate(sql);
	}
       catch(Exception e)
       {
    	   System.out.print(e.toString());
       }
       finally
       {
    	   
       }
		
	
	}
	
	
	}
//	
//	public static void main(String args[])
//	{stu_dao s=new stu_dao();
//	   student stu=new student();
//	ResultSet rss=s.query();
//	try {
//		while(rss.next())
//		{
//			int id=rss.getInt("stu_id");
//		    stu.setStu_id(id);
//		    String name=rss.getString("name");
//		    stu.setName(name);
//		    String address=rss.getString("address");
//		    stu.setAddress(address);
//		    System.out.print(id);
//		    System.out.print(name);
//		    System.out.print(address);
//		    
//			
//			
//		}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//
//		
//	}
//}



