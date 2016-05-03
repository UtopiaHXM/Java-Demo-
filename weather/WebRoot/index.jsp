<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>环境监测网站首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body background="images/bg.jpg">
    <jsp:include page="top.jsp"></jsp:include>    
    <table width="1002" height="600" align="center" border="0" cellpadding="0" cellspacing="0" background="images/mlbg.jpg">
      <tr>
       <td>
        <iframe name="leftFrame" src="left.jsp" width="200" height="600" align="left" scrolling="auto" marginheight="2" marginwidth="2" frameborder="0" style="border-right-color: paleturquoise"></iframe> 
       </td>
       <td>
        <iframe name="rightFrame" src="right.html" width="800" height="600" align="right" scrolling="auto" frameborder="0" marginheight="2" marginwidth="2"></iframe>
       </td>
      </tr>
     </table>
  </body>
  <noframes>
    <body>浏览器版本过低，无法正常显示，请升级浏览器</body>
  </noframes>
</html>
