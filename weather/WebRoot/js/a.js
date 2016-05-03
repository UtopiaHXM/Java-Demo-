
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
    // �d�� master �x�Σ�ͬ�r��ʼ�� detail �x�΃���
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

    // �� master �x�ή��ӕr��׃�� detail �x�΃���
    function doNewSelectMaster( master, detail, detailArray ) {
      detail.options.length = detailArray[ master.selectedIndex ].length;
      for( i = 0; i < detailArray[ master.selectedIndex ].length; i++ ) {
        detail.options[ i ] = new Option( detailArray[ master.selectedIndex ][ i ], i );
      }
    }
//////�ڃɂ� ����ʽ�x�����Ƅ����x��ֵ
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
//////�O������ʽ�x���A�x�� ��λ
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

//////�����
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
		if(forceForwardToThisUrl){
			forwardTo(newUrl);
		}else{
		    return newUrl;
		}
	}
