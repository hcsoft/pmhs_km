package cn.net.tongfang.framework.security.vo;

/**
 * MapOrgWechatId entity. @author MyEclipse Persistence Tools
 */

public class MapOrgWechatId implements java.io.Serializable {

	// Fields

	private String orgwechat;
	private Integer orgid;

	// Constructors

	/** default constructor */
	public MapOrgWechatId() {
	}

	/** full constructor */
	public MapOrgWechatId(String orgwechat, Integer orgid) {
		this.orgwechat = orgwechat;
		this.orgid = orgid;
	}

	// Property accessors

	public String getOrgwechat() {
		return this.orgwechat;
	}

	public void setOrgwechat(String orgwechat) {
		this.orgwechat = orgwechat;
	}

	public Integer getOrgid() {
		return this.orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MapOrgWechatId))
			return false;
		MapOrgWechatId castOther = (MapOrgWechatId) other;

		return ((this.getOrgwechat() == castOther.getOrgwechat()) || (this
				.getOrgwechat() != null && castOther.getOrgwechat() != null && this
				.getOrgwechat().equals(castOther.getOrgwechat())))
				&& ((this.getOrgid() == castOther.getOrgid()) || (this
						.getOrgid() != null && castOther.getOrgid() != null && this
						.getOrgid().equals(castOther.getOrgid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrgwechat() == null ? 0 : this.getOrgwechat().hashCode());
		result = 37 * result
				+ (getOrgid() == null ? 0 : this.getOrgid().hashCode());
		return result;
	}

}