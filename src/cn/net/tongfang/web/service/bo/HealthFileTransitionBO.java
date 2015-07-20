package cn.net.tongfang.web.service.bo;

import cn.net.tongfang.framework.security.vo.HealthFileTransition;

public class HealthFileTransitionBO extends HealthFileTransition{
	private String oldOrgName;
	private String curOrgName;

	public String getOldOrgName() {
		return oldOrgName;
	}

	public void setOldOrgName(String oldOrgName) {
		this.oldOrgName = oldOrgName;
	}

	public String getCurOrgName() {
		return curOrgName;
	}

	public void setCurOrgName(String curOrgName) {
		this.curOrgName = curOrgName;
	}
	
}
