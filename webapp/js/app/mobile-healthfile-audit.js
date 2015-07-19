Ext.ns("app");

app.mobileHealthFileAudit = new Ext.tf.MobileHealthFilePanel({
	treeLoaderFn : UserMenuTreeService.getUserDistrictNodes,
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
	} ],
	gridCmConfig : [{
		"header" : "档案编号",
		"dataIndex" : "fileNo",
		"width" : 200
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
		"header" : "身份证号",
		"dataIndex" : "idnumber"
	}, {
		"header" : "关系",
		"dataIndex" : "relation"
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
			}
			return '已审核';
		}
	}]
});

_tab = ModuleMgr.register(app.mobileHealthFileAudit);
