// JavaScript Document

/////function menu tree data
    var functionsTree = new Array();
	functionsTree[0] = new Array();
	functionsTree[0][0] = new Array('商品管理', "_Product_Menu", "true");
	functionsTree[0][1] = new Array('提報商品', 'Product/ProductApplication_Create.htm?flowTemplate=1&flowStep=1', 'true');
	functionsTree[0][2] = new Array('查詢提報商品', 'Product/ProductApplication_Query.htm?flowTemplate=1&flowStep=1', 'true');
	functionsTree[0][3] = new Array('審核提報商品', 'Product/ProductApplication_QueryToVerify.htm?flowTemplate=1&flowStep=2', 'true');
	functionsTree[0][4] = new Array('維護可接單量', 'Product/Product_AccessNum_Maintenance.htm?flowTemplate=2&flowStep=1', 'false');
	functionsTree[0][5] = new Array('審核可接單量', 'Product/Product_AccessNum_Audit.htm?flowTemplate=2&flowStep=2', 'false');
	functionsTree[0][6] = new Array('修改商品資料', 'Product/Product_QueryToModify.htm?flowTemplate=4&flowStep=1', 'true');
	functionsTree[0][7] = new Array('審核商品資料修改', 'Product/ProductApplication_QueryToVerify.htm?flowTemplate=4&flowStep=2', 'true');
	functionsTree[0][8] = new Array('申請採購數量', 'Product/Product_PurchaseQuantity_Apply.htm?flowTemplate=8&flowStep=1', 'true');
	functionsTree[0][9] = new Array('確認採購數量', 'Product/Product_PurchaseQuantity_Confirm.htm?flowTemplate=8&flowStep=2', 'true');
	functionsTree[0][10] = new Array('回覆採購數量', 'Product/Product_PurchaseQuantity_Reply.htm?flowTemplate=8&flowStep=3', 'true');

    functionsTree[1] = new Array();
	functionsTree[1][0] = new Array('供應商管理', "_Vendor_Menu", "true");
	functionsTree[1][1] = new Array('案件授權', 'Vendor/VendorApplication_AuthorizedMD_Query.htm?flowTemplate=0&flowStep=2', 'true');
	functionsTree[1][2] = new Array('主約申請', 'Vendor/AgreementApply_Total.htm?flowTemplate=0&flowStep=3', 'true');
	functionsTree[1][3] = new Array('供應商查詢', 'Vendor/Vendor_Query.htm', 'true');
	functionsTree[1][4] = new Array('主約審核', 'Vendor/AgreementAudit_Total.htm?flowTemplate=0&flowStep=4', 'true');
	functionsTree[1][5] = new Array('資料維護', 'Vendor/Vendor_Modify_Basic.htm', 'true');
	functionsTree[1][6] = new Array('合作關係維護', 'Vendor/Vendor_Contract_Total.htm', 'true');
	
	functionsTree[2] = new Array();
	functionsTree[2][0] = new Array('行銷管理', "_Marketing_Menu", "true");
	functionsTree[2][1] = new Array('查詢行銷活動', 'Marketing/MarketingEvent_Query.htm?flowTemplate=7&flowStep=1', 'true');
	functionsTree[2][2] = new Array('行銷活動立案', 'Marketing/MarketingEvent_Member.htm?flowTemplate=7&flowStep=1', 'true');
	functionsTree[2][3] = new Array('回覆行銷活動邀請', 'Marketing/MarketingEvent_ReplyInvite_Query.htm?flowTemplate=7&flowStep=2', 'true');
	functionsTree[2][4] = new Array('審核行銷立案申請', 'Marketing/MarketingEvent_Audit_Query.htm?flowTemplate=7&flowStep=3', 'true');
	functionsTree[2][5] = new Array('管理廣告排程', 'Marketing/AdvertisementMaintenance.htm', 'true');
	functionsTree[2][6] = new Array('管理CUE表', 'Marketing/AdvertisementCUEMaintenance.htm', 'true');
	functionsTree[2][7] = new Array('申請贈品', 'Marketing/Gift_InqureyResult.htm?flowTemplate=6&flowStep=1', 'true');
	functionsTree[2][8] = new Array('審核贈品', 'Marketing/Gift_Audit_InqureyResult.htm?flowTemplate=6&flowStep=2', 'true');
	functionsTree[2][9] = new Array('發送贈品', 'Marketing/Gift_DispatchQuery.htm', 'true');
	functionsTree[2][10] = new Array('申請素材製作', 'Marketing/Material_Apply_Query.htm?flowTemplate=5&flowStep=1', 'true');
	functionsTree[2][11] = new Array('分派素材製作', 'Marketing/Material_Assign_Query.htm?flowTemplate=5&flowStep=2', 'true');
	functionsTree[2][12] = new Array('製作素材上傳', 'Marketing/Material_Make_Query.htm?flowTemplate=5&flowStep=3', 'true');
	functionsTree[2][13] = new Array('審核素材申請', 'Marketing/Material_Audit_Query.htm?flowTemplate=5&flowStep=4', 'true');
	functionsTree[2][14] = new Array('管理廣告排程', 'Marketing/ADMaintenance.htm', 'true');
	
	functionsTree[3] = new Array();
	functionsTree[3][0] = new Array('賣場管理', "_Market_Menu", "true");
	functionsTree[3][1] = new Array('前台分類管理', 'Market/FrontendCategory_Maintenance.htm', 'true');
	functionsTree[3][2] = new Array('審核商品評論', 'Market/ProductOpinion_Audit_Query.htm?flowTemplate=9&flowStep=1', 'true');
	
	functionsTree[4] = new Array();
	functionsTree[4][0] = new Array('訂單管理', "_Order_Menu", "true");
	functionsTree[4][1] = new Array('訂單管理', 'Order/Order_Inquiry.htm', 'true');
	functionsTree[4][2] = new Array('供應商查詢訂單', 'Order/Order_Inquiry_Vendor.htm', 'false');
	functionsTree[4][3] = new Array('銷退管理', 'Order/Order_Inquiry_SalesReturn.htm', 'true');
	functionsTree[4][4] = new Array('查詢換貨訂單', 'Order/Order_Inquiry_SalesExchange.htm', 'true');
	functionsTree[4][5] = new Array('強制訂單終止', 'Order/Order_Inquiry_Terminate.htm', 'true');
		
	/* old
	functionsTree[4][1] = new Array('換貨單訂單', 'Order/Order_ExchangeOrder.htm', 'true');
	functionsTree[4][2] = new Array('出貨作業(廠送)', 'Order/Order_ShippingNote_VendorDirect.htm', 'true');
	functionsTree[4][3] = new Array('到貨回覆(廠送)', 'Order/Order_Response.htm', 'true');
	functionsTree[4][4] = new Array('出貨作業(廠取)', 'Order/Order_ShippingNote_ToVendor.htm', 'true');
	functionsTree[4][5] = new Array('訂單查詢', 'Order/Order_Inquiry.htm', 'true');
	functionsTree[4][6] = new Array('出貨異常訂單管理', 'Order/Order_ShippingException.htm', 'true');
	functionsTree[4][7] = new Array('B2B銷退作業處理', 'Order/Order_Refund_ForB2B.htm', 'true');
	functionsTree[4][8] = new Array('B2B缺損訂單明細', 'Order/Order_DamageOrderDetails_ForB2B.htm', 'true');
	functionsTree[4][9] = new Array('B2E銷退作業處理', 'Order/Order_Refund_ForB2E.htm', 'true');
	functionsTree[4][10] = new Array('B2E銷退拒絕處理', 'Order/Order_RefuseToRefund_ForB2E.htm', 'true');
	*/
	functionsTree[5] = new Array();
	functionsTree[5][0] = new Array('帳務管理', "_Financial_Menu", "true");
	functionsTree[5][1] = new Array('訂單明細查詢', 'Accounting/訂單明細查詢.htm', 'true');
	/*
	functionsTree[5][2] = new Array('供應商請款作業', 'Accounting/供應商請款作業.htm', 'true');
	functionsTree[5][3] = new Array('供應商發票作業', 'Accounting/供應商發票作業.htm', 'true');
	functionsTree[5][4] = new Array('變動成本表', 'Accounting/變動成本表.htm', 'true');
	functionsTree[5][5] = new Array('缺損款作業', 'Accounting/缺損款作業.htm', 'true');
	*/
	
	
	/*
	functionsTree[5][7] = new Array('折讓作業', 'Accounting/折讓作業.htm', 'true');
	functionsTree[5][8] = new Array('發票號碼設定', 'Accounting/發票號碼設定.htm', 'true');
	functionsTree[5][9] = new Array('人工開立發票', 'Accounting/人工開立發票.htm', 'true');
	*/
	functionsTree[5][2] = new Array('轉出會員現金帳戶', 'Accounting/退款管理.htm', 'true');
	functionsTree[5][3] = new Array('設定請款區間', 'Accounting/Acct_PaymentRequest_Request.htm', 'true');
	functionsTree[5][4] = new Array('確認請款發票', 'Accounting/Acct_PaymentRequest_Invoice.htm', 'true');
	functionsTree[5][5] = new Array('審核供應商請款', 'Accounting/Acct_PaymentApproval_Invoice.htm', 'true');
	functionsTree[5][6] = new Array('確認請款申請', 'Accounting/Acct_PaymentRequest_Apply.htm', 'true');
	functionsTree[5][7] = new Array('費用查詢及輸入', 'Accounting/費用查詢及輸入.htm', 'true');
	
	functionsTree[6] = new Array();
	functionsTree[6][0] = new Array('系統管理', "_System_Menu", "true");
	functionsTree[6][1] = new Array('維護流程範本', 'Administration/Workflow_Template_Query.htm', 'true');
	functionsTree[6][2] = new Array('管理使用者帳號', 'Administration/InqureyUserAccount.htm', 'true');
	functionsTree[6][3] = new Array('管理使用者群組', 'Administration/InqureyUserRole.htm', 'true');
	functionsTree[6][4] = new Array('維護系統訊息', 'Administration/EventMessage_InqureyResult.htm', 'true');
	functionsTree[6][5] = new Array('維護帳號權限', 'Administration/MaintainAuthority_AccountSetting.htm', 'true');
	functionsTree[6][6] = new Array('維護群組權限', 'Administration/MaintainAuthority_RoleSetting.htm', 'true');
	functionsTree[6][7] = new Array('維護系統設定', 'Administration/SystemSetting_InqureyResult.htm');
	functionsTree[6][8] = new Array('維護後台商品分類', 'Administration/BackendCategory_Maintenance.htm', 'true');
	functionsTree[6][9] = new Array('查詢審核記錄', 'Administration/Workflow_History_Query.htm', 'true');
	functionsTree[6][10] = new Array('維護運費對照表', 'Administration/Shipping_Cost_Maintain.htm', 'true');
	
	functionsTree[7] = new Array();
	functionsTree[7][0] = new Array('客服管理', "_CustomerService_Menu", "true");
	functionsTree[7][1] = new Array('發佈個人訊息', "CustomerService/SendMessage.htm", 'true');
	functionsTree[7][2] = new Array('處理客訴', "CustomerService/Handle_CustomerComplaint_Query.htm", 'true');
	functionsTree[7][3] = new Array('新增客訴', "CustomerService/Add_CustomerComplaint.htm", 'true');
	functionsTree[7][4] = new Array('處理異常客訴', "CustomerService/Dispatch_CustomerComplaint_Query.htm", 'true');

    var applicationTypeAry = new Array();
	applicationTypeAry[0] = new Array('VENDOR_APPLICATION', '供應商申請流程');
	applicationTypeAry[1] = new Array('PRODUCT_APPLICATION', '商品申請流程');
	applicationTypeAry[2] = new Array('AVALIABLE_ORDER_VOLUME_UPDATE_APPLICATION', '可接單量減量審核流程');
	applicationTypeAry[3] = new Array('PRODUCT_UPDATE_APPLICATION_TYPE_ONE', '修改商品資料流程1(不含:成本及分期設定)');
	applicationTypeAry[4] = new Array('PRODUCT_UPDATE_APPLICATION_TYPE_TWO	', '修改商品資料流程2(含:成本及分期設定)');
	applicationTypeAry[5] = new Array('MATERIAL_APPLICATION', '素材申請流程');
  applicationTypeAry[6] = new Array('GIFT_APPLICATION', '贈品審核流程');
	applicationTypeAry[7] = new Array('MARKETING_EVENT_APPLICATION', '行銷活動立案申請流程');
	applicationTypeAry[8] = new Array('PRODUCT_PURCHASE_APPLICATION', '商品採購流程');	
	applicationTypeAry[9] = new Array('PRODUCT_OPINION_APPLICATION', '商品評論流程');
	
    var flowAry = new Array();
	flowAry[0] = new Array("廠商申請", "營業主管-新申請案件授權", "商開-主約申請", "營業主管-主約審核");
	flowAry[1] = new Array("供應商-提報商品", "商開-審核提報商品", "商企-審核及撰寫上架文案", "營業主管-審核上架商品");
	flowAry[2] = new Array("供應商-修改可接單量(減量)", "商企-審核可接單量(減量)");
	flowAry[3] = new Array("供應商-修改商品資料(不含:成本及分期設定)", "商開-審核商品資料");
	flowAry[4] = new Array("供應商-修改商品資料(含:成本及分期設定)", "商開-審核商品資料", "營業主管-審核商品資料");
	flowAry[5] = new Array("行企/商企-素材製作申請", "ART主管-素材製作分派", "ART製作-素材製作上傳及送審", "ART主管-素材製作審核");
	flowAry[6] = new Array("行企-申請贈品", "行企主管-審核贈品申請");
	flowAry[7] = new Array("行企-維護行銷活動", "供應商-回覆行銷邀請", "行企主管-審核行銷活動");
	flowAry[8] = new Array("商企-申請採購數量", "採購管理員-確認採購數量", "供應商-回覆採購數量");
	flowAry[9] = new Array("商企-審核商品評論");
		
	/*
	廠商申請, 營業主管-新申請案件授權, 商開-主約申請, 營業主管-主約審核
	供應商-提報商品, 商開-審核提報商品, 商企-審核及撰寫上架文案, 營業主管-審核上架商品
	供應商-修改可接單量(減量), 商企-審核可接單量(減量)
	供應商-修改商品資料(不含:成本及分期設定), 商開-審核商品資料
	供應商-修改商品資料(含:成本及分期設定), 商開-審核商品資料, 營業主管-審核商品資料
	行企/商企-素材製作申請, ART主管-素材製作分派, ART製作-素材製作上傳及送審, ART主管-素材製作審核
	行企-申請贈品, 行企主管-審核贈品申請
	行企-維護行銷活動, 供應商-回覆行銷邀請, 行企主管-審核行銷活動
	*/

