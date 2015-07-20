package cn.net.tongfang.framework.security.vo;


/**
 * OnlinePhoto entity. @author MyEclipse Persistence Tools
 */

public class OldNewOrg implements java.io.Serializable {

	// Fields

	private String id;
	private String oldOrgName;
	private String curOrgName;

	// Constructors

	/** default constructor */
	public OldNewOrg() {
	}

	/** full constructor */
	

	// Property accessors

	public String getId() {
		return this.id;
	}

	public OldNewOrg(String id, String oldOrgName, String curOrgName) {
		super();
		this.id = id;
		this.oldOrgName = oldOrgName;
		this.curOrgName = curOrgName;
	}

	public void setId(String id) {
		this.id = id;
	}

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