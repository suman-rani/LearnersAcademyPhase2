package com.service;

import java.util.List;

import com.model.Teacher;

public interface TeacherService {
	
	public Teacher createTeacher(Teacher teacher);
	public Teacher getTeacherId(int id);
	public List<Teacher> getAllTeacher();
	public void removeTeacher(int id);
	public Teacher updateTeacher(Teacher teacher);

}
