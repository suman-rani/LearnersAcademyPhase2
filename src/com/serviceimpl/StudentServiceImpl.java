package com.serviceimpl;

import java.util.List;

import com.DAO.StudentDao;
import com.DAOImpl.StudentDaoImpl;
import com.model.Student;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDao dao=new StudentDaoImpl();
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.createStudent(student);
	}

	@Override
	public Student getStudentId(int id) {
		// TODO Auto-generated method stub
		return dao.getStudentId(id);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		dao.removeStudent(id);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudent(student);
	}

}
