package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="STUDENT_DTLS")
public class Student {
	@Id
    @Column(name="STUDENT_ID")
	private Integer StudentId;
    
    @Column(name="STUDENT_NAME")
	private String StudentName;
    
    
    @Column(name="STUDENT_EMAIL")
	private String StudentEmail;
    
    
    @Column(name="STUDENT_AGE")
    private Integer StudentAge;

    
    public Integer getStudentId() {
		return StudentId;
	}


	public void setStudentId(Integer studentId) {
		StudentId = studentId;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public String getStudentEmail() {
		return StudentEmail;
	}


	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}


	public Integer getStudentAge() {
		return StudentAge;
	}


	public void setStudentAge(Integer studentAge) {
		StudentAge = studentAge;
	}



	
	
}
