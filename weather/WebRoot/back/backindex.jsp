<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println("basePath=="+basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'backindex.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
   <frameset rows="70,*" cols="*" frameborder="yes" border="1">
  <frame src="news/new_top.html" name="topFrame" scrolling="no">
  <frameset rows="40,*"  frameborder="yes" border="1">
  <frame src="news/middle.html" name="middleFrame" scrolling="no">


  <frame src="news/rightFirst.html" name="rightFrame">

  </frameset>
  </frameset>
  <noframes> 
  <body>   
  </body></noframes>
</html>
