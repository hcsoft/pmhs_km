package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

import java.sql.Timestamp;

/**
 * HealthEducat generated by hbm2java
 */
public class HealthEducat implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer orgId;
	private Timestamp date;
	private String place;
	private String way;
	private String unit;
	private String collaborator;
	private Integer joinPersonNum;
	private String publicizeInfo;
	private String subject;
	private String propagator;
	private String conclude;
	private String judge;
	private String principal;
	private Timestamp writeDate;
	private String inputPersonId;
	private Timestamp inputDate;
	private String catagory;
	private String content;
	private String inputPersonName;

	public HealthEducat() {
	}

	public HealthEducat(Integer orgId, String inputPersonId, Timestamp inputDate) {
		this.orgId = orgId;
		this.inputPersonId = inputPersonId;
		this.inputDate = inputDate;
	}

	
	public HealthEducat(String id, Integer orgId, Timestamp date, String place,
			String way, String unit, String collaborator,
			Integer joinPersonNum, String publicizeInfo, String subject,
			String propagator, String conclude, String judge, String principal,
			Timestamp writeDate, String inputPersonId, Timestamp inputDate,
			String catagory, String content, String inputPersonName) {
		super();
		this.id = id;
		this.orgId = orgId;
		this.date = date;
		this.place = place;
		this.way = way;
		this.unit = unit;
		this.collaborator = collaborator;
		this.joinPersonNum = joinPersonNum;
		this.publicizeInfo = publicizeInfo;
		this.subject = subject;
		this.propagator = propagator;
		this.conclude = conclude;
		this.judge = judge;
		this.principal = principal;
		this.writeDate = writeDate;
		this.inputPersonId = inputPersonId;
		this.inputDate = inputDate;
		this.catagory = catagory;
		this.content = content;
		this.inputPersonName = inputPersonName;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOrgId() {
		return this.orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getWay() {
		return this.way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCollaborator() {
		return this.collaborator;
	}

	public void setCollaborator(String collaborator) {
		this.collaborator = collaborator;
	}

	public Integer getJoinPersonNum() {
		return this.joinPersonNum;
	}

	public void setJoinPersonNum(Integer joinPersonNum) {
		this.joinPersonNum = joinPersonNum;
	}

	public String getPublicizeInfo() {
		return this.publicizeInfo;
	}

	public void setPublicizeInfo(String publicizeInfo) {
		this.publicizeInfo = publicizeInfo;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPropagator() {
		return this.propagator;
	}

	public void setPropagator(String propagator) {
		this.propagator = propagator;
	}

	public String getConclude() {
		return this.conclude;
	}

	public void setConclude(String conclude) {
		this.conclude = conclude;
	}

	public String getJudge() {
		return this.judge;
	}

	public void setJudge(String judge) {
		this.judge = judge;
	}

	public String getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public Timestamp getWriteDate() {
		return this.writeDate;
	}

	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}

	public String getInputPersonId() {
		return this.inputPersonId;
	}

	public void setInputPersonId(String inputPersonId) {
		this.inputPersonId = inputPersonId;
	}

	public Timestamp getInputDate() {
		return this.inputDate;
	}

	public void setInputDate(Timestamp inputDate) {
		this.inputDate = inputDate;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInputPersonName() {
		return inputPersonName;
	}

	public void setInputPersonName(String inputPersonName) {
		this.inputPersonName = inputPersonName;
	}
	
}