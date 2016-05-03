<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.dao.news_dao"%>
<%@page import="com.bean.news" %>
<%@page import="java.sql.*" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shownews.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <%request.setCharacterEncoding("utf-8"); %>


<%String ID=request.getParameter("id"); %>
  <%
    String userName="root";
String password="root";
String url="jdbc:mysql://localhost/weathermonitor";
String sql=null;
Connection con=null;
Statement stmt=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    
    }catch(ClassNotFoundException e)
    {
    out.print("加载出现异常");
    }
    try{
    con=DriverManager.getConnection(url,userName,password);
    stmt=con.createStatement();
    sql="select * from newsPolitical where id='"+ID+"'";
    ResultSet rs=stmt.executeQuery(sql);
   
   while(rs.next()){
   int id=rs.getInt(1);
   String title=rs.getString(2);
   String content=rs.getString(3);
  String s=content.replaceAll(" ","&nbsp");
  s=s.replaceAll("\n","<br>");
   request.setAttribute("content",content);
   
  Object a=session.getAttribute("id");

    %>   
  
    
    
 <p style="LINE-HEIGHT:30px"><font size="4"><%=s%></font></p>
 
 
 
 
 
<%
   }
   rs.close();
   stmt.close();     
    }catch(SQLException e)
 
 {
 out.print("出现SQLEXCEPTION异常");
 }   
 finally
 {
 try{
 if(con!=null)
 con.close();
 }catch(SQLException e)
 {out.print("数据库连接异常");}
 }
     %>    

  </body>
</html>
