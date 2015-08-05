package cn.net.tongfang.framework.security.vo;

/**
 * HealthFileMember entity. @author MyEclipse Persistence Tools
 */

public class HealthFileMember implements java.io.Serializable {

	// Fields

	private String serialno;
	private String memberCardNumber;
	private String referees;
	private String memberLabel;

	// Constructors

	/** default constructor */
	public HealthFileMember() {
	}

	/** minimal constructor */
	public HealthFileMember(String serialno) {
		this.serialno = serialno;
	}

	/** full constructor */
	public HealthFileMember(String serialno, String memberCardNumber,
			String referees, String memberLabel) {
		this.serialno = serialno;
		this.memberCardNumber = memberCardNumber;
		this.referees = referees;
		this.memberLabel = memberLabel;
	}

	// Property accessors

	public String getSerialno() {
		return this.serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getMemberCardNumber() {
		return this.memberCardNumber;
	}

	public void setMemberCardNumber(String memberCardNumber) {
		this.memberCardNumber = memberCardNumber;
	}

	public String getReferees() {
		return this.referees;
	}

	public void setReferees(String referees) {
		this.referees = referees;
	}

	public String getMemberLabel() {
		return this.memberLabel;
	}

	public void setMemberLabel(String memberLabel) {
		this.memberLabel = memberLabel;
	}

}