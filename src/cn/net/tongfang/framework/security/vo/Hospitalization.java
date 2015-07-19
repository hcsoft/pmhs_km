package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

import java.sql.Timestamp;

/**
 * Hospitalization generated by hbm2java
 */
public class Hospitalization implements java.io.Serializable {

	private String id;
	private String medicalExamId;
	private String type;
	private Timestamp beginDate;
	private Timestamp endDate;
	private String reason;
	private String hospital;
	private String reportNo;

	public Hospitalization() {
	}

	public Hospitalization(String medicalExamId, String type) {
		this.medicalExamId = medicalExamId;
		this.type = type;
	}

	public Hospitalization(String medicalExamId, String type,
			Timestamp beginDate, Timestamp endDate, String reason,
			String hospital, String reportNo) {
		this.medicalExamId = medicalExamId;
		this.type = type;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.reason = reason;
		this.hospital = hospital;
		this.reportNo = reportNo;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMedicalExamId() {
		return this.medicalExamId;
	}

	public void setMedicalExamId(String medicalExamId) {
		this.medicalExamId = medicalExamId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Timestamp beginDate) {
		this.beginDate = beginDate;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getHospital() {
		return this.hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getReportNo() {
		return this.reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

}
