// JavaScript Document

// comes from prototype.js; this is simply easier on the eyes and fingers
    function $(id)
    {
	    var obj = document.getElementById(id);
		if(obj != null){
			return obj;
		}else{
			obj = document.getElementsByName(id)[0];
			return obj;
		}
    }

    var QueryStr = document.location.search;
	//window.status = QueryStr;
    var ParameterMap = new Map();
	if(QueryStr != null && QueryStr.length > 1){
		QueryStr = QueryStr.substring(1, QueryStr.length);
		_initParameterMap(QueryStr.split('&'));
	}
     
	 function _initParameterMap(qryStrAry){
		 if(qryStrAry != null && qryStrAry.length > 0){
			 var etmp = null;
			 for(i=0; i<qryStrAry.length; i++){
				 if(qryStrAry[i] == null || qryStrAry[i].length == 0) continue;
				 etmp = qryStrAry[i].indexOf('=');
				 var key = null;
          		 var value = '';
				 if(etmp > 1){
				     key = qryStrAry[i].substring(0, etmp);
					 value = qryStrAry[i].substring(key.length+1, QueryStr.length);
					 ParameterMap.put(key, value);
				 }
			 }
		 }
	 }

//////取得當前日期字串
    function getNowDate(){
		var now = new Date();
		var mm = now.getMonth();
		if(mm < 10){
			mm = '0' + mm;
		}
		return now.getFullYear() + '/' + mm + '/' + now.getDate();
    }

//////設定 element 的值
    function setElementValue(elementId, value){
		var el = document.getElementById(elementId);
		if(el != null){
			try{
			    el.value = value;
			}
			catch(e){
				//ignore
			}
		}
	}

/////兩層式下拉選單連動
    // 載入 select 選單內容
    function loadSelect( selectElement, valueArray, selectedIndex ) { 
      selectElement.options.length = valueArray.length;
      for( i = 0; i < valueArray.length; i++ ) {
		  if(typeof(valueArray[i]) != 'string' && valueArray[i].length > 1){
              selectElement.options[ i ] = new Option( valueArray[i][1], valueArray[i][0] );  // Option( text , value );
		  }else{
			  selectElement.options[ i ] = new Option( valueArray[i], i );  // Option( text , value );
		  }
      }
	  if(selectedIndex != null && selectedIndex <= valueArray.length){
		  selectElement.selectedIndex = selectedIndex;
	  }
	  else{
		  selectElement.selectedIndex = 0;
	  }
    }
    // 載入 master 選單，同時初始化 detail 選單內容
    function loadSelectMaster( master, detail, masterArray, detailArray ) { 
      master.options.length = masterArray.length;
      for( i = 0; i < masterArray.length; i++ ) {
        master.options[ i ] = new Option( masterArray[i], i );  // Option( text , value );
      } 
      master.selectedIndex = 0;
	  if(detail != null){
          doNewSelectMaster( master, detail, detailArray );
	  }
    } 

    // 當 master 選單異動時，變更 detail 選單內容
    function doNewSelectMaster( master, detail, detailArray ) {
      detail.options.length = detailArray[ master.selectedIndex ].length;
      for( i = 0; i < detailArray[ master.selectedIndex ].length; i++ ) {
        detail.options[ i ] = new Option( detailArray[ master.selectedIndex ][ i ], i );
      }
    }
//////在兩個 下拉式選單中移動所選的值
    function moveSelectedOption(fromSelect, toSelect){
	  //alert('121212');
      for(var i=0;i<fromSelect.options.length;i++){
        if(fromSelect.options[i].selected){
          var e = fromSelect.options[i];
          toSelect.options.add(new Option(e.text, e.value));
          fromSelect.remove(i);
          i=i-1
        } 
      }
    }
//////設定下拉式選單預選的 欄位
    function setFormSelectedIndex(elementId, index){
		var el = document.getElementById(elementId);
		//alert(el + ',' + (el!=null?'':el.type));
		if(el != null){
			if(el.options.length > 0 && index < el.options.length ){
				el.options.selectedIndex = index;
				el.options[index].selected = true;
			}
		}
	}

//////
    function switchDivStyleDisplay(elementId, divId, forceDisplay){
	  var display = 'none';
	  if(forceDisplay){
		display = 'block';
	  }else{
    	var el = document.getElementById(elementId);
		//alert(el.type);
	    if(el != null && ('checkbox' == el.type || "radio" == el.type) ){
		  if(el.checked == true){
		    display = 'block';
		  }else{
    	    display = 'none';
		  }
		}
		//alert(dispaly);
	  }
	  var elDiv = document.getElementById(divId);
	  if(elDiv != null){
	    elDiv.style.display = display;
	  }
	}

//////重新導頁
    function forwardTo(targetPage){
		//window.location.href = targetPage;
		window.location.href = addMenuParaToQS(targetPage, false);
		
	}
//////vReturnValue = window.showModalDialog(sURL [, vArguments] [, sFeatures]);
    function openModalWin(sURL, vArgs, dialogHeight, dialogWidth){
		var rtn = null;
		try{
		    rtn = window.showModalDialog(sURL, vArgs, 'dialogHeight='+dialogHeight+'px;dialogWidth='+dialogWidth+'px;scroll=yes;resizable=yes;');
		}catch(ex){
            window.open(sURL, 'untitiled', 'height=600, width=600, top=100, left=100, toolbar=no, menubar=no, scrollbars=yes, resizable=yes, location=no, status=no');
		}
		return rtn;
	}
//////
    function openWin(url, height, width){
		window.open(url, 'untitiled', 'height='+height+', width='+width+', top=100, left=100, toolbar=no, menubar=no, scrollbars=yes, resizable=yes, location=no, status=no');
	}

//////
    function strReplaceAll(str, pattern, replaceText){
	    while(str.indexOf(pattern) >= 0){
		    str = str.replace(pattern, replaceText);
	    }
	    return str;
    }

//////
    function addMenuParaToQS(url, forceForwardToThisUrl){
		var newUrl = url;
		if(url.indexOf('?') <= 0){
		   newUrl = url + '?' + QueryStr;
		}else{
			newUrl = url + '&' + QueryStr;
		}
		/*
		var moduleId = null;
		var functionId = null;
    	if(ParameterMap.containsKey('moduleId')){
		    moduleId = ParameterMap.get('moduleId').value;
		}
		if(ParameterMap.containsKey('functionId')){
		    functionId = ParameterMap.get('functionId').value;
		}
        if(moduleId != null && functionId != null){
			if(url.indexOf('?') <= 0){
			    url += '?';
		    }
		    url += '&moduleId=' + moduleId + '&functionId=' + functionId;
		}*/
		if(forceForwardToThisUrl){
			forwardTo(newUrl);
		}else{
		    return newUrl;
		}
	}
//自定義的 Map 對象
    function Map() {
        this.elements = new Array();

        this.keys = new Array();
        this.size = function() {
            return this.elements.length;
        }

        this.getKeys = function() {
            return this.keys;
        }
        this.put = function(_key, _value) {
            this.elements.push({key:_key,value:_value});

            this.keys.push(_key);
        }
        this.remove = function(_key) {
            var bln = false;
            try {
                for (i = 0; i < this.elements.length; i++) {
                    if (this.elements[i].key == _key) {
                        this.elements.splice(i, 1);
                        return true;
                    }
                }
            } catch(e) {
                bln = false;
            }
            return bln;
        }

        // 判断是否存在此键
        this.containsKey = function(_key) {
            var bln = false;
            try {
                for (i = 0; i < this.elements.length; i++) {
                    if (this.elements[i].key == _key) {
                        bln = true;
                    }
                }
            } catch(e) {
                bln = false;
            }
            return bln;
        }
        this.get = function(_key) {
            try {
                for (i = 0; i < this.elements.length; i++) {
                    if (this.elements[i].key == _key) {
                        return this.elements[i];
                    }
                }
            } catch(e) {
                return null;
            }
        }

        this.isEmpty = function(){
            return this.elements.length <= 0;
        }
    }
	
	function popitup(url) {
		newwindow=window.open(url,'name','height=300,width=540,resizable=no');
		if (window.focus) {newwindow.focus()}
		return false;
	}
	
	function popUpOrderDetails(url) {
		newwindow=window.open(url,'name','height=600,width=900,resizable=yes');
		if (window.focus) {newwindow.focus()}
		return false;
	}

    function popUpOrderHistory(url) {
		newwindow=window.open(url,'name','height=400,width=520,resizable=yes');
		if (window.focus) {newwindow.focus()}
		return false;
	}
