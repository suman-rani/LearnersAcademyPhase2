package com.DAO;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	public Student createStudent(Student student);
	public Student getStudentId(int id);
	public List<Student> getAllStudent();
	public void removeStudent(int id);
	public Student updateStudent(Student student);

}
