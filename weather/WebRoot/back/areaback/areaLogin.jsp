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
    
    <title>My JSP 'areaRegister.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <meta http-equiv="Content-Type" content="text/html;"><style type="text/css">

</style>

<style>
		body{
			margin: 0px;
			padding:0px;
			background-image: url("images/back.jpg"); 
		}
		.div1{
			width:400px;
			height:360px;
			border:1 solid balck;
			position:absolute;
			left:50%;
			top:50%;
			margin-top:-200px;
			margin-left:-200px;
		}
	
		.td1 {
			width:400px;
			height:200px;
			background-image: url("images/loginLogo.jpg");
		}
		
		.div1 tr{
			text-align: center;
			font-size: 12px;
			color: #3B3636;
		}
		
		.tdx{
			position:absolute;
			left:215px;
		}
		
		input{
			border:solid 1 balck;
			width:150px;
			height:18px;
			color: balck;
		}
	</style>
</head>
  
  <body>
      <div class="div1">
  <center>
<form action="areaServlet" method="post" width="500" height="360">
  <input type="hidden" name="method" value="arealogin"/>
  <table>
  <tr>
				<td class="td1"></td>
			</tr>
  <tr>
    <td colspan=2><table border="1" cellspacing="0" bordercolor="#000000" style="top: 60px; height: 230px; left: 2px; width: 389px;">
      
        <td width="386" height="35"><center><font size=4><b>姓名:</b></font>&nbsp;
          <input type="text" name="username" /></center></td>
      </tr>
   
      <tr>
        <td height="87"><center><font size=4><b>密码:</b></font>&nbsp;
          <input type="password" name="password" /></center></td>
      </tr>
   
      <tr>
        <td height="70"><center><font size=4><b>管理区域</b></font>
          <select name="address">
            <option value="east" selected>哈尔滨理工大学东区</option>
            <option value="west" >哈尔滨理工大学西区</option>
            <option value="south">哈尔滨理工大学南区</option>
          </select></center></td>
      </tr>
      <tr>
        <td height="56" colspan=2><center><input type="submit"  value="登录" />
       </center> </td>
      </tr>
    </table>
 
  </form>
  </center>
</div>
  </body>
</html>
