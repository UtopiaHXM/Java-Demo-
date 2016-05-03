<%@ page language="java" import="java.util.*" import="com.wea.Beans.*"
	import="com.wea.Dao.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'MyJsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">




@charset "UTF-8";
/* FRI MyLove main page*/

/* Body */

a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration:  none;
}
a:active {
	text-decoration: none;
}

body {
	 margin:0px;
	 padding:0px;
	 font-family:Arial;	
	 margin: 0 auto;
	 width: 100%;	 
	 
}

/* LOGIN */

#login_bg{
	height:100%;
	background:#FFBE00;
    position: relative;
    left: 50%;
    margin-left: -483px; /* 970 除以 -2 */
    width: 970px;

}

.login{
	 width:100%;
	 margin-top:150px;
	 float:left;
	 background:url(../images/login_mainbg.jpg) no-repeat;
	 
}
.login table{
	 width:350px;
	 height:auto;
	 font-size:80%;
	 color:#333333;
	 float:right;
}


/*top*/
#table{
	 background-color:#FFBE00;
	 margin:0px;
	 padding:0px;
	 font-size:12px;
	 color:#333333;
	 font-family:Arial;
	 height:48px;
	 }
	 
#table div{
     color:#333333;
     margin:4;
	 float:right;
	 margin-right:20px;}

#table .more{
     font-size:12px;
	 color:#666666;
	 background:#FFBE00;
	 border:none;
	 border-bottom:1px dotted #666666;
	 padding:1px;
	 float:right;
	 
	 
	 }
#table .Login{
     background-image:url(../images/login-button.gif);}

	

/* Left Menu */
#Menu table {
    width:169px;
	border-collapse:collapse;
	border: 1px solid #FFFFFF;
	background-color:#808080;
	margin-top:10px;
	height:43px;
	font-size:80%;
	text-align:center;
}
#Menu td{
	border: 1px solid #FFFFFF;
	width:50px;
	background-image:url(../images/con_submenu-no.gif);
	background-repeat:repeat-x;
	background-position:center;
	padding-left:2px;
	padding-right:2px;
	padding-bottom:2px;
}

#Menu th{
	border: 1px solid #FFFFFF;
	color:#FFFFFF;
	width:60px;
	text-align:center;
	background-image:url(../images/con_submenu.gif);
	background-repeat:no-repeat;
	background-position:center;
	padding-left:2px;
	padding-right:2px;
	padding-bottom:2px;
}

#Menu a{
	color:#FFFFFF;
}

#Menu {
	*width:200px;
	background:#F4F4F4;
	padding-left:10px;
	border-right:10px solid #cccccc;
	text-align:left;
}
#Menu .Menu_title{}

#Menu .Menu_head {
    height:30px;
	width: 168px;
	background-color:#A2A2A2;
	margin-top:2px;
	padding-top:8px;
	font-size:80%;
	color:#FFFFFF;
	text-align: center;
	
}

#Menu .Menu_body {
	text-align: left;
	width: 168px;
	padding-bottom: 20px;
}

#Menu .Menu1 {
	font-size: 13px;
	text-decoration: none;
	color: #333333;
	/*font-weight:600;*/
	padding: 9px 15px 5px 15px;
	display: block;
	cursor: pointer;
	background: url(../images/mainmemu.gif) no-repeat left bottom;
}

#Menu .Menu1:hover {
	color: #000000;
	background:#333333;
}

#Menu a.Menu2 {
	font-size: 13px;
	text-decoration: none;
	color: #939393;
	/*font-weight:600;*/
	padding: 7px 5px 3px 40px;
	display: block;
	cursor: pointer;
	background: url(../images/sub.gif) no-repeat center bottom #ffffff;
}

#Menu a.Menu2:hover {
    padding: 7px 3px 3px 38px;
	color: #333333;
	background: url(../images/sub.gif) no-repeat center bottom #FFF3C9;
	border-left:2px solid #FF6600;
	border-right:2px solid #FF6600;
}

.Menu_foot {
	font-family: Arial, Helvetica, sans-serif;
	font-size:80%;
	color: #333333;
	text-align:center;
}

/* content */

#pageBpdy{
    border-top:10px solid #cccccc;
	width:100%;}


#pageBpdy li{
	font-size:80%;
	color:#666666;
	margin:10px 0px 10px 10px;
	height:25px;
	list-style:none;
	line-height:25px;
	padding-left:25px;
	background:url(../images/list.gif) no-repeat left top ;
	text-align:left;
}

#pageBpdy li a{
	color:#ff6471;
}

