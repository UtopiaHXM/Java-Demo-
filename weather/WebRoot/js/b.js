// JavaScript Document

/////function menu tree data
    var functionsTree = new Array();
	functionsTree[0] = new Array();
	functionsTree[0][0] = new Array('综合环境质量', "syn_Menu", "true");
	functionsTree[0][1] = new Array('综合分析', 'syn/syn-right.jsp', 'true');	
    functionsTree[1] = new Array();
	functionsTree[1][0] = new Array('环境温湿度', "temperature-humid_Menu", "true");
	functionsTree[1][1] = new Array('温度实况', 'temperature_humid/selecttemperature.jsp', 'true');
	functionsTree[1][2] = new Array('空气湿度', 'temperature_humid/selecthumidity.jsp', 'true');
	
	
	functionsTree[2] = new Array();
	functionsTree[2][0] = new Array('空气污染物百分比', "air_Menu", "true");
	functionsTree[2][1] = new Array('空气污染物百分比', 'air/airRight.jsp', 'true');
	
	
	
	functionsTree[3] = new Array();
	functionsTree[3][0] = new Array('声环境质量', "sound_Menu", "true");
	functionsTree[3][1] = new Array('声环境质量', 'sound/selectvoice.jsp', 'true');
	
	
	functionsTree[4] = new Array();
	functionsTree[4][0] = new Array('热点新闻', "news_Menu", "true");
	functionsTree[4][1] = new Array('热点新闻', 'news/new_down.jsp', 'true');
	