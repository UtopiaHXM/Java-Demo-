package com.wea.Tools;

import java.awt.Font;
import java.io.FileOutputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import com.wea.Beans.Data;
import com.wea.Dao.DataDao;


public class JFreeChart2DPie {
	public  static void main(String args[])
	{
	PieDataset dataset=getDataSet();
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
	FileOutputStream fos_jpg=null;
	try{
		fos_jpg=new FileOutputStream("../weather/WebRoot/images/饼图.jpg");
		
		ChartUtilities.writeChartAsJPEG(fos_jpg, chart, 640, 480);
		fos_jpg.close();
}
	 catch (Exception e) {   
	 }   		
	}
	
	//数据集
	public static PieDataset getDataSet() {
		// TODO Auto-generated method stub
		DefaultPieDataset dataset=new DefaultPieDataset();
	
		Data data = DataDao.getLastestData();
		dataset.setValue("SO2所占白分比", data.getSO2());
		dataset.setValue( "臭氧所占百分比",data.getO3());
		dataset.setValue("粉尘颗粒所占百分比",data.getDust());
		return dataset;
	}
	
	public static PieDataset DataToDataSet(Data data) {
		// TODO Auto-generated method stub
		DefaultPieDataset dataset=new DefaultPieDataset();
	
		dataset.setValue("SO2所占白分比", data.getSO2());
		dataset.setValue( "臭氧所占百分比",data.getO3());
		dataset.setValue("粉尘颗粒所占百分比",data.getDust());
		return dataset;
	}

}
