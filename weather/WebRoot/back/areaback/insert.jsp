<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.*,java.lang.*" %>
<%@ page import="com.wea.Dao.DataDao"%>
<%@ page import="com.wea.Beans.Data"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insert.jsp' starting page</title>
    
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
   <% String rootPath; // 创建根路径的保存变量
   String remoteAddr = request.getRemoteAddr(); //取得客户端的网络地址 
   String serverName = request.getServerName(); //获得服务器的名字 
   String realPath = request.getRealPath("/");//取得互联网程序的绝对地址 
   realPath = realPath.substring(0,realPath.lastIndexOf("\\")); 
   rootPath = realPath + "\\upload\\"; //创建文件的保存目录
   File file=new File(realPath,"\\upload");
   String str2[]=file.list();
   int j=str2.length;
   if(j==0){
   out.print(" 当前没有文件可以上传 ");
   }else{
   String ss=str2[j-1];
   String fileName=ss;
   FileReader fr=new FileReader(rootPath+fileName);
   int c=fr.read();
   String str1[]=new String[10];
   str1[9]=rootPath+fileName;
   String str=""; 
   int i=0; 
   DataDao Ddata=new DataDao();  
   Data data =new Data();
   while((c!=-1)){
   //out.print((char)c);
   str=str+(char)c; 
   c=fr.read();
  // out.print(str); 
   if(c==13){  
   out.print("<br>");  
   str1[i]=str;  
   out.print("str1["+i+"]是 "+str1[i]); 
   i++;
   fr.skip(1);
   c=fr.read();
   str="";
   }
   }
   fr.close();
   %>
   <%
   //data.setId(Integer.parseInt(str1[0])); 
   //int i=Integer.parseInt(str1[0]);
   //i=Integer.valueOf(s).intValue();
   //float f=Float.parseFloat(str1[5]);
   //double d=Double.parseDouble(str1[6]);
   //String s=i+"";   //会产生两个String对象
   //String s=String.valueOf(i); //直接使用String类的静态方法，只产生一个对象   
   //java.sql.Date date=java.sql.Date.valueOf(str1[1]); 
   data.setDate(java.sql.Date.valueOf(str1[1]));
   data.setTime(str1[2]);   
   data.setTemperature(Float.parseFloat(str1[3]));
   data.setHumidity(Float.parseFloat(str1[4]));
   data.setSO2(Float.parseFloat(str1[5]));
   data.setO3(Float.parseFloat(str1[6]));
   data.setDust(Float.parseFloat(str1[7]));
   data.setVoice(Float.parseFloat(str1[8]));
   data.setPath(str1[9]);
   out.println("savePath=="+str1[9]);
   Ddata.insertData(data); 
   out.print("插入数据成功 ");
   }
   %>
   </br>
   <a href="back/areaback/areaLogin.jsp"">点击重新登录</a>
  </body>
</html>
