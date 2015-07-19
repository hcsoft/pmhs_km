package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * ChronicMedications generated by hbm2java
 */
public class ChronicMedications implements java.io.Serializable {

	private String id;
	private String drugName;
	private String usage;
	private String dosage;
	private String chronicVisitId;

	public ChronicMedications() {
	}

	public ChronicMedications(String drugName, String usage, String dosage,
			String chronicVisitId) {
		this.drugName = drugName;
		this.usage = usage;
		this.dosage = dosage;
		this.chronicVisitId = chronicVisitId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getChronicVisitId() {
		return this.chronicVisitId;
	}

	public void setChronicVisitId(String chronicVisitId) {
		this.chronicVisitId = chronicVisitId;
	}

}
