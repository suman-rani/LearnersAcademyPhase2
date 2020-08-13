package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;
	private int className;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Subject> subject=new ArrayList<Subject>();
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Student> student=new ArrayList<Student>();
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Teacher> teacher=new ArrayList<Teacher>();
	
	public Classes() {
		
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getClassName() {
		return className;
	}

	public void setClassName(int className) {
		this.className = className;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classes [classId=" + classId + ", className=" + className + ", subject=" + subject + ", student="
				+ student + ", teacher=" + teacher + "]";
	}

	
	public Classes(int classId, int className, List<Subject> subject, List<Student> student, List<Teacher> teacher) {
		super();
		this.classId = classId;
		this.className = className;
		this.subject = subject;
		this.student = student;
		this.teacher = teacher;
	}
	
	
	
}
