package cn.net.tongfang.web.service.bo;

import cn.net.tongfang.framework.security.vo.HealthFileTransition;

public class HealthFileTransitionBO extends HealthFileTransition{
	private String oldOrgName;
	private String curOrgName;
	private String memberCardNumber;
	private String referees;
	private String memberLabel;

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

	public String getMemberCardNumber() {
		return memberCardNumber;
	}

	public void setMemberCardNumber(String memberCardNumber) {
		this.memberCardNumber = memberCardNumber;
	}

	public String getReferees() {
		return referees;
	}

	public void setReferees(String referees) {
		this.referees = referees;
	}

	public String getMemberLabel() {
		return memberLabel;
	}

	public void setMemberLabel(String memberLabel) {
		this.memberLabel = memberLabel;
	}
	
}
