package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * FatherHistory generated by hbm2java
 */
public class FatherHistory implements java.io.Serializable {

	private String id;
	private String personalInfoId;
	private Integer heredityId;

	public FatherHistory() {
	}

	public FatherHistory(String personalInfoId, Integer heredityId) {
		this.personalInfoId = personalInfoId;
		this.heredityId = heredityId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersonalInfoId() {
		return this.personalInfoId;
	}

	public void setPersonalInfoId(String personalInfoId) {
		this.personalInfoId = personalInfoId;
	}

	public Integer getHeredityId() {
		return this.heredityId;
	}

	public void setHeredityId(Integer heredityId) {
		this.heredityId = heredityId;
	}

}