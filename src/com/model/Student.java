package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentid;
	 private String studentName;
	 
	 public Student() {
		 
	 }

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + "]";
	}

	public Student(int studentid, String studentName) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
	}
	 
}
