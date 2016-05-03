<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<title>top</title>
<style type="text/css">
<!--
body {
	background-image: url(images/bg.jpg);
}
.style15 {font-size: x-large; font-weight: bold; }
-->
</style></head>

<body>

<table width="1000" border="0" cellpadding="0" cellspacing="0" align="center">
<tr>
    <td><a href="index.jsp" ><img src="images/top2.jpg" alt="回到首页" border="0"></a></td>
  </tr>
  <tr>
    <td background="images/bg7.jpg"><span class="style1"></span>		        
		<font color="#6633CC" dir="ltr" face="·ÂËÎ, Fixedsys"><a href="back/newsLogin.jsp" target="rightFrame">新闻管理员登录</a>&nbsp;&nbsp;&nbsp; <a href="back/areaback/areaLogin.jsp" target="rightFrame"> 区域管理员登录</a></font>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<font color="#6633CC" dir="ltr" face="·ÂËÎ, Fixedsys">&nbsp;</font><font color="#6633CC" dir="ltr" face="·ÂËÎ, Fixedsys"><a href="back/areaback/areaRegister.jsp" target="rightFrame">区域管理注册</a>&nbsp;&nbsp; <a href="back/areaback/logout.jsp">注销</a></font>			  
	</td>
  </tr>
</table>
</body>
</html>
