<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>国内</title>
    
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
        
        
   <hr color="black" width=100% size=1>
   
   当前位置 >>
   <script type="text/javascript">
    <!--
   var tle= document.title;
   document.write(tle);
    //->
    </script>
    
   <hr color="black" width=100% size=1>

     <center><font size=5 color="blue"><b>当前栏目下的目录</b></font></center>  
     <center>

     <table width=700 border=1>
     <tr>
     <td width=150 bgcolor="lightblue"><center><b>栏目ID</b></center></td>
     <td width=400 bgcolor="lightblue"> <center><b>名称</b></center></td>
     
     </tr>
     <tr>
     <td><center>1</center></td>
     <td><center>时政</center></td>
     
     </tr>
     <tr>
     <td><center>2</center></td>
     <td><center>港澳台</center></td>

 </tr>   
     </table>

 </center><br>
 
        
  </body>
</html>
