package cn.net.tongfang.framework.security.vo;

// Generated by Hibernate Tools 3.2.4.GA

/**
 * DrinkHabit generated by hbm2java
 */
public class DrinkHabit implements java.io.Serializable {

	private String id;
	private String medicalExamId;
	private Integer drinkHabitId;

	public DrinkHabit() {
	}

	public DrinkHabit(String medicalExamId, Integer drinkHabitId) {
		this.medicalExamId = medicalExamId;
		this.drinkHabitId = drinkHabitId;
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

	public Integer getDrinkHabitId() {
		return this.drinkHabitId;
	}

	public void setDrinkHabitId(Integer drinkHabitId) {
		this.drinkHabitId = drinkHabitId;
	}

}
