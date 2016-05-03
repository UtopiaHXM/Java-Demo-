<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addPolitical.jsp' starting page</title>
    
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
   
    <font size=5 color="blue" ><b><center>添加新闻</center></b></font>
    <center>
       <form action="addServlet">
       <table width=700 border=1>
       <tr>
       <td width=200 bgcolor="lightblue"><center><b>新闻标题:</b></center></td>
       <td width=500 ><input type="text" name="HongKongTitle" ></td>
       </tr>
       <tr>
       <td width=500 bgcolor="lightblue"><center><b>新闻内容</b></center></td>
       <td><textarea rows="5" cols="55" name="HongKongContent"></textarea></td>
       </tr>
       <tr>
       <td colspan=2><center><input type="submit" value="提交"></center></td>
       </tr>
     </table>    
       </form>
 </center>
       <%
       
       String table="newshongkong";
       session.setAttribute("table", table);
       
      // String hongkongTitle=request.getParameter("HongKongTitle");
       session.setAttribute("title",request.getParameter("HongKongTitle"));
       //String hongkongContent="HongKongContent";
       session.setAttribute("content",request.getParameter("HongKongContent"));
       
     
        %>
   
   
   
  </body>
</html>
