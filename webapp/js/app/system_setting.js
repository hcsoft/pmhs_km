Ext.ns("app");

app.systemSettingPanel = Ext.extend(Ext.Panel,{
//	initComponent : function() {
//		this.build();
//		app.systemSettingPanel.superclass.initComponent.call(this);
//	},
//
//	build : function() {
//		// this.tbar = this.createActions();
//		this.items = [ this.createPanel() ];
//	},
//	createPanel : function() {
//		
//	}
});

app.systemSetting = new app.systemSettingPanel({
	items : [{
		xtype : 'tabpanel',
		activeTab: 0,
		items: [{
	        title: '操作权限设置',
	        tbar:[{
	        	text:'保存',
	        	iconCls : 'c_add',
	        	handler : function() {
	        		var val = Ext.getCmp('modifyAuthorityForm').getForm().getValues();
	        		console.log(val);
	        		systemSetting.savModifyAuthority(val,function(data){
	        			if(data == '1'){
	        				Ext.Msg.alert('', '保存成功！');
	        			}
	        		});
	        	}.createDelegate(this)
	        }],
	        height:70,
        	width:800,
	        items:[new Ext.FormPanel({
	        	id:'modifyAuthorityForm',
	        	height:70,
	        	width:800,
	        	frame:true,
	        	listeners : {
	        		'beforerender' : function() {
	        			dwr.engine.setAsync(false);
	        			systemSetting.getModifyAuthority(function(data){
	        				console.log(data);
	        				var form = Ext.getCmp('modifyAuthorityRadio');
	        				console.log(form);
	        				if(data == '1'){
	        					form.items[0]['checked'] = true;
	        				}else if(data == '2'){
	        					form.items[1]['checked'] = true;
	        				}else if(data == '3'){
	        					form.items[2]['checked'] = true;
	        				}
	        			});
	        			dwr.engine.setAsync(true);
	        		}
	        	},
	        	items:[{
	        		xtype:'radiogroup',
		        	fieldLabel:'业务数据操作权限',
		        	name:'modifyAuthority',
		        	id:'modifyAuthorityRadio',
		        	items:[
			        	{boxLabel:'只能录入人修改',name:'modifyAuthority',inputValue:'1'},
			        	{boxLabel:'上级可修改',name:'modifyAuthority',inputValue:'2'},
			        	{boxLabel:'同级可修改',name:'modifyAuthority',inputValue:'3'}
		        	]
	        	}]
	        })]
	    }]
	}]
});

_tab = ModuleMgr.register(app.systemSetting);