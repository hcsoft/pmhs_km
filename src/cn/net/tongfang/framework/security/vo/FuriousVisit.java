package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

import java.sql.Timestamp;

/**
 * FuriousVisit generated by hbm2java
 */
public class FuriousVisit implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String fileNo;
	private String inputPersonId;
	private Timestamp inputDate;
	private String symptomOther;
	private String compliance;
	private String adr;
	private String adrother;
	private String visitType;
	private Integer transfer;
	private String transReason;
	private String transUnit;
	private Timestamp nextVistDate;
	private String visitDoctor;
	private Timestamp visitDate;
	private String status01;
	private String status02;
	private String status03;
	private String status04;
	private String status05;
	private String status06;
	private String status07;
	private String status08;
	private Integer effect1;
	private Integer effect2;
	private Integer effect3;
	private Integer effect4;
	private Integer effect5;
	private String examine;
	private String cureStatus;
	private String measureOther;
	private String danger;
	private String lockStatus;
	private String hospitalCourse;
	private Timestamp hospotalEndDate;
	private String execDistrictNum;
	
	public FuriousVisit() {
	}

	public FuriousVisit(String fileNo, String inputPersonId, Timestamp inputDate) {
		this.fileNo = fileNo;
		this.inputPersonId = inputPersonId;
		this.inputDate = inputDate;
	}

	

	public FuriousVisit(String id, String fileNo, String inputPersonId,
			Timestamp inputDate, String symptomOther, String compliance,
			String adr, String adrother, String visitType, Integer transfer,
			String transReason, String transUnit, Timestamp nextVistDate,
			String visitDoctor, Timestamp visitDate, String status01,
			String status02, String status03, String status04, String status05,
			String status06, String status07, String status08, Integer effect1,
			Integer effect2, Integer effect3, Integer effect4, Integer effect5,
			String examine, String cureStatus, String measureOther,
			String danger, String lockStatus, String hospitalCourse,
			Timestamp hospotalEndDate,String execDistrictNum) {
		super();
		this.id = id;
		this.fileNo = fileNo;
		this.inputPersonId = inputPersonId;
		this.inputDate = inputDate;
		this.symptomOther = symptomOther;
		this.compliance = compliance;
		this.adr = adr;
		this.adrother = adrother;
		this.visitType = visitType;
		this.transfer = transfer;
		this.transReason = transReason;
		this.transUnit = transUnit;
		this.nextVistDate = nextVistDate;
		this.visitDoctor = visitDoctor;
		this.visitDate = visitDate;
		this.status01 = status01;
		this.status02 = status02;
		this.status03 = status03;
		this.status04 = status04;
		this.status05 = status05;
		this.status06 = status06;
		this.status07 = status07;
		this.status08 = status08;
		this.effect1 = effect1;
		this.effect2 = effect2;
		this.effect3 = effect3;
		this.effect4 = effect4;
		this.effect5 = effect5;
		this.examine = examine;
		this.cureStatus = cureStatus;
		this.measureOther = measureOther;
		this.danger = danger;
		this.lockStatus = lockStatus;
		this.hospitalCourse = hospitalCourse;
		this.hospotalEndDate = hospotalEndDate;
		this.execDistrictNum = execDistrictNum;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileNo() {
		return this.fileNo;
	}

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
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

	public String getSymptomOther() {
		return this.symptomOther;
	}

	public void setSymptomOther(String symptomOther) {
		this.symptomOther = symptomOther;
	}

	public String getCompliance() {
		return this.compliance;
	}

	public void setCompliance(String compliance) {
		this.compliance = compliance;
	}

	public String getAdr() {
		return this.adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getAdrother() {
		return this.adrother;
	}

	public void setAdrother(String adrother) {
		this.adrother = adrother;
	}

	public String getVisitType() {
		return this.visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	public Integer getTransfer() {
		return this.transfer;
	}

	public void setTransfer(Integer transfer) {
		this.transfer = transfer;
	}

	public String getTransReason() {
		return this.transReason;
	}

	public void setTransReason(String transReason) {
		this.transReason = transReason;
	}

	public String getTransUnit() {
		return this.transUnit;
	}

	public void setTransUnit(String transUnit) {
		this.transUnit = transUnit;
	}

	public Timestamp getNextVistDate() {
		return this.nextVistDate;
	}

	public void setNextVistDate(Timestamp nextVistDate) {
		this.nextVistDate = nextVistDate;
	}

	public String getVisitDoctor() {
		return this.visitDoctor;
	}

	public void setVisitDoctor(String visitDoctor) {
		this.visitDoctor = visitDoctor;
	}

	public Timestamp getVisitDate() {
		return this.visitDate;
	}

	public void setVisitDate(Timestamp visitDate) {
		this.visitDate = visitDate;
	}

	public String getStatus01() {
		return this.status01;
	}

	public void setStatus01(String status01) {
		this.status01 = status01;
	}

	public String getStatus02() {
		return this.status02;
	}

	public void setStatus02(String status02) {
		this.status02 = status02;
	}

	public String getStatus03() {
		return this.status03;
	}

	public void setStatus03(String status03) {
		this.status03 = status03;
	}

	public String getStatus04() {
		return this.status04;
	}

	public void setStatus04(String status04) {
		this.status04 = status04;
	}

	public String getStatus05() {
		return this.status05;
	}

	public void setStatus05(String status05) {
		this.status05 = status05;
	}

	public String getStatus06() {
		return this.status06;
	}

	public void setStatus06(String status06) {
		this.status06 = status06;
	}

	public String getStatus07() {
		return this.status07;
	}

	public void setStatus07(String status07) {
		this.status07 = status07;
	}

	public String getStatus08() {
		return this.status08;
	}

	public void setStatus08(String status08) {
		this.status08 = status08;
	}

	public Integer getEffect1() {
		return this.effect1;
	}

	public void setEffect1(Integer effect1) {
		this.effect1 = effect1;
	}

	public Integer getEffect2() {
		return this.effect2;
	}

	public void setEffect2(Integer effect2) {
		this.effect2 = effect2;
	}

	public Integer getEffect3() {
		return this.effect3;
	}

	public void setEffect3(Integer effect3) {
		this.effect3 = effect3;
	}

	public Integer getEffect4() {
		return this.effect4;
	}

	public void setEffect4(Integer effect4) {
		this.effect4 = effect4;
	}

	public Integer getEffect5() {
		return this.effect5;
	}

	public void setEffect5(Integer effect5) {
		this.effect5 = effect5;
	}

	public String getExamine() {
		return this.examine;
	}

	public void setExamine(String examine) {
		this.examine = examine;
	}

	public String getCureStatus() {
		return this.cureStatus;
	}

	public void setCureStatus(String cureStatus) {
		this.cureStatus = cureStatus;
	}

	public String getMeasureOther() {
		return this.measureOther;
	}

	public void setMeasureOther(String measureOther) {
		this.measureOther = measureOther;
	}

	public String getDanger() {
		return danger;
	}

	public void setDanger(String danger) {
		this.danger = danger;
	}

	public String getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	public String getHospitalCourse() {
		return hospitalCourse;
	}

	public void setHospitalCourse(String hospitalCourse) {
		this.hospitalCourse = hospitalCourse;
	}

	public Timestamp getHospotalEndDate() {
		return hospotalEndDate;
	}

	public void setHospotalEndDate(Timestamp hospotalEndDate) {
		this.hospotalEndDate = hospotalEndDate;
	}

	public String getExecDistrictNum() {
		return execDistrictNum;
	}

	public void setExecDistrictNum(String execDistrictNum) {
		this.execDistrictNum = execDistrictNum;
	}

}
