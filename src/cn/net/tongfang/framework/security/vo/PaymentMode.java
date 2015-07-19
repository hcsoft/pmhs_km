package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * PaymentMode generated by hbm2java
 */
public class PaymentMode implements java.io.Serializable {

	private String id;
	private String personalInfoId;
	private Integer paymentModeId;

	public PaymentMode() {
	}

	public PaymentMode(String personalInfoId, Integer paymentModeId) {
		this.personalInfoId = personalInfoId;
		this.paymentModeId = paymentModeId;
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

	public Integer getPaymentModeId() {
		return this.paymentModeId;
	}

	public void setPaymentModeId(Integer paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

}