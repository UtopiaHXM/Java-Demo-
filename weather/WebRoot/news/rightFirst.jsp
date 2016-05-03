<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'rightFirst.jsp' starting page</title>
    
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

 <center><font color="blue" size="5"><b>显示一级栏目目录</b></font> </center><br>

 <center>

 <table border=1 width=700 >
 <tr>
<td width=150 bgcolor="lightblue"> <center><b>栏目ID</b></center></td>
 <td width=400 bgcolor="lightblue"><center><b>名称</b></center></td>

 </tr>
 
 <tr>
 <td><center>1</center></td>
 <td>国内</td>

 </tr>
 
  <td><center>2</center></td>
 <td>国际</td>
</tr>
 <tr>
  <td><center>3</center></td>
 <td>网络</td>
</tr>
 <tr>
  <td><center>4</center></td>
 <td>体育</td>
</tr>
 <tr>
  <td><center>5</center></td>
 <td>健康</td>
</tr>
 <tr>
  <td><center>6</center></td>
 <td>生活</td>
</tr>
 <tr>
  <td><center>7</center></td>
 <td>社会</td>

 </tr>
 </table ><br>

 
  </body>
</html>
