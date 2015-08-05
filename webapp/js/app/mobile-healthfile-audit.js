Ext.ns("app");

app.mobileHealthFileAudit = new Ext.tf.MobileHealthFilePanel({
	treeLoaderFn : UserMenuTreeService.getXkOrganizationNodes,
	queryUrl : UserMenuTreeService.getMobileHealthFile,
	title : '移动档案审核',
	recordId : 'serialno',
	recordPk : 'serialno',
	readerConfig : [ {
		name : 'serialno'
	},{
		name : 'fileNo'
	}, {
		name : 'name'
	}, {
		name : 'relation',
		mapping : 'relation'
	}, {
		name : 'sex',
		mapping : 'sex'
	}, {
		name : 'birthday',
		mapping : 'birthday'
	}, {
		name : 'idnumber'
	}, {
		name : 'tel',
		mapping : 'tel'
	}, {
		name : 'address',
		mapping : 'address'
	}, {
		name : 'residenceAddress',
		mapping : 'residenceAddress'
	} , {
		name : 'checkFlag',
		mapping : 'checkFlag'
	}, {
		name : 'checkFlag',
		mapping : 'checkFlag'
	}, {
		name : 'inputDate',
		mapping : 'inputDate'
	}, {
		name : 'cellId',
		mapping : 'cellId'
	}, {
		name : 'oldOrgName',
		mapping : 'oldOrgName'
	}, {
		name : 'curOrgName',
		mapping : 'curOrgName'
	}, {
		name : 'currentDistrictId',
		mapping : 'currentDistrictId'
	}, {
		name : 'memberCardNumber',
		mapping : 'memberCardNumber'
	}, {
		name : 'referees',
		mapping : 'referees'
	}, {
		name : 'memberLabel',
		mapping : 'memberLabel'
	} ],
	gridCmConfig : [{
		"header" : "原建档机构",
		"dataIndex" : "oldOrgName",
		"width" : 150
	},{
		"header" : "档案编号",
		"dataIndex" : "fileNo",
		"width" : 150
	}, {
		"header" : "姓名",
		"dataIndex" : "name"
	}, {
		"header" : "性别",
		"dataIndex" : "sex",
		"width" : 50
	}, {
		"header" : "出生日期",
		"dataIndex" : "birthday",
		"renderer" : Ext.util.Format.dateRenderer('Y-m-d')
	}, {
		"header" : "联系电话",
		"dataIndex" : "tel"
	}, {
		"header" : "身份证号",
		"dataIndex" : "idnumber",
		"width" : 150
	}, {
		"header" : "关系",
		"dataIndex" : "relation"
	}, {
		"header" : "户编号",
		"dataIndex" : "cellId"
	}, {
		"header" : "住址",
		"dataIndex" : "address"
	}, {
		"header" : "籍贯",
		"dataIndex" : "residenceAddress"
	}, {
		"header" : "电话",
		"dataIndex" : "tel"
	}, {
		"header" : "审核状态",
		"dataIndex" : "checkFlag",
		"renderer" : function(v){
			if(v == '00'){
				return '未审核';
			}else if(v == '01'){
				return '已审核';
			}else if(v == '99'){
				return '审核未通过';
			}else{
				return '其它';
			}
		}
	}]
});

_tab = ModuleMgr.register(app.mobileHealthFileAudit);
