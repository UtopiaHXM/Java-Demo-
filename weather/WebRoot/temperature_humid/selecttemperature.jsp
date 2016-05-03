<%@page import="java.io.PrintWriter"%>
<%@page import="com.wea.servlet.SelectServlet"%>
<%@page import="javax.faces.application.Application"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.wea.Tools.JFreeChartLineTemp" import="java.awt.Font"
	import="java.io.FileOutputStream" import="java.util.Date"
	import="java.util.List" import="java.util.Map"
	import="org.jfree.chart.ChartFactory"
	import="org.jfree.chart.ChartUtilities"
	import="org.jfree.chart.JFreeChart" import="org.jfree.chart.axis.Axis"
	import="org.jfree.chart.axis.CategoryAxis"
	import="org.jfree.chart.plot.CategoryPlot"
	import="org.jfree.chart.plot.PlotOrientation"
	import="org.jfree.chart.title.LegendTitle"
	import="org.jfree.chart.title.TextTitle"
	import="org.jfree.data.DefaultKeyedValues"
	import="org.jfree.data.category.CategoryDataset"
	import="org.jfree.data.general.DatasetUtilities"
	import="com.wea.Dao.DataDao"%>
<%
String path = request.getContextPath();
System.out.println("path=="+path);

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println("basePath=="+basePath);

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <base target="_self">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>温度查询</title>
<link href="../css/mp.css" rel="stylesheet" type="text/css">
<link href="../js/dhtmlgoodies_calendar/dhtmlgoodies_calendar.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/Util.js"></script>
<script type="text/javascript" src="../js/InitialData.js"></script>
<script type="text/javascript" src="../js/dhtmlgoodies_calendar/dhtmlgoodies_calendar.js"></script>
</head>


  <body>
	<script type="text/javascript">
		__onloadPageHeader();
	</script>
	
	<form action="../selectServlet" method="post" >
	<input type="hidden" name="method" value="queryTemperature">
	<table border="0" width="700" id="table4" cellpadding="2" class="table"
		align="center">
		<tr align="center">
			<td>
				<fieldset style="WIDTH: 70%">
					<legend>历史日平均温度查询</legend>
					<div align="left" style="font-size: 10pt">
						<table border="0" id="table6" cellspacing="1" cellpadding="3"
							width="100%">

							<tr>
								<td width="10%">日期</td>
								<td align="left">
								<input type="text"
									name="_sDate" id="_sDate" size="20" value="2014-05-01">
									<img src="../images/calendar.gif" alt="日历" style="border:none"
									width="16" height="14"
									onClick="displayCalendar($('_sDate'),'yyyy-mm-dd',this,true)"
									>&nbsp;～&nbsp; <input type="text"
									name="_eDate" id="_eDate" size="20" value="2014-05-08">
									<img src="../images/calendar.gif" alt="日历" style="border:none"
									width="16" height="14"
									onClick="displayCalendar($('_eDate'),'yyyy-mm-dd',this,true)"
									> &nbsp; <input name="query" type="submit"
									value="查询" >
								</td>
							</tr>

						</table>
					</div>
				</fieldset>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>
