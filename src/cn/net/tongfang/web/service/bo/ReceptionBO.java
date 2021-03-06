package cn.net.tongfang.web.service.bo;

import cn.net.tongfang.framework.security.SecurityManager;
import cn.net.tongfang.framework.security.demo.service.TaxempDetail;
import cn.net.tongfang.framework.security.vo.Reception;

public class ReceptionBO extends Reception{

	public ReceptionBO() {
		super();
		//todo 和瑞菁确认
		TaxempDetail currentOperator = SecurityManager.currentOperator();
		if (currentOperator != null)
			this.setOrgId(currentOperator.getOrgId());
		else {
			this.setOrgId(0);
		}
	}
}
