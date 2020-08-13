package com.serviceimpl;

import java.util.List;

import com.DAO.TeacherDao;
import com.DAOImpl.TeacherDaoImpl;
import com.model.Teacher;
import com.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

	TeacherDao dao=new TeacherDaoImpl();
	
	@Override
	public Teacher createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return dao.createTeacher(teacher);
	}

	@Override
	public Teacher getTeacherId(int id) {
		// TODO Auto-generated method stub
		return dao.getTeachertId(id);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return dao.getAllTeacher();
	}

	@Override
	public void removeTeacher(int id) {
		// TODO Auto-generated method stub
	   dao.removeTeacher(id);	
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return dao.updateTeacher(teacher);
	}

}
