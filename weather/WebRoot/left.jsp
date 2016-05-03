<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>" target="main">
    <title>天气管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<link href="css/a.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/a.js"></script>
<script type="text/javascript" src="js/b.js"></script>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
}
-->
</style>
<script type="text/javascript" language="javascript">
<!--
    var templateStr1 = ''+
	        '<div id="Menu"> '+
	        '  <span class="Menu1" onClick="javascript:switchMenuDisplay(\'@Module_ID@\');" onDblClick="javascript:switchMenuDisplay(\'@Module_ID@\');"> '+
	        '  <img src="images/m01-sa_green.gif" name="_Market_Menu_Icon" align="absmiddle" id="_Market_Menu_Icon">@Module_Name@</span> '+
	        '  <div id="@Module_ID@" style="display:none"> ';
    var templateStr2 = ''+
	        '    <span><a href="@Function_URL@" target="rightFrame" class="Menu2">@Function_Name@</a></span> ';
	var templateStr3 = ''+
	        '  </div> '+
	        '  <div class="Menu_foot"></div> '+
	        '</div>';
    var _functionTreeHTML = '';
	
    function generateFunctionTreeHTML(){
		for(var i=0; i<functionsTree.length; i++){
			if(functionsTree[i][0][2] == 'false'){
			    continue;
			}
			var tmp = templateStr1;
			//process module
			//while(tmp.indexOf('@Module_Name@') > 0){
				//tmp = tmp.replace('@Module_Name@', functionsTree[i][0][0]);
				tmp = strReplaceAll(tmp, '@Module_Name@', functionsTree[i][0][0]);
			//}
			//while(tmp.indexOf('@Module_ID@') > 0){
				//tmp = tmp.replace('@Module_ID@', functionsTree[i][0][1]);
				tmp = strReplaceAll(tmp, '@Module_ID@', functionsTree[i][0][1]);
			//}
			
			for(var j=1; j<functionsTree[i].length; j++){
				if(functionsTree[i][j][2] == 'false'){
				    continue;
			    }
				var tmp2 = templateStr2.replace('@Function_Name@', functionsTree[i][j][0]);
				tmp += tmp2.replace('@Function_URL@', addParameter(functionsTree[i][j][1], i, j));
			}
			tmp += templateStr3;
			_functionTreeHTML += tmp;
		}
		
	}
	
    function addParameter(url, moduleId, functionId){
		if(url.indexOf('?') <= 0){
			url += '?';
		}
		url += '&moduleId=' + moduleId + '&functionId=' + functionId;
		return url;
	}
		
    function switchMenuDisplay(divId){
	    var display = 'none';
    	var el = document.getElementById(divId);
		if(el != null){
	        if(el.style.display == '' || el.style.display == 'block'){
				el.style.display = 'none';
        	}
			else {
				el.style.display = 'block';
		    }
		}
		else{
		    //alert('DEBUG: Not found element id['+ divId + ']');
		}
	    closeAllMenuExclude(divId);
	}
	
	function closeAllMenuExclude(divId){
	    for (i=0;i<functionsTree.length;i++) { 
	        var elDiv = document.getElementById(functionsTree[i][0][1]);
	        if(divId != functionsTree[i][0][1] &&  elDiv != null){
	            elDiv.style.display = 'none';
	        } 
		}
	}

//-->
</script>
</head>
  
<body bgcolor="lightgrey">
<script type="text/javascript" language="javascript">
<!--
    generateFunctionTreeHTML();
    document.write(_functionTreeHTML);
//-->
</script>
<!--
<div id="Menu">
     <span class="Menu1" onClick="javascript:switchMenuDisplay('syn_Menu');" onDblClick="javascript:switchMenuDisplay('syn_Menu');">
     <img src="images/m01-sa_green.gif" name="_Product_Menu_Icon" align="absmiddle" id="_Product_Menu_Icon">综合环境质量</span>
     <div id="syn_Menu" style="display:none">
         <span><a class="Menu2">综合分析</a></span>
         <span><a class="Menu2">舒适度</a></span>
     </div>
     <div class="Menu_foot"></div>
</div>
<div id="Menu">
     <span class="Menu1" onClick="javascript:switchMenuDisplay('temperature-humid_Menu');" onDblClick="javascript:switchMenuDisplay('temperature-humid_Menu');">
     <img src="images/m01-sa_green.gif" name="_Vendor_Menu_Icon" align="absmiddle" id="_Vendor_Menu_Icon">环境温湿度</span>
     <div id="temperature-humid_Menu" style="display:none">
         <span><a class="Menu2">温度实况</a></span>
         <span><a class="Menu2">空气湿度</a></span>
     </div>
     <div class="Menu_foot"></div>
</div>
<div id="Menu">
     <span class="Menu1" onClick="javascript:switchMenuDisplay('air_Menu');" onDblClick="javascript:switchMenuDisplay('air_Menu');" >
     <img src="images/m01-sa_green.gif" name="_Marketing_Menu_Icon" align="absmiddle" id="_Marketing_Menu_Icon">空气污染物百分比</span>
     <div id="air_Menu" style="display:none">
		<span><a class="Menu2">空气污染物百分比</a></span>
     </div>    
     <div class="Menu_foot"></div>
</div>
<div id="Menu">
     <span class="Menu1" onClick="javascript:switchMenuDisplay('sound_Menu');" onDblClick="javascript:switchMenuDisplay('sound_Menu');">
     <img src="images/m01-sa_green.gif" name="_Market_Menu_Icon" align="absmiddle" id="_Order_Menu_Icon">声环境质量</span>
     <div id="sound_Menu" style="display:none">
     <span><a class="Menu2">声环境质量</a></span>
     </div>
     <div class="Menu_foot"></div>
</div>
<div id="Menu">
     <span class="Menu1" onClick="javascript:switchMenuDisplay('news_Menu');" onDblClick="javascript:switchMenuDisplay('news_Menu');">
     <img src="images/m01-sa_green.gif" name="_Financial_Menu_Icon" align="absmiddle" id="_Financial_Menu_Icon">热点新闻</span>
     <div id="news_Menu" style="display:none">
     <span><a class="Menu2">热点新闻</a></span>
     </div>
     <div class="Menu_foot"></div>
</div>
-->

</body>

</html>
