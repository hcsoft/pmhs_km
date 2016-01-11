Ext.ns("app");

var  condition = new Ext.form.FieldSet({
	title:'查询条件',
	width:400,
	height:100,	
	items:[
			{id:'idnumber',name: "idnumber", fieldLabel: "身份证号", xtype:"textfield",width:150	},
			new Ext.Button({
				text:'查询',
				width:20,
				handler:query
			})
	       ]
})
var result = new Ext.form.FieldSet({
	title:'查询结果',
	width:400,
	height:350,
	items:[
			{id:'fileNo',name: "fileNo", fieldLabel: "档案号",disabled :true, xtype:"textfield",width:260},   
			{id:'personal_name',name: "name", fieldLabel: "姓名",disabled :true, xtype:"textfield",width:260},	
			{id:'address',name: "address", fieldLabel: "现住址",disabled :true, xtype:"textfield",width:260},
			{id:'tel',name: "tel", fieldLabel: "电话",disabled :true, xtype:"textfield",width:260},
			{id:'residenceAddress',name: "residenceAddress", fieldLabel: "户籍地址",disabled :true, xtype:"textfield",width:260},
			{id:'districtNumber',name: "districtNumber", fieldLabel: "行政区划编码",disabled :true, xtype:"textfield",width:260},
			{id:'township',name: "township", fieldLabel: "乡镇(街道)名称",disabled :true, xtype:"textfield",width:260},
			{id:'village',name: "village", fieldLabel: "村(居)委会名称",disabled :true, xtype:"textfield",width:260},
			{id:'buildUnit',name: "buildUnit", fieldLabel: "建档单位",disabled :true, xtype:"textfield",width:260},
			{id:'buildPerson',name: "buildPerson", fieldLabel: "建档人",disabled :true, xtype:"textfield",width:260},
			{id:'doctor',name: "doctor", fieldLabel: "责任医生",disabled :true, xtype:"textfield",width:260},
			{id:'buildDate',name: "buildDate", fieldLabel: "建档日期",disabled :true, xtype:"datefield",format: 'Y-m-d',width:260 }
	       ]
});
app.personDetailInfoPanel = new Ext.form.FormPanel({
	title : '居民健康档案',	
    items: [
         condition,
         result
		
    ],
		


});

function query(){

	
	var idnumber = Ext.getCmp('idnumber').getValue();
	if(idnumber==""||idnumber==null){
		Ext.Msg.show({
			title : '错误',
			msg : '身份证号码为空',
			buttons : Ext.Msg.OK,
			animEl: 'elId',
			icon: Ext.MessageBox.INFO
		});
	}
	UserMenuTreeService.findAllHealthInfo(idnumber,function(data){
		if (data[1]['fileNo']!=null){			
			Ext.getCmp('fileNo').setValue(data[1]['fileNo']);
			Ext.getCmp('personal_name').setValue(data[1]['name']);
			Ext.getCmp('address').setValue(data[1]['address']);
			Ext.getCmp('tel').setValue(data[1]['tel']);
			Ext.getCmp('residenceAddress').setValue(data[1]['residenceAddress']);
			Ext.getCmp('districtNumber').setValue(data[1]['districtNumber']);
			Ext.getCmp('township').setValue(data[1]['township']);
			Ext.getCmp('buildUnit').setValue(data[1]['buildUnit']);
			Ext.getCmp('buildPerson').setValue(data[1]['buildPerson']);
			Ext.getCmp('doctor').setValue(data[1]['doctor']);
			Ext.getCmp('buildDate').setValue(data[1]['buildDate']);
			
			Ext.getCmp('idnumber').setValue(data[2]['idnumber']);
		}else{
			Ext.Msg.show({
				title : '错误',
				msg : '未查到该居民档案',
				buttons : Ext.Msg.OK,
				animEl: 'elId',
				icon: Ext.MessageBox.INFO
			});
		}
	});

}
ModuleMgr.register(app.personDetailInfoPanel);
