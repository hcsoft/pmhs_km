package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * BabySkin generated by hbm2java
 */
public class BabySkin implements java.io.Serializable {

	private String id;
	private String babyVisitId;
	private Integer babySkinId;

	public BabySkin() {
	}

	public BabySkin(String babyVisitId, Integer babySkinId) {
		this.babyVisitId = babyVisitId;
		this.babySkinId = babySkinId;
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

	public Integer getBabySkinId() {
		return this.babySkinId;
	}

	public void setBabySkinId(Integer babySkinId) {
		this.babySkinId = babySkinId;
	}

}
