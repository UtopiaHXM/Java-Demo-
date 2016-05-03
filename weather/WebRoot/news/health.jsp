<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'military.jsp' starting page</title>
    
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
   当前位置>>健康
   <br>
    <br>
    <br> 
   <a href="news/addPolitical.jsp">添加</a>
   <center>     
       <font size=5 color="blue" ><b><center>显示当前栏目下的新闻</center></b></font>
       <form action="">
       <table width=700 border=1>
       <tr>
       <td width=100 bgcolor="lightblue"><center><b>新闻ID</b></center></td>
       <td width=400 bgcolor="lightblue"><center><b>新闻标题</b></center></td>
       <td width=200 bgcolor="lightblue"><center><b>操作</b></center></td>
    </tr>
 
       </table>
      </form>       
       </center>
     
   
   
   
  </body>
</html>
