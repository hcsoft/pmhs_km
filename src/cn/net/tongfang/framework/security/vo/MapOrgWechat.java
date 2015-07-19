package cn.net.tongfang.framework.security.vo;

/**
 * MapOrgWechat entity. @author MyEclipse Persistence Tools
 */

public class MapOrgWechat implements java.io.Serializable {

	// Fields

	private MapOrgWechatId id;

	// Constructors

	/** default constructor */
	public MapOrgWechat() {
	}

	/** full constructor */
	public MapOrgWechat(MapOrgWechatId id) {
		this.id = id;
	}

	// Property accessors

	public MapOrgWechatId getId() {
		return this.id;
	}

	public void setId(MapOrgWechatId id) {
		this.id = id;
	}

}