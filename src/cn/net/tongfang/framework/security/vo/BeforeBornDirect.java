package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * BeforeBornDirect generated by hbm2java
 */
public class BeforeBornDirect implements java.io.Serializable {

	private String id;
	private String visitBeforeBornId;
	private Integer beforeBornDirectId;

	public BeforeBornDirect() {
	}

	public BeforeBornDirect(String visitBeforeBornId, Integer beforeBornDirectId) {
		this.visitBeforeBornId = visitBeforeBornId;
		this.beforeBornDirectId = beforeBornDirectId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVisitBeforeBornId() {
		return this.visitBeforeBornId;
	}

	public void setVisitBeforeBornId(String visitBeforeBornId) {
		this.visitBeforeBornId = visitBeforeBornId;
	}

	public Integer getBeforeBornDirectId() {
		return this.beforeBornDirectId;
	}

	public void setBeforeBornDirectId(Integer beforeBornDirectId) {
		this.beforeBornDirectId = beforeBornDirectId;
	}

}
