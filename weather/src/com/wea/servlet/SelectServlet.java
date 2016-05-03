package com.wea.servlet;

import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.SessionContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.PieDataset;

import com.bean.news;
import com.wea.Beans.Data;
import com.wea.Dao.DataDao;
import com.wea.Tools.DateUtil;
import com.wea.Tools.JFreeChart2DPie;
import com.wea.Tools.JFreeChartLineTemp;

public class SelectServlet extends HttpServlet {

	@SuppressWarnings("deprecation")
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String method = request.getParameter("method");
		System.out.println("method==" + method);
		if (method.equals("queryTemperature")) {
			System.out.println("path==" + request.getServletPath());
			String date1 = request.getParameter("_sDate");
			System.out.println("date1==" + date1);
			String date2 = request.getParameter("_eDate");
			System.out.println("date2==" + date2);
			Date day1 = DateUtil.getFormatDate(date1);
			
			Date day2 = DateUtil.getFormatDate(date2);
			System.out.println(day1.toLocaleString()+"  "+day2.toLocaleString());
			int days = DateUtil.getSerchDaysNums(day1, day2);
			System.out.println("days=="+days);
			HashMap<java.sql.Date, Float> map = DataDao.getPreAvgMap(DateUtil.getAfterDay(new java.sql.Date(day2.getTime())), days, 0);
			System.out.println("length=="+map.size());
			request.setAttribute("map", map);
			request.setAttribute("isExit", true);
			request.getRequestDispatcher(
					"temperature_humid/showImg.jsp").forward(
					request, response);
			
		}
		if (method.equals("queryHumidity")) {
			System.out.println("path==" + request.getServletPath());
			String date1 = request.getParameter("_sDate");
			System.out.println("date1==" + date1);
			String date2 = request.getParameter("_eDate");
			System.out.println("date2==" + date2);
			Date day1 = DateUtil.getFormatDate(date1);
			
			Date day2 = DateUtil.getFormatDate(date2);
			System.out.println(day1.toLocaleString()+"  "+day2.toLocaleString());
			int days = DateUtil.getSerchDaysNums(day1, day2);
			System.out.println("days=="+days);
			HashMap<java.sql.Date, Float> map = DataDao.getPreAvgMap(DateUtil.getAfterDay(new java.sql.Date(day2.getTime())), days, 1);
			System.out.println("length=="+map.size());
			request.setAttribute("map", map);
			request.setAttribute("isExit", true);
			request.getRequestDispatcher(
					"temperature_humid/showImg.jsp").forward(
					request, response);
			
		}
		if (method.equals("queryVoice")) {
			System.out.println("path==" + request.getServletPath());
			String date1 = request.getParameter("_sDate");
			System.out.println("date1==" + date1);
			String date2 = request.getParameter("_eDate");
			System.out.println("date2==" + date2);
			Date day1 = DateUtil.getFormatDate(date1);
			
			Date day2 = DateUtil.getFormatDate(date2);
			System.out.println(day1.toLocaleString()+"  "+day2.toLocaleString());
			int days = DateUtil.getSerchDaysNums(day1, day2);
			System.out.println("days=="+days);
			HashMap<java.sql.Date, Float> map = DataDao.getPreAvgMap(DateUtil.getAfterDay(new java.sql.Date(day2.getTime())), days, 2);
			System.out.println("length=="+map.size());
			request.setAttribute("map", map);
			request.setAttribute("isExit", true);
			request.getRequestDispatcher(
					"sound/showImg.jsp").forward(
					request, response);
			
		}
		if (method.equals("queryair")) {
			System.out.println("path==" + request.getServletPath());
			String date1 = request.getParameter("_sDate");
			System.out.println("date1==" + date1);
			Date day1 = DateUtil.getFormatDate(date1);
			java.sql.Date date = new java.sql.Date(day1.getTime());
			System.out.println(day1.toLocaleString());
			List<Data> datas = DataDao.findDayData(date);
			Data data = datas.get(datas.size()-1);
			request.setAttribute("isExit", true);
			request.setAttribute("data", data);

			request.getRequestDispatcher(
					"air/showImg.jsp").forward(
					request, response);
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public static String getImage(PrintWriter pw,HttpSession session,ServletRequest request){
		JFreeChartLineTemp jc = new JFreeChartLineTemp();
		String method = request.getParameter("method");
		
		if(request.getAttribute("map")!=null){
			HashMap<java.sql.Date,Float> map = null;
			map = (HashMap<java.sql.Date, Float>)request.getAttribute("map");
			CategoryDataset dataset = JFreeChartLineTemp
					.getCategoryDataset(map);
			JFreeChart chart = null;
			
			if(method.equals("queryTemperature")){
				
				// getCategoryDataset(map);
				// 调用类中函数
				chart = ChartFactory.createLineChart("温度直线图", "时间",
						"temperature", dataset, PlotOrientation.VERTICAL, true,
						false, false);
			}
			if(method.equals("queryHumidity")){
				chart = ChartFactory.createLineChart("湿度直线图", "时间",
						"humidity", dataset, PlotOrientation.VERTICAL, true,
						false, false);
			}
			if(method.equals("queryVoice")){
				chart = ChartFactory.createLineChart("声音直线图", "时间",
						"voice", dataset, PlotOrientation.VERTICAL, true,
						false, false);
			}

			// 设置字体

			TextTitle textTitle = chart.getTitle();
			textTitle.setFont(new Font("宋体", Font.PLAIN, 20));
			// 设置标题

			LegendTitle legendTitle = chart.getLegend();
			legendTitle.setItemFont(new Font("宋体", Font.PLAIN, 14));
			// 设置图表

			CategoryPlot categoryPlot = chart.getCategoryPlot();
			CategoryAxis categoryAxis = categoryPlot.getDomainAxis();
			// X轴字体

			categoryAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 14));
			// x轴标签字体

			categoryAxis.setLabelFont(new Font("宋体", Font.PLAIN, 14));
			// y轴字体

			categoryAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 14));
			// y轴标签字体

			// valueAxis.setLabelFont(new Font("宋体",Font.PLAIN,14));
			String fileName = "";
			try {
				ChartRenderingInfo info = new ChartRenderingInfo(
						new StandardEntityCollection());
				fileName = ServletUtilities.saveChartAsPNG(chart, 600, 500,
						session);
				ChartUtilities.writeImageMap(pw, fileName, info, false);
				pw.flush();
			} catch (Exception e) {
				e.printStackTrace();
				
			} 
				System.out.println("*******");
				return fileName;
		}
		if(request.getAttribute("data")!=null){
			Data data = (Data)request.getAttribute("data");
			PieDataset dataset=JFreeChart2DPie.DataToDataSet(data);
			JFreeChart chart=ChartFactory.createPieChart("饼图",dataset,true,true,false);
			//获得饼图对象
			
		    PiePlot piePlot=(PiePlot)chart.getPlot(); 
			//设置字体
			Font font=new Font("黑体",Font.CENTER_BASELINE,20); 
			piePlot.setLabelFont(font);//设置图标字体
			TextTitle title=new TextTitle("饼图分布");//设置标题字体
			title.setFont(font);
			chart.setTitle(title);
			LegendTitle legendTitle=chart.getLegend();
			legendTitle.setItemFont(font);
			String fileName = "";
			try {
				ChartRenderingInfo info = new ChartRenderingInfo(
						new StandardEntityCollection());
				fileName = ServletUtilities.saveChartAsPNG(chart, 600, 500,
						session);
				ChartUtilities.writeImageMap(pw, fileName, info, false);
				pw.flush();
			} catch (Exception e) {
				e.printStackTrace();
				
			} 
				System.out.println("*******");
				return fileName;
			  		
		}
		return null;
		}
		

	
}
