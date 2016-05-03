<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
    <font size=6 color=" #0000A0 " dir="ltr" face="·ÂËÎ, Fixedsys"><b>区域管理员注册</b></font>
        <form action="registerServlet" method="post" target="rightFrame">
       <input type="hidden" name="method" value="arealogin"/>
	  <table  style="top: 16px; height: 346px;"  border="1" cellspacing="0" bordercolor="#000000" style="top: 60px; height: 230px; left: 2px; width: 389px;">
             <tr>
				<td class="td1"></td>
			</tr> 
             <tr>
                 <td> <font size=4 color="#0000CD" dir="ltr" face="·ÂËÎ, Fixedsys">&nbsp;用户名:&nbsp;&nbsp;</font> 
                  <input id="userID" name="username" value="" size="15" type="text"></td>
             </tr>			 
             <tr>
                 <td> <font size=4 color="#0000CD" dir="ltr" face="·ÂËÎ, Fixedsys">密码:&nbsp;&nbsp;&nbsp;&nbsp;</font> 
                 <input id="password" name="password" value="" size="15" type="password"></td>
             </tr> 
             <tr>
                 <td> <font size=4 color="#0000CD" dir="ltr" face="·ÂËÎ, Fixedsys">确认密码:</font>
                <input id="password" name="confirmPassword" value="" size="15" type="password"></td>
             </tr>
			
             <tr>
               <td>   <font size=4 color="#0000CD" dir="ltr" face="·ÂËÎ, Fixedsys">管理区域:</font> 
                 <select name="address"> 
                      <option value="east" selected>  哈尔滨理工大学东区</option> 
                      <option value="west" >哈尔滨理工大学西区</option> 
                      <option value="south">哈尔滨理工大学南区</option> 
                   </select></td>
             </tr>
             
			  <tr>
           <td >     <input type="submit"  value="注册" ></td>
              </tr></table>
      </form>
       </div>
</body>

