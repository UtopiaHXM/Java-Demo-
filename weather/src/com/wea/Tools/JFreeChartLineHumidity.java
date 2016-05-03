package com.wea.Tools;

import java.awt.Font;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import com.wea.Dao.DataDao;


public class JFreeChartLineHumidity {
	//折线图数据集
		private static CategoryDataset getCategoryDataset(Map<java.sql.Date, Float> map){
			DefaultKeyedValues keyedValues=new DefaultKeyedValues();
			List<java.sql.Date> list = DateUtil.orderDateList(map);
			for(int i=0;i<list.size();i++){
				String key = list.get(i).toString();
				float value = map.get(list.get(i));
				System.out.println("key===="+key+"    "+"value===="+value);
				keyedValues.addValue(key, value);
			}
			
			CategoryDataset dataset=DatasetUtilities.createCategoryDataset("湿度变化情况", keyedValues);	
			return dataset;
			
		}
		
		
		public  static void main(String []args)
		{
			java.sql.Date date = new java.sql.Date(new Date().getTime());
			Map<java.sql.Date, Float> map = DataDao.getPreAvgMap(date, 7, 1);
			CategoryDataset dataset=getCategoryDataset(map);
			JFreeChart chart=ChartFactory.createLineChart("湿度变化", "时间", "humidity", dataset,PlotOrientation.VERTICAL,true,false,false);
			
			//设置字体
			
			TextTitle textTitle=chart.getTitle();
			textTitle.setFont(new Font("宋体",Font.PLAIN,20));
			//设置标题
			
			LegendTitle legendTitle=chart.getLegend();
			legendTitle.setItemFont(new Font("宋体",Font.PLAIN,14));
			//设置图表
			
			CategoryPlot categoryPlot=chart.getCategoryPlot();
			CategoryAxis categoryAxis=categoryPlot.getDomainAxis();
			//X轴字体
			
			categoryAxis.setTickLabelFont(new Font("宋体",Font.PLAIN,14));
			//x轴标签字体
			
			categoryAxis.setLabelFont(new Font("宋体",Font.PLAIN,14));
			//y轴字体
			
			categoryAxis.setTickLabelFont(new Font("宋体",Font.PLAIN,14));
			//y轴标签字体			
		//valueAxis.setLabelFont(new Font("宋体",Font.PLAIN,14));		
			FileOutputStream fos_jpg1=null;
			try{
				fos_jpg1=new FileOutputStream("../weather/WebRoot/images/湿度折线图.jpg");
				
				ChartUtilities.writeChartAsJPEG(fos_jpg1, chart, 1000, 600);
				fos_jpg1.close();
		}
			 catch (Exception e) {   
			 }   		
			}

}