//分類
// Item1:代表Tree的第幾個Level
// Item2:該Node的文字
// Item3:該Node Click時連結的html網頁(沒有填代表不會有Link)
// Item4:Item3的網頁在哪個Frame出現
//       ""     - use arDefaultFrame變數所存之frame
//       "this" - 使用目前的Window(Frame)
//       "xxxx" - redirect to frame xxxx

var categoryDataAry = new Array(
  "1","服飾","","",
	  "2","女性服裝","","",
	      "3","小可愛","","",
	  "2","女鞋","","",
	      "3","高跟鞋","","",
	  "2","男性服裝","","",
	      "3","男性襯衫","","",
	  "2","男鞋","","",
	      "3","皮鞋","","",
  "1","電腦","","",
      "2","筆記型電腦","","",
          "3","Acer","","",
	      "3","Asus","","",
	  "2","品牌桌上型電腦","","",
          "3","HP","","",
	      "3","Sony","","");

//分類
var frontCategoryDataAry = new Array(
  "1","服飾","","",
	  "2","女性服裝","","",
	      "3","小可愛(11)","","",
	  "2","女鞋","","",
	      "3","高跟鞋(25)","","",
	  "2","男性服裝","","",
	      "3","男性襯衫(20)","","",
	  "2","<b>男鞋</b>","","",
	      "3","<b>皮鞋(10)</b>","","",
  "1","電腦","","",
      "2","筆記型電腦","","",
          "3","Acer(12)","","",
	      "3","Asus(8)","","",
	  "2","品牌桌上型電腦","","",
          "3","<font color='#FF0000'><b>HP(10)</b></font>","","",
		  "3","<b>Sony(2)</b>","","");


