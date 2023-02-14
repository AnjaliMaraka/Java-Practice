package com.bitlabs.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TharabaiBatch {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id")
	private int id;
	@Override
	public String toString() {
		return "TharabhaiBatch [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
	@Column(name="student_name")
	private String name;
	@Column(name="student_email")
	private String email;
	@Column(name="student_marks")
	private int marks;
	@Column(name="Student_grade")
	private String grade;
	@Column(name="Student_Location")
	private String location;
	
	
	
	
	public TharabaiBatch(String name, String email, int marks) {
		super();
		
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.grade = grade;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	
	public TharabaiBatch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
