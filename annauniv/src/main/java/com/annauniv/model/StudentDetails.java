package com.annauniv.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class StudentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sId;
	private String studName;
	private String fatherName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate studDOB;
	@Enumerated(EnumType.STRING)
    private Gender gender;
	private int physics;
	private int chemistry;
	private int maths;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public LocalDate getStudDOB() {
		return studDOB;
	}
	public void setStudDOB(LocalDate studDOB) {
		this.studDOB = studDOB;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public StudentDetails() {
		super();
	}
	public StudentDetails(Integer sId, String studName, String fatherName, LocalDate studDOB, int physics, int chemistry,
			int maths) {
		super();
		this.sId = sId;
		this.studName = studName;
		this.fatherName = fatherName;
		this.studDOB = studDOB;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}
	@Override
	public String toString() {
		return "StudentDetails [sId=" + sId + ", studName=" + studName + ", fatherName=" + fatherName + ", studDOB="
				+ studDOB + ", physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths + "]";
	}
}
