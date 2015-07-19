package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

import java.sql.Timestamp;

/**
 * BusinessLog generated by hbm2java
 */
public class BusinessLog implements java.io.Serializable {

	private Integer id;
	private Integer businessId;
	private Integer person;
	private Timestamp date;
	private Integer businessKey;
	private Integer businessParentKey;
	private String memo;

	public BusinessLog() {
	}

	public BusinessLog(Integer id, Integer businessId, Integer person,
			Integer businessKey, Integer businessParentKey) {
		this.id = id;
		this.businessId = businessId;
		this.person = person;
		this.businessKey = businessKey;
		this.businessParentKey = businessParentKey;
	}

	public BusinessLog(Integer id, Integer businessId, Integer person,
			Timestamp date, Integer businessKey, Integer businessParentKey,
			String memo) {
		this.id = id;
		this.businessId = businessId;
		this.person = person;
		this.date = date;
		this.businessKey = businessKey;
		this.businessParentKey = businessParentKey;
		this.memo = memo;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public Integer getPerson() {
		return this.person;
	}

	public void setPerson(Integer person) {
		this.person = person;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getBusinessKey() {
		return this.businessKey;
	}

	public void setBusinessKey(Integer businessKey) {
		this.businessKey = businessKey;
	}

	public Integer getBusinessParentKey() {
		return this.businessParentKey;
	}

	public void setBusinessParentKey(Integer businessParentKey) {
		this.businessParentKey = businessParentKey;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
