package cn.net.tongfang.framework.security.vo;

import java.sql.Timestamp;

/**
 * HealthFileTransition entity. @author MyEclipse Persistence Tools
 */

public class HealthFileTransition implements java.io.Serializable {

	// Fields

	private String serialno;
	private String fileNo;
	private String idnumber;
	private String relation;
	private String name;
	private String sex;
	private Timestamp birthday;
	private String tel;
	private String address;
	private String residenceAddress;
	private String resideType;
	private String oldOrgId;
	private String oldDistrictId;
	private String currentOrgId;
	private String currentDistrictId;
	private String inputPersonId;
	private Timestamp inputDate;
	private String cellId;
	private String checkFlag;
	private String areaId;
	private String unitId;
	private String errorReason;
	private String remark;
	// Constructors

	/** default constructor */
	public HealthFileTransition() {
	}

	/** minimal constructor */
	public HealthFileTransition(String serialno, String idnumber,
			String relation, String name, String sex, String currentOrgId,
			String currentDistrictId, String inputPersonId,
			Timestamp inputDate, String cellId) {
		this.serialno = serialno;
		this.idnumber = idnumber;
		this.relation = relation;
		this.name = name;
		this.sex = sex;
		this.currentOrgId = currentOrgId;
		this.currentDistrictId = currentDistrictId;
		this.inputPersonId = inputPersonId;
		this.inputDate = inputDate;
		this.cellId = cellId;
	}

	/** full constructor */
	public HealthFileTransition(String serialno, String fileNo,
			String idnumber, String relation, String name, String sex,
			Timestamp birthday, String tel, String address,
			String residenceAddress, String resideType, String oldOrgId,
			String oldDistrictId, String currentOrgId,
			String currentDistrictId, String inputPersonId,
			Timestamp inputDate, String cellId, String checkFlag,String areaId,
			String unitId,String errorReason,String remark) {
		this.serialno = serialno;
		this.fileNo = fileNo;
		this.idnumber = idnumber;
		this.relation = relation;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.tel = tel;
		this.address = address;
		this.residenceAddress = residenceAddress;
		this.resideType = resideType;
		this.oldOrgId = oldOrgId;
		this.oldDistrictId = oldDistrictId;
		this.currentOrgId = currentOrgId;
		this.currentDistrictId = currentDistrictId;
		this.inputPersonId = inputPersonId;
		this.inputDate = inputDate;
		this.cellId = cellId;
		this.checkFlag = checkFlag;
		this.unitId = unitId;
		this.areaId = areaId;
		this.errorReason = errorReason;
		this.remark = remark;
	}

	// Property accessors

	public String getSerialno() {
		return this.serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getFileNo() {
		return this.fileNo;
	}

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getResidenceAddress() {
		return this.residenceAddress;
	}

	public void setResidenceAddress(String residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public String getResideType() {
		return this.resideType;
	}

	public void setResideType(String resideType) {
		this.resideType = resideType;
	}

	public String getOldOrgId() {
		return this.oldOrgId;
	}

	public void setOldOrgId(String oldOrgId) {
		this.oldOrgId = oldOrgId;
	}

	public String getOldDistrictId() {
		return this.oldDistrictId;
	}

	public void setOldDistrictId(String oldDistrictId) {
		this.oldDistrictId = oldDistrictId;
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
	}

	public String getCurrentDistrictId() {
		return this.currentDistrictId;
	}

	public void setCurrentDistrictId(String currentDistrictId) {
		this.currentDistrictId = currentDistrictId;
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

	public String getCheckFlag() {
		return this.checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getCellId() {
		return cellId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}