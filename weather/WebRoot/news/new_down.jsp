<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
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
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" /> 
    <title>�������</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 <!--ͼƬ������ʽ-->
   <style type="text/css">
        * { padding:0; margin:0;}
        body { text-align:center;width:800px;}
        
        #photo-list {
             /* 3��ͼƬ�Ŀ�ȣ�������ȡ�padding��border��ͼƬ������ף�
                 ���㣺3*(100+2*2+1*2+9) - 9
                 ֮���Լ�ȥ9�ǵ�����ͼƬ���ұ�����
             */
          
            width:800px;
            /* ͼƬ�Ŀ�ȣ������߶ȡ�padding��border��
                ���㣺100+2*2+1*2
            */
            height:150px;
            margin:0px auto;
            overflow:hidden;
            border:1px dashed #ccc;
        }
        #photo-list ul { list-style:none;}
        #photo-list li { float:left; padding-right:9px;}
        #photo-list img { border:1px solid #ddd; background:#fff; padding:2px;}
    </style>  
  </head>
<body>
  <font color="blue" size="4" ><p align="left"><img src="images/dh1.gif" widyh="150" height="30"></p></font><br>
    <table>
    <%
    String userName="root";
String password="root";
String url="jdbc:mysql://localhost/weathermonitor";
String sql=null;
Connection con=null;
Statement stmt=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    
    }catch(ClassNotFoundException e)
    {
    out.print("���س����쳣");
    }
    try{
    con=DriverManager.getConnection(url,userName,password);
    stmt=con.createStatement();
    sql="select * from newsPolitical";
    ResultSet rs=stmt.executeQuery(sql);
   
   while(rs.next()){
   int id=rs.getInt(1);
   String title=rs.getString(2);
   String content=rs.getString(3);
  
   request.setAttribute("content",content);
   %> 
 
   
   <tr>
   <td   style="BORDER-bottom: rgb(0,0,0) 1px dotted;">
   
     <p align="left"><font color="purple" size="5">
    <a href="news/shownews.jsp?content=<%=String.valueOf(content)%>"></a>
  <a href="news/shownews.jsp?id=<%=id%>">
    <%
  Object a=session.getAttribute("id");
    %>
    <li><%=title %><img src="images/sd.gif"></li>
   
    </a>
</font>
     </p>
   </td>
   
   
   
  
 
<%
   }
   rs.close();
   stmt.close();     
    }catch(SQLException e)
 
 {
 out.print("����SQLEXCEPTION�쳣");
 }   
 finally
 {
 try{
 if(con!=null)
 con.close();
 }catch(SQLException e)
 {out.print("���ݿ������쳣");}
 }
     %>     </table>
   
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<br>
<br>
<br>

 <!--ͼƬ����-->
  <div id="apDiv1">
  <div id="photo-list">
    <ul id="scroll">
<li><a  href="http://www.mojichina.com/index.html"><img src="images/roll3.png" alt="3" width="800" height="150" /></a> </li>
<li><a href="http://www.tq121.com.cn/" ><img src="images/roll2.png" alt="2"  width="800" height="150" /></a> </li>
<li><a href="http://www.szmb.gov.cn/"><img src="images/roll1.jpg" alt="1" width="800" height="150"/></a></li>
    </ul>
</div>
<script type="text/javascript">
    var id = function(el) {
            return document.getElementById(el);
        },
        c = id('photo-list');
    if(c) {
        var	ul = id('scroll'),
            lis = ul.getElementsByTagName('li'),
            itemCount = lis.length,
            width = lis[0].offsetWidth, //���ÿ��img�����Ŀ��
            marquee = function() {
                c.scrollLeft += 2;
                if(c.scrollLeft % width <= 1){  //�� c.scrollLeft �� width ���ʱ���ѵ�һ��img׷�ӵ������
                    ul.appendChild(ul.getElementsByTagName('li')[0]);
                    c.scrollLeft = 0;
                };
            },
            speed = 50; //��ֵԽ��Խ��

        ul.style.width = width*itemCount + 'px'; //�������������������
        
        var timer = setInterval(marquee, speed);
        c.onmouseover = function() {
            clearInterval(timer);
        };
        c.onmouseout = function() {
            timer = setInterval(marquee, speed);
        };
    };
</script> 
  </div>

</body>
</html>
