<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="com.dao.news_dao"%>
<%@page import="com.bean.news" %>
<%@page import="java.sql.*" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>港澳台</title>
    
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
<font color="blue">  当前位置>>
   <script type="text/javascript">
    <!--
   var tle= document.title;
   document.write(tle);
    //->
    </script></font>
    <br>
    <br>
    <br>
   <a href="news/addHongKong.jsp">添加</a>
    <center>     
       <font size=5 color="blue" ><b><center>显示当前栏目下的新闻</center></b></font>
       <form action="">
       <table width=700 border=1>
       <tr>
       <td width=100 bgcolor="lightblue"><center><b>新闻ID</b></center></td>
       <td width=400 bgcolor="lightblue"><center><b>新闻标题</b></center></td>
       <td width=200 bgcolor="lightblue"><center><b>操作</b></center></td>
       </tr>
     <%     
      news_dao stud=new news_dao();
    news n=new news();   
    ResultSet rs=stud.query();
    while(rs.next())
    {
    int id=rs.getInt("id");
    n.setId(id);
    String title=rs.getString("title");
    n.setTitle(title);    
    session.setAttribute("n_title", title);
    String content=rs.getString("content");
    n.setContent(content);
    session.setAttribute("n_content", content);
    session.setAttribute("n_id", id);
     %>      
        <tr><td><a href="news/showContent.jsp?n_title=<%=String.valueOf(title)%>&n_content=<%=String.valueOf(content)%>&n_id=<%=String.valueOf(id)%>"><%=session.getAttribute("n_id")%></a></td>    
    <td><%=n.getTitle()%></td>
    
            <td>
    <a href="deleteServlet?n_id=<%=String.valueOf(id)%>">删除</a>
            </td>
    </tr>
    <%}%>    
       </table>
      </form>       
       </center>
      <%
      String table="newshongkong";
      session.setAttribute("table", table);
      
       %>
  </body>
</html>
