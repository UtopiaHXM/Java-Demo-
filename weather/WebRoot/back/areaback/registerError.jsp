<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login_failed.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <form>
    <table align="center" width="724" height="400" background="images/bg6.jpg">
       <tr>
         <td>
         </td>
       </tr>
       <tr>
         <td align="center"><font size="6" color="#800080">两次输入密码不一致,请重新注册</font><font size="6"></font><br>
         <script type="text/javascript" language="javascript">
            window.setTimeout("window.location.href('http://localhost:8080/weather/back/areaback/areaRegister.jsp')",1500);
         </script>
           <a href="back/areaback/areaRegister.jsp"><font color="#BA55D3">
                           未正常跳转，请点击...</font></a>
         </td>
       </tr>
     </table>
  </form>

  </body>
</html>
