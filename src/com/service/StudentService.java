package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	
		public Student createStudent(Student student);
		public Student getStudentId(int id);
		public List<Student> getAllStudent();
		public void removeStudent(int id);
		public Student updateStudent(Student student);

}