////測試 Map 的調用方法
/*
    function _testMap() {
        var testmap = new Map();
        testmap.put("01", "michael");
        testmap.put("02", "michael2");
        alert(testmap.size());
        var key = "02"
        if (testmap.containsKey(key)) {
            var element = testmap.get(key);
            alert(element.key + "|" + element.value);
        } else {
            alert("不包含" + key);
        }
        testmap.remove("02");
        if (testmap.containsKey(key)) {
            var element = testmap.get(key);
            alert(element.key + "|" + element.value);
        } else {
            alert("不包含" + key);
        }

        //迭代出所有的key對應的值

        for (each in testmap.getKeys()) {
             alert(testmap.getKeys()[each]);
        }
    }
*/
////瀏覽駁回記錄
    function browseWorkflowHistory(appType, code){
		var url = '../Administration/Workflow_History_Query.htm?appType='+appType+'&code=xxxx&showQry=false';
		openWin(url, 600, 600);
	}

////顯示每頁上方的導覽訊息
    var currentFunctionStr = ''+
	    //'<div id="pageBpdy"> '+
        '  <li>目前位置：@ModuleName ＞ @FunctionName</li> ';
		//'</div>';

    var workflowStepStr = '';
    var workflowStepStrBegin = '<div id="WorkflowProcessView" align="center"> <table> <tr> ';
	var workflowStepStrTD = ' <td>【@】</td> '
    var workflowStepStrTDrn=' <td class="running">【@】</td> ';
    var workflowStepStrEnd =' </tr> </table> </div>';
	
	function __onloadPageHeader(){
		var str = '';
		var moduleId = null;
		var functionId = null;
    	if(ParameterMap.containsKey('moduleId')){
		    moduleId = ParameterMap.get('moduleId').value;
		}
		if(ParameterMap.containsKey('functionId')){
		    functionId = ParameterMap.get('functionId').value;
		}
        if(moduleId != null && functionId != null){
			var str = currentFunctionStr.replace('@ModuleName', functionsTree[moduleId][0][0]);
			str = str.replace('@FunctionName', functionsTree[moduleId][functionId][0]);
		}
		
		var type = null;
		var step = null;
		if(ParameterMap.containsKey('flowTemplate')){
		    type = ParameterMap.get('flowTemplate').value;
		}
		if(ParameterMap.containsKey('flowStep')){
		    step = ParameterMap.get('flowStep').value;
		}
		if(type != null && step != null){
			var flows = flowAry[type];
			workflowStepStr = workflowStepStrBegin;
			for(var i=0; i < flows.length; i++){
				if( i ==(step-1)){
					workflowStepStr += workflowStepStrTDrn.replace('@', flows[i]);
				}else{
					workflowStepStr += workflowStepStrTD.replace('@', flows[i]);
				}
			}
			workflowStepStr += workflowStepStrEnd;
			str += workflowStepStr;
		}else{
			str += '<br />';
		}
		
		var obj = document.getElementById('pageBpdy');
		if(obj != null){
			obj.innerHTML = str;
		}
	}
