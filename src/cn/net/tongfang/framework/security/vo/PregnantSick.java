package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * PregnantSick generated by hbm2java
 */
public class PregnantSick implements java.io.Serializable {

	private String id;
	private String babyVisitId;
	private Integer kidneySickId;

	public PregnantSick() {
	}

	public PregnantSick(String babyVisitId, Integer kidneySickId) {
		this.babyVisitId = babyVisitId;
		this.kidneySickId = kidneySickId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBabyVisitId() {
		return this.babyVisitId;
	}

	public void setBabyVisitId(String babyVisitId) {
		this.babyVisitId = babyVisitId;
	}

	public Integer getKidneySickId() {
		return this.kidneySickId;
	}

	public void setKidneySickId(Integer kidneySickId) {
		this.kidneySickId = kidneySickId;
	}

}
