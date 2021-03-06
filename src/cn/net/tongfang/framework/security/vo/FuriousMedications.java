package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * FuriousMedications generated by hbm2java
 */
public class FuriousMedications implements java.io.Serializable {

	private String id;
	private String furiousVisitId;
	private String drugName;
	private String usage;
	private String dosage;

	public FuriousMedications() {
	}

	public FuriousMedications(String furiousVisitId) {
		this.furiousVisitId = furiousVisitId;
	}

	public FuriousMedications(String furiousVisitId, String drugName,
			String usage, String dosage) {
		this.furiousVisitId = furiousVisitId;
		this.drugName = drugName;
		this.usage = usage;
		this.dosage = dosage;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFuriousVisitId() {
		return this.furiousVisitId;
	}

	public void setFuriousVisitId(String furiousVisitId) {
		this.furiousVisitId = furiousVisitId;
	}

	public String getDrugName() {
		return this.drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getDosage() {
		return this.dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

}
