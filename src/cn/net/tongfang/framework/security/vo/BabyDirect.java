package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * BabyDirect generated by hbm2java
 */
public class BabyDirect implements java.io.Serializable {

	private String id;
	private String babyVisitId;
	private Integer babyDirectId;

	public BabyDirect() {
	}

	public BabyDirect(String babyVisitId, Integer babyDirectId) {
		this.babyVisitId = babyVisitId;
		this.babyDirectId = babyDirectId;
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

	public Integer getBabyDirectId() {
		return this.babyDirectId;
	}

	public void setBabyDirectId(Integer babyDirectId) {
		this.babyDirectId = babyDirectId;
	}

}
