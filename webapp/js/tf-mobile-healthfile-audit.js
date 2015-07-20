Ext.ns("Ext.tf");

Ext.tf.MobileHealthFilePanel = Ext.extend(Ext.Panel, {
	closable : true,
	currentNode : null, // 当前选择的树节点
	layout : 'fit',
	pageSize : 10,
	recordId : 'id',
	recordPk : 'id',
	// height:700,
	// 是否需要在最末级才能增加？
	checkLastLevel : true,

	// 设置查询url
	queryUrl : Ext.emptyFn,
	treeLoaderFn : Ext.emptyFn,
	getAddParams : function() {
		var node = this.getTreeSelNode();
		var districtNumber = node.id;
		var param = '?districtNumber=' + districtNumber;
		return param;
	},

	// 设置查询用的类别，比如档案，高血压等。。
	readerConfig : [],
	gridCmConfig : [],
	gridViewConfig : {},
	initComponent : function() {
		this.build();
		Ext.tf.MobileHealthFilePanel.superclass.initComponent.call(this);
	},

	build : function() {
		this.items = [ this.createPanel() ];
	},

	getTreeSelNode : function() {
		var selNode = this.currentNode;
		if (selNode) {
			// Ext.Msg.alert('', selNode.text);
		} else {
			Ext.Msg.show({
				icon : Ext.Msg.WARNING,
				buttons : Ext.Msg.OK,
				msg : '请先选择一个行政区域！'
			});
		}
		;
		return selNode;
	},
	MobileHealthfileAuditingForm : function(){
		var selections = this.grid.getSelections();
		if(selections.length > 0){
			var items = [];
			var height = 320;
			var data = selections[0];
			var fileNo = data.data.fileNo;
			var districtId = data.data.currentDistrictId;
			console.log(fileNo);
			console.log(districtId);
			if(fileNo == null || fileNo == ''){
				var panel = new Ext.FormPanel({
					layout : 'absolute',
					width : 400,
					height : 300,
					frame : true,
					items : [Component.createLabel('healthfileTypeTxt','healthfileTypeTxt',3,3,'档案类型：'),
					         Component.createTextfield('healthfileType','healthfileType',60,0,170,true,'新建档案'),
					         Component.createLabel('healthfilenameTxt','healthfilenameTxt',3,33,'姓名：'),
					         Component.createTextfield('healthfilename','healthfilename',60,30,170,true,data.data.name),
					         Component.createLabel('healthfilesexTxt','healthfilesexTxt',3,63,'性别：'),
					         Component.createTextfield('healthfilesex','healthfilesex',60,60,170,true,data.data.sex),
					         Component.createLabel('healthfilebirthdayTxt','healthfilebirthdayTxt',3,93,'出生日期：'),
					         Component.createTextfield('healthfilebirthday','healthfilebirthday',60,90,170,true,calculateTimeObj.formatDate(data.data.birthday)),
					         Component.createLabel('healthfileidnumberTxt','healthfileidnumberTxt',3,123,'身份证号：'),
					         Component.createTextfield('healthfileidnumber','healthfileidnumber',60,120,170,true,data.data.idnumber),
					         Component.createLabel('healthfileaddressTxt','healthfileaddressTxt',3,153,'现住址：'),
					         Component.createTextfield('healthfileaddress','healthfileaddress',60,150,170,true,data.data.address),
					         Component.createLabel('healthfileorgnameTxt','healthfileorgnameTxt',3,183,'机构名称：'),
					         Component.createTextfield('healthfileorgname','healthfileorgname',60,180,170,true,data.data.oldOrgName),
					         Component.createLabel('healthfilebuilddateTxt','healthfilebuilddateTxt',3,213,'建档日期：'),
					         Component.createTextfield('healthfilebuilddate','healthfilebuilddate',60,210,170,true,calculateTimeObj.formatDate(data.data.inputDate)),
					         Component.createButton('healthfileauditingbtn','healthfileauditingbtn',3,245,'c_edit',{
					        	 click : function() {
					        		 var auditing = function(e) {
										if (e == "yes") {
											PersonalInfoService.mobileHealthFileAuditing({serialno:data.id},function(d){
												if(d != null && d == '1'){
													showInfoObj.Infor('档案审核成功！');
													win.close();
													Ext.getCmp('mobileHealthfileAuditin').getStore().reload();
												}else{
													showInfoObj.Infor('档案审核失败！');
												}
											});
										}
									 };
									 Ext.MessageBox.confirm("提示", "是否审核通过当前建档数据？", auditing,this);
//					        		 this.load(true);
					        	 }.createDelegate(this)
					         },'审核'),
					         Component.createButton('healthfileauditingclosewinbtn','healthfileauditingclosewinbtn',70,245,'c_del',{
					        	 click : function() {
					        		 win.close();
					        	 }.createDelegate(this)
					         },'关闭窗口')]
				});
			}else if(fileNo.substring(0,districtId.length) == districtId){
				var panel = new Ext.FormPanel({
					layout : 'absolute',
					width : 400,
					height : 300,
					frame : true,
					items : [Component.createLabel('healthfileTypeTxt','healthfileTypeTxt',3,3,'档案类型：'),
					         Component.createTextfield('healthfileType','healthfileType',60,0,170,true,'已建档案'),
					         Component.createLabel('healthfilenameTxt','healthfilenameTxt',3,33,'姓名：'),
					         Component.createTextfield('healthfilename','healthfilename',60,30,170,true,data.data.name),
					         Component.createLabel('healthfilesexTxt','healthfilesexTxt',3,63,'性别：'),
					         Component.createTextfield('healthfilesex','healthfilesex',60,60,170,true,data.data.sex),
					         Component.createLabel('healthfilebirthdayTxt','healthfilebirthdayTxt',3,93,'出生日期：'),
					         Component.createTextfield('healthfilebirthday','healthfilebirthday',60,90,170,true,calculateTimeObj.formatDate(data.data.birthday)),
					         Component.createLabel('healthfileidnumberTxt','healthfileidnumberTxt',3,123,'身份证号：'),
					         Component.createTextfield('healthfileidnumber','healthfileidnumber',60,120,170,true,data.data.idnumber),
					         Component.createLabel('healthfileaddressTxt','healthfileaddressTxt',3,153,'机构名称：'),
					         Component.createTextfield('healthfileaddress','healthfileaddress',60,150,170,true,data.data.oldOrgName),
					         Component.createLabel('healthfileorgnameTxt','healthfileorgnameTxt',3,183,'建档日期：'),
					         Component.createTextfield('healthfileorgname','healthfileorgname',60,180,170,true,calculateTimeObj.formatDate(data.data.inputDate)),
					         Component.createLabel('healthfilebuilddateTxt','healthfilebuilddateTxt',3,213,'户编号：'),
					         Component.createTextfield('healthfilebuilddate','healthfilebuilddate',60,210,170,true,data.data.scellId),
					         Component.createButton('healthfileauditingbtn','healthfileauditingbtn',3,245,'c_edit',{
					        	 click : function() {
					        		 var auditing = function(e) {
										if (e == "yes") {
											PersonalInfoService.mobileHealthFileAuditing({serialno:data.id},function(d){
												if(d != null && d == '1'){
													showInfoObj.Infor('档案审核成功！');
													win.close();
													Ext.getCmp('mobileHealthfileAuditin').getStore().reload();
												}else{
													showInfoObj.Infor('档案审核失败！');
												}
											});
										}
									 };
									 Ext.MessageBox.confirm("提示", "是否审核通过当前建档数据？", auditing,this);
//					        		 this.load(true);
					        	 }.createDelegate(this)
					         },'审核'),
					         Component.createButton('healthfileauditingclosewinbtn','healthfileauditingclosewinbtn',70,245,'c_del',{
					        	 click : function() {
					        		 win.close();
					        	 }.createDelegate(this)
					         },'关闭窗口')]
				});
			}else{
				height = 360;
				var panel = new Ext.FormPanel({
					layout : 'absolute',
					width : 400,
					height : 320,
					frame : true,
					items : [Component.createLabel('healthfileTypeTxt','healthfileTypeTxt',3,3,'档案类型：'),
					         Component.createTextfield('healthfileType','healthfileType',60,0,190,true,'转档'),
					         Component.createLabel('healthfilenameTxt','healthfilenameTxt',3,33,'姓名：'),
					         Component.createTextfield('healthfilename','healthfilename',60,30,190,true,data.data.name),
					         Component.createLabel('healthfilesexTxt','healthfilesexTxt',3,63,'性别：'),
					         Component.createTextfield('healthfilesex','healthfilesex',60,60,190,true,data.data.sex),
					         Component.createLabel('healthfilebirthdayTxt','healthfilebirthdayTxt',3,93,'出生日期：'),
					         Component.createTextfield('healthfilebirthday','healthfilebirthday',60,90,190,true,calculateTimeObj.formatDate(data.data.birthday)),
					         Component.createLabel('healthfileidnumberTxt','healthfileidnumberTxt',3,123,'身份证号：'),
					         Component.createTextfield('healthfileidnumber','healthfileidnumber',60,120,190,true,data.data.idnumber),
					         Component.createLabel('healthfileaddressoutTxt','healthfileaddressoutTxt',3,153,'转出机构名称：'),
					         Component.createTextfield('healthfileaddressout','healthfileaddressout',80,150,170,true,data.data.oldOrgName),
					         Component.createLabel('healthfileaddressTxt','healthfileaddressTxt',3,183,'转入机构名称：'),
					         Component.createTextfield('healthfileaddress','healthfileaddress',80,180,170,true,data.data.curOrgName),
					         Component.createLabel('healthfileorgnameTxt','healthfileorgnameTxt',3,213,'建档日期：'),
					         Component.createTextfield('healthfileorgname','healthfileorgname',60,210,190,true,calculateTimeObj.formatDate(data.data.inputDate)),
					         Component.createLabel('healthfilebuilddateTxt','healthfilebuilddateTxt',3,243,'户编号：'),
					         Component.createTextfield('healthfilebuilddate','healthfilebuilddate',60,240,190,true,data.data.scellId),
					         Component.createButton('healthfileauditingbtn','healthfileauditingbtn',3,275,'c_edit',{
					        	 click : function() {
					        		 var auditing = function(e) {
										if (e == "yes") {
											PersonalInfoService.mobileHealthFileAuditing({serialno:data.id},function(d){
												if(d != null && d == '1'){
													showInfoObj.Infor('档案审核成功！');
													Ext.getCmp('mobileHealthFileWin').close();
													Ext.getCmp('mobileHealthfileAuditin').getStore().reload();
												}else{
													showInfoObj.Infor('档案审核失败！');
												}
											});
										}
									 };
									 Ext.MessageBox.confirm("提示", "是否审核通过当前建档数据？", auditing,this);
//					        		 this.load(true);
					        	 }.createDelegate(this)
					         },'审核'),
					         Component.createButton('healthfileauditingclosewinbtn','healthfileauditingclosewinbtn',70,275,'c_del',{
					        	 click : function() {
					        		 win.close();
					        	 }.createDelegate(this)
					         },'关闭窗口')]
				});
			}
			items.push(panel)
			var win = new Ext.Window({
				width : 300,
				height : height,
				modal : true,
				title : '入户建档审核',
				items : items,
				id:'mobileHealthFileWin'
			});
			win.show();
		}else{
			showInfoObj.Infor('请选择档案！');
		}
		
	},
	createActions : function() {
		var searchCondition = [ [ 'a.name', '姓名' ], [ 'a.birthday', '出生日期' ],
				[ 'a.fileNo', '档案编码' ], [ 'a.idnumber', '身份证号' ] ];

		var store = new Ext.data.SimpleStore({
			fields : [ 'type', 'display' ],
			data : searchCondition
		});
		this.combo = new Ext.form.ComboBox({
			store : store,
			displayField : 'display',
			valueField : 'type',
			typeAhead : true,
			mode : 'local',
			triggerAction : 'all',
			selectOnFocus : true,
			editable : false,
			width : 100,
			value : 'a.name'
		});
		this.filterField = new Ext.form.TextField({
			fieldLabel : '',
			enableKeyEvents : true,
			listeners : {
				'keypress' : function(field, event) {
					if (event.getKey() == 13) {
						this.load(true);
					}
					;
				}.createDelegate(this)
			}
		});

		var funcAction;
		funcAction = [ this.combo, this.filterField, new Ext.Action({
			text : '查询',
			iconCls : 'c_query',
			handler : function() {
				this.load();
			}.createDelegate(this)
		}),new Ext.Action({
			text : '审核',
			iconCls : 'c_edit',
			handler : function() {
				var selections = this.grid.getSelections();
				if(selections.length == 1){
					var data = selections[0];
					console.log(data);
					if(data.data.checkFlag == '01'){
						showInfoObj.Infor('此档案已经通过审核，不需要对档案进行重复审核！');
						return false;
					}
					this.MobileHealthfileAuditingForm();
					
				}else{
					showInfoObj.Infor('请选择需要审核的档案！');
				}
			}.createDelegate(this)
		}) ];
		return funcAction;
	},

	/*
	 * 取得行政树的节点 如果节点没有选中，提示信息，返回空 如果选中，再取得过滤条件，组合成查询条件，并返回之
	 */
	getParams : function() {
		var selNode = this.getTreeSelNode();
		if (selNode) {
			var filterKey = this.combo.getValue();
			var filterValue = this.filterField.getValue();

			var cond = {
				district : selNode.id,
				filterKey : filterKey,
				filterValue : filterValue
			};
			return cond;
		}
		return null;
	},
	/*
	 * 查询数据, 如果树没有选择了节点，不执行
	 */
	load : function(isReset) {
		var selNode = this.getTreeSelNode();
		if (selNode) {
			if (isReset) {
				this.pagingBar.changePage(1);
			}
			this.grid.getStore().reload();
			this.doLayout(true);
		}
	},
	createPanel : function() {
		var reader = new Ext.data.JsonReader({
			totalProperty : "totalSize",
			root : "data",
			id : this.recordId
		}, Ext.data.Record.create(this.readerConfig));

		var store = new Ext.data.Store({
			proxy : new Ext.ux.data.DWRProxy({
				dwrFunction : this.queryUrl,
				listeners : {
					'beforeload' : function(dataProxy, params) {
						var o = this.getParams();
						if (!params.limit)
							params.limit = this.pageSize;
						params[dataProxy.loadArgsKey] = [ o, params ];
					}.createDelegate(this)
				}
			}),
			reader : reader
		});

		this.pagingBar = new App.PagingToolbar({
			pageSize : this.pageSize,
			store : store,
			displayInfo : true,
			displayMsg : '{0} - {1} of {2}',
			emptyMsg : "没有记录"
		});
		var sm = new Ext.grid.CheckboxSelectionModel({singleSelect:true});
		this.gridCmConfig.unshift(sm);

		this.grid = new Ext.grid.GridPanel({
			title : '请选择一个行政区划',
			bbar : this.pagingBar,
			layout : 'fit',
			store : store,
			cm : new Ext.grid.ColumnModel(this.gridCmConfig),
			viewConfig : this.gridViewConfig,
			sm : sm,
			id : 'mobileHealthfileAuditin'
		});

		this.grid.getView().on('refresh', function() {
			// 缺省选择grid的第一条记录
			var model = this.grid.getSelectionModel();
			if (model.getCount() == 0) {
				model.selectFirstRow();
			}
		}.createDelegate(this));

		this.menu = new Ext.tree.TreePanel({
			// height : 465,
			layout : 'fit',
			animate : true,
			enableDD : false,
			loader : new Ext.ux.DWRTreeLoader({
				dwrCall : this.treeLoaderFn
			}),
			lines : true,
			autoScroll : true,
			border : false,
			root : new Ext.tree.AsyncTreeNode({
				text : 'root',
				draggable : false,
				id : 'org'
			}),
			rootVisible : false
		});

		this.menu.getRootNode().on({
			append : {
				stopEvent : true,
				fn : function(t, me, n, index) {
					// 自动展开根节点的第一个孩子
					if (index == 0) {
						if (!n.leaf)
							n.expand();
						this.currentNode = n;
						// this.load();
					}
				}.createDelegate(this)
			}
		});

		this.menu.on({
			click : {
				stopEvent : true,
				fn : function(n, e) {
					e.stopEvent();
					this.currentNode = n;
					this.grid.setTitle(n.text);
					this.load();
				}.createDelegate(this)
			}
		});

		var panel = new Ext.Panel({
			layout : 'border',
			autoScroll : true,
			tbar : this.createActions(),
			items : [ {
				region : 'west',
				layout : 'fit',
				frame : false,
				title : '行政区划',
				split : true,
				collapsible : true,
				layoutConfig : {
					animate : true
				},
				width : 200,
				minSize : 100,
				maxSize : 400,
				border : false,
				items : [ this.menu ]
			}, {
				region : 'center',
				layout : 'fit',
				frame : false,
				border : false,
				items : [ this.grid]
			} ]
		});
		return panel;
	}
});