//////行銷活動類型
    var _masterAry = new Array();
    _masterAry[0] = '折價';
    _masterAry[1] = '專區';
    _masterAry[2] = '門檻'; 

    var _detailAry = new Array();
	_detailAry[0] = new Array('折價', '第M件N折');
    _detailAry[1] = new Array('限時限量', '競標');
	//_detailAry[2] = new Array('抽獎', '贈品', '加價購');
	_detailAry[2] = new Array('贈品', '加價購');
	
//////廣告頁面及版位
    var _PageAry = new Array();
	_PageAry[0] = '-- 請選擇 --';
	_PageAry[1] = '首頁';
	_PageAry[2] = '分館首頁';
	_PageAry[3] = '名人首頁';
	
    var _ADPlateAry = new Array();
	_ADPlateAry[0] = new Array('-- 請選擇 --');
	_ADPlateAry[1] = new Array('-- 請選擇 --', "Logo", "Information", 'Banner', 'AD1');
	_ADPlateAry[2] = new Array('-- 請選擇 --', "Logo", "Information", 'Banner', 'AD1');
	_ADPlateAry[3] = new Array('-- 請選擇 --', "Logo", "Information", 'Banner', 'AD1');
	
    var _ADPlateAndSizeAry = new Array();
	_ADPlateAndSizeAry[0] = new Array('-- 請選擇 --');
	_ADPlateAndSizeAry[1] = new Array('-- 請選擇 --', "Logo (200x400)", "Information (100x300)", 'Banner (100x600)', 'AD1 (200x300)');
	_ADPlateAndSizeAry[2] = new Array('-- 請選擇 --', "Logo (200x400)", "Information (100x300)", 'Banner (100x600)', 'AD1 (200x300)');
	_ADPlateAndSizeAry[3] = new Array('-- 請選擇 --', "Logo (200x400)", "Information (100x300)", 'Banner (100x600)', 'AD1 (200x300)');

//////運費
    var _ShippingWarehouseAry = new Array();
	  _ShippingWarehouseAry[0] = '-- 請選擇 --';
	  _ShippingWarehouseAry[1] = '富購';
	var _LogisticalModeAry = new Array();
	  _LogisticalModeAry[0] = new Array();
	  _LogisticalModeAry[1] = new Array('富購物流');

//////客訴主次因
    var _CustomerComplaint0Ary = new Array();
	    _CustomerComplaint0Ary[0] = '訂單問題';
	    _CustomerComplaint0Ary[1] = '退換維修';
	    _CustomerComplaint0Ary[2] = '帳款發票';
	    _CustomerComplaint0Ary[3] = '行銷問題';
	    _CustomerComplaint0Ary[4] = '個人資料';
	    _CustomerComplaint0Ary[5] = '會員諮詢';
	  
	var _CustomerComplaint1Ary = new Array();
	    _CustomerComplaint1Ary[0] = new Array('結帳問題', '取消訂單', '進度問題', '物流問題', '其他');
		_CustomerComplaint1Ary[1] = new Array('商品問題', '退貨問題', '換貨問題', '其他');
		_CustomerComplaint1Ary[2] = new Array('退款問題', '發票問題', '其他');
		_CustomerComplaint1Ary[3] = new Array('折價問題', '贈品問題', '紅利問題', '活動問題', '其他');
		_CustomerComplaint1Ary[4] = new Array('資料問題', '密碼問題', '登入問題', '註冊問題', '其他');
		_CustomerComplaint1Ary[5] = new Array('系統', '訂單與配送', '退換貨', '發票帳款', '商品', '行銷', '會員', '其他');
	  
	var _CustomerComplaint2Ary = new Array();
	    _CustomerComplaint2Ary[0] = new Array();
	    _CustomerComplaint2Ary[0][0] = new Array('結帳問題');
	    _CustomerComplaint2Ary[0][1] = new Array('一般取消', '缺貨取消');
		_CustomerComplaint2Ary[0][2] = new Array('到貨延遲', '進度查詢');
		_CustomerComplaint2Ary[0][3] = new Array('態度不佳', '包裝破損', '運費問題');
		_CustomerComplaint2Ary[0][4] = new Array('其他');
		
		_CustomerComplaint2Ary[1] = new Array();
		_CustomerComplaint2Ary[1][0] = new Array('通報維修', '貨品瑕疵', '商品缺件');
	    _CustomerComplaint2Ary[1][1] = new Array('一般退貨', '質量退貨', '退貨缺損');
		_CustomerComplaint2Ary[1][2] = new Array('一般換貨', '質量換貨', '錯貨取回');
		_CustomerComplaint2Ary[1][3] = new Array('其他');
		
		_CustomerComplaint2Ary[2] = new Array();
		_CustomerComplaint2Ary[2][0] = new Array('進度查詢', '金額不符');
	    _CustomerComplaint2Ary[2][1] = new Array('補寄發票', '開錯發票');
		_CustomerComplaint2Ary[2][2] = new Array('其他');
		
		_CustomerComplaint2Ary[3] = new Array();
		_CustomerComplaint2Ary[3][0] = new Array('金額不符');
	    _CustomerComplaint2Ary[3][1] = new Array('補寄贈品', '贈品不符');
		_CustomerComplaint2Ary[3][2] = new Array('加給問題', '扣抵問題');
		_CustomerComplaint2Ary[3][3] = new Array('資格問題');
		_CustomerComplaint2Ary[3][4] = new Array('其他');
		
		_CustomerComplaint2Ary[4] = new Array();
		_CustomerComplaint2Ary[4][0] = new Array('修改資料');
	    _CustomerComplaint2Ary[4][1] = new Array('補寄密碼');
		_CustomerComplaint2Ary[4][2] = new Array('無法登入');
		_CustomerComplaint2Ary[4][3] = new Array('身份被盜用');
		_CustomerComplaint2Ary[4][4] = new Array('其他');

		_CustomerComplaint2Ary[5] = new Array();
		_CustomerComplaint2Ary[5][0] = new Array('網頁問題');
	    _CustomerComplaint2Ary[5][1] = new Array('運費規則', '配送範圍', '訂購及付款');
		_CustomerComplaint2Ary[5][2] = new Array('退貨', '換貨', '錯貨及缺件');
		_CustomerComplaint2Ary[5][3] = new Array('退款', '發票');
		_CustomerComplaint2Ary[5][4] = new Array('商品規格', '商品知識');
		_CustomerComplaint2Ary[5][5] = new Array('活動辦法', '紅利規則', '折價券規則');
		_CustomerComplaint2Ary[5][6] = new Array('加入會員', '登入');
		_CustomerComplaint2Ary[5][7] = new Array('其他');



    	  