#pageBpdy li a:hover{
	color:#666666;
}


/* marquee */
#pageBpdy marquee{
	font-size:80%;
	color:#333333;
	padding:5px;
	background-color:#cccccc;
}

/* Page bar */
.page{
	font-family:Arial;
	font-size:80%;
	color:#666666;
	letter-spacing: 2px;
	text-align:center;
	vertical-align:50%;
	height:12px;
	
}
fieldset{ 
    width:100%; 
	*background:url(../images/fieldset_bg.gif) repeat-x left top #F1F1F1;
	background-color:#F1F1F1;}


.page a{
	color:#666666;
}

.page strong{
	color:#fa3736;
}
.page img{
	vertical-align:text-bottom;
}

/* Notes  */
#Notes table {
	border-collapse:collapse;
	border: 1px solid #A2A2A2;
	width: 100%;
	margin-top: 10px;
	margin-bottom: 25px;
	margin-left: 0px;
	color: #666666;
}

#Notes th {
	font-weight: normal;
	font-size:80%;
	color:#666666;
	font-weight:600;
	background-color:#DFDFDF;
	padding: 5px 5px 3px 10px;
	text-align: center;
	vertical-align: middle;
	line-height: 140%;
	width:10%;
}

#Notes td {
    font-size:80%;
	font-weight: normal;
	color:#666666;
	background-color:#EEEEEE;
	padding: 5px 5px 5px 10px;
	border: 1px solid #A2A2A2;
	line-height: 140%;
}


/* table */

.table {
	border-collapse:collapse;
    width:98%;
	margin:10px;
	padding: 3px;/*equivalent td's cellpadding */
	/*border-spacing: 3px;*/ /*equivalent table's cellspacing */
	color: #333333;	

}

.table caption {
	color: #ff6471;
	font-size: 80%;
	margin-top: 20px;
	font-weight: bold;
	text-align: left;
	padding: 2px;
}

.table .caption {
	color: #FFFFFF;
	background-color:#FF6471;
	font-size: 100%;
	margin-top: 20px;
	font-weight: bold;
	text-align: center;
}

.table th {
	font-size:80%;
	color:#333333;
	font-weight:600;
	text-align: center;
	vertical-align: middle;
	line-height: 140%;
	padding: 2px;	
	background:url(../images/td_bg.gif) repeat-x bottom;
	border-bottom:2px solid #FF5F00;
	border-right:1px  solid #D3D3D3;
}

.table .th {
	font-size:80%;
	color:#333333;
	font-weight:600;
	background-color: #a2a2a2;
	text-align: right;
	vertical-align: top;
	line-height: 140%;
	padding: 2px;

}

.table td {
	font-size:80%;
	font-weight: normal;
	color:#333333;
	line-height: 140%;
	padding: 2px;
}

.table .td {
	font-size:80%;
	font-weight: normal;
	color:#333333;
	background: #D8F1D3;
	line-height: 140%;
	padding: 2px;
    text-align:center;
	border-right:1px solid #A5C2A0;
	
}


.table .td2 {
    font-size:80%;
	font-weight: normal;
	color:#333333;
	background-color: #FFFFFF;
	line-height: 140%;
    text-align:center;
}

.table .td3 {
    font-size:80%;
	font-weight: normal;
	color:#333333;
	background-color: #FFCCFF;
	line-height: 140%;
    text-align:center;
}

.table a{
	color:#333333;
}

.table a:hover{
     color:#fa3736;
}

.table p{
     color:#666666;
}
.table img{
	float: center;
	margin-right: 8px;
	margin-top: 5px;
	border:1px solid #666666;
}

.tabletitle {
	font-weight: normal;
}

.tabletitle a {
	font-weight: bold;
	color: #990000;
}

/* table vertical 直式 */
.table-V {
	border-collapse:collapse;
	border: 1px solid #F1F1F1;
	width: 98%;
	margin:10px;
	color: #333333;
}

.table-V caption {
	color: #FFFFFF;
	background-color:#FF6471;
	padding-bottom: 5px;
	padding-top:5px;
	font-size: 100%;
	margin-top: 20px;
	font-weight: bold;
	text-align: center;
}
.table-V th {
	font-weight: normal;
	font-size:80%;
	color:#666666;
	background-color: #eeeeee;
	padding: 5px 5px 3px 10px;
	border: 1px solid #808080;
	text-align: right;
	vertical-align: top;
	line-height: 140%;
	width:20%;
}

.table-V .th-h {
	font-weight: normal;
	font-size:80%;
	color:#FFFFFF;
	background-color: #F7B551;
	padding: 5px 5px 3px 10px;
	border: 1px solid #808080;
	text-align: right;
	vertical-align: top;
	line-height: 140%;
}

.table-V .th-top {
	font-weight: normal;
	font-size:80%;
	color:#FFFFFF;
	font-weight:600;
	background-color: #a2a2a2;
	padding: 5px 5px 3px 10px;
	border: 1px solid #A2A2A2;
	text-align: center;
	vertical-align: top;
	line-height: 140%;
	width:20%;
}

.table-V td {
    font-size:80%;
	font-weight: normal;
	color:#666666;
	padding: 5px 5px 5px 10px;
	border: 1px solid #A2A2A2;
	line-height: 140%;
	width:80%;
}

.table-V .td {
    font-size:80%;
	font-weight: normal;
	color:#666666;
	padding: 5px 5px 5px 10px;
	background-color: #EEEEEE;
	line-height: 140%;
}

.table-V .td2 {
    font-size:80%;
	font-weight: normal;
	color:#666666;
	padding: 5px 5px 5px 10px;
	background-color: #FFFFFF;
	line-height: 140%;
}

.table-V a{
	color:#fa3736;
}

.table-V a:hover{
     color:#666666;
}

.table-V p{
     color:#666666;
}

.table-V img{
	margin-right: 8px;
	margin-left:5px;
}

.tabletitle {
	font-weight: normal;
}

.tabletitle a {
	font-weight: bold;
	color: #990000;
}

.Allfont {
	
	font-size:80%;
	color: #333333;
	text-align: right;
}

.Allfont a {
	font-weight: bold;
}

.textitalic {
	font-style: italic;
}

/* Main body Menu */
#subMenu table {
	border-collapse:collapse;
	border: 1px solid #FFFFFF;
	background-color:#808080;
	/*width: 99%;*/
	height:43px;
	
	font-size:80%;
	text-align:center;
	padding:5px;
}

#subMenu td{
	border: 1px solid #FFFFFF;
	background-image:url(../images/con_submenu-no.gif);
	background-repeat:repeat-x;
	padding-left:20px;
	padding-right:20px;
	padding-bottom:12px;

}

#subMenu th{
    border: 1px solid #FFFFFF;
	text-align:center;
	background-image:url(../images/con_submenu.gif);
	background-repeat:no-repeat;
	background-position:center;
	padding-left:20px;
	padding-right:20px;
	padding-bottom:12px;
}

#subMenu a{
	color:#FFFFFF;
}

<!-- Form -->

textarea {
	border: 1px solid #a5a5a5;
	background-color:#eaeaea;
	font-size:90%;
	color: #666666;
}

.button {
	margin-left: 2px;
	font-size:12px;
    font-family:Arial;
    font-weight:bold;
    color:#444444;
    background-image:url(../images/button_bg.gif);
    border:1px solid #666666;
	cursor: hand;
	padding:0px 2px 2px 2px;
	height:20px;
}
input[type="checkbox"]{vertical-align:-1px;vertical-align:middle\6;}

.input{
    border-top: 1px solid #999999;
	border-left: 1px solid #D9D9D9;
	border-right: 1px solid #D9D9D9;
	border-bottom: 1px solid #D9D9D9;
	background:#FFFFFF;
	font-size:90%;
	color: #333333;
	padding:2px;
	height:20px;
	margin-left: 2px;
}

.input:hover{
    border-top: 1px solid;
	border-left: 1px solid #D9D9D9;
	border-right: 1px solid #D9D9D9;
	border-bottom: 1px solid #D9D9D9;
	background:#FFFFFF;
	font-size:90%;
	color: #333333;
	padding:2px;
	height:20px;
	margin-left: 2px;
}


.input2 {
	border: 1px solid #000000;
	background-color:#000000;
	
	font-size:90%;
	color: #FFFFFF;
	height: 18px;
}

.textGray {
	font-size: 80%;
	color: #666666;
	height:100%;
	width:100%;
	line-height:30px;
	background-color: #ffffff;
}

<!-- Non use -->
.input3 {
	font-size: 13px;
	font-style: normal;
	color: #000000;
}

.style1{
	font-size: 12px;
	color: #FF0000;
}

.style3{
    font-size: x-small;
}

table {
	color: #333333;
	margin: 2px;
	padding: 1px;
	border: 0px solid #666666;
}

.textWhite {
	font-size: 80%;
	color: #E05B15;
	height:100%;
	width:100%;
	line-height:30px;
	background-color: #ffffff;
	border-bottom:5px solid #E05B15;

}

.bgcolor1 {
    background-color: #FFFF66;
 
}
/* 顯示工作流 */
#WorkflowProcessView table{
	margin-left: auto;
	margin-right: auto;	
	border-collapse: separate;
	border-spacing: 3px;
	text-align: center;
	
	font-size:80%;
}

#WorkflowProcessView td{
	border: 2px solid #9FF;
	padding: 2px;
}

#WorkflowProcessView .running{
	background-color: #F00;
	font-weight: bold;
}

/* */
.more {
	margin: 1px;
	border: 1px solid #CCCCCC;
	font-size: 10px;
	vertical-align: bottom;
	/*font-family: Arial, Helvetica, sans-serif;
	background-color:#FF6471;
	color: #FFFFFF;
	height: 18px;*/
	cursor: hand;
}








</style>






</head>

<body>
	<%! String a="",b="",c="",d="";%>
	<%! 
     Data data  = DataDao.getLastestData();
     float temp = data.getTemperature();
     float humi = data.getHumidity();
     double I;//舒适度指数
     double T,RH=0.01;//华氏度
     int y1,y2,y3=3,y4=1,Y;
     float M;
  %>
	<%
     T = temp*9/5+32;
     I = T-0.55*(1-RH)*(T-58);
     //a--穿衣指数
     if(temp>=32.00){
     a="穿衣建议轻薄为主，纱料雪纺亚麻质地是上选";
     }else{
     if(temp<=-20.00){
     a="建议穿羽绒类衣物";
     }else if(temp<-10.00){
     a="建议穿着棉质或皮质衣物";
     }else if(temp<-5.00){
     a="可选择毛衣类外套";
     }else if(temp<10.00){
     a="建议穿着薄款毛衣";
     }else if(temp<18.00){
     a="建议穿着薄质小衫";
     }else if(temp<25.00){
     a="可以换上T恤类衣物，爱美的女生可以穿上自己的短裙";
     }else if(temp<32.00){
     a="穿衣清凉";
     }
     }
     //b--舒适度指数      
if(I>88) {b="酷热，很不舒适";}
else{
if(I<0) b="极冷，不舒适";
else if(I<25) b="很冷，不舒适";
else if(I<38) b="冷，大部分人不舒适";
else if(I<50) b="少部分人不舒适";
else if(I<58) b="大部分人舒适";
else if(I<70) b="人体舒适";
else if(I<75) b="暖，大部分人舒适";
else if(I<79) b="热，少部分人不舒适";
else if(I<84) b="炎热，大部分人不舒适";
else if(I<88) b="暑热，不舒适";
}

     //c--晨练指数
     //y1
     if(temp>=35){
     y1=5;
     }else{
     if(temp<20){
     y1=1;
     }else if(temp<27){
     y1=2;
     }else if(temp<35){
     y1=3;
     }
     //y2
     if(humi>85){
     y2=5;
     }else{
     if(humi<50) y2=1;
     else if(humi<70) y2=2;
     else if(humi<85) y2=3;
     }
     Y = y1+y2+y3+y4;
     if(Y>16) c="5级，不适宜晨练";
     else{
     if(Y<=4) c="1级,很适宜晨练";
     else if(Y<=8) c="2级，适宜晨练";
     else if(Y<=12) c="3级，基本适宜晨练";
     else if(Y<=16) c="4级，不大适宜晨练";
     }
     //d--出行建议
     M = 36*temp/20+5*humi*(temp-20)/20;
     if(M>=70){
     d="5级，易中暑";
     }
     else{
     if(M<55) d="天气上好，可以出行";
     else if(M<60) d="室外作业者需要预防中暑";
     else if(M<=65) d="比较容易中暑，出门注意防暑";
     else if(M<70) d="易中暑，没有重要事情建议避免外出";
     }
     }
     %>

<br>
<br>
<br>

	 <fieldset>

<table width="700" border="0" cellpadding="5" cellspacing="1" class="table">
  <tbody>

		<tr align="center">
			<th height="50">穿衣指数</th>
			 <td class="td" height="50"><%=a%></td>
		</tr>
		<tr align="center">
			<th height="50">舒适度指数</th>
			 <td class="td" height="50"> <%=b%></td>
		<tr align="center">
			<th height="50">晨练指数</th>
			 <td class="td" height="50"><%=c%></td>
		<tr align="center" height="50">
			<th height="50">出行建议</th>
			 <td class="td" height="50"><%=d%></td>
		</tr></tbody>
	</table></fieldset>
</body>
</html>
