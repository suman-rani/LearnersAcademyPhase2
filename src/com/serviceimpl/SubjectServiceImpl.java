package com.serviceimpl;

import java.util.List;

import com.DAO.SubjectDao;
import com.DAOImpl.SubjectDaoImpl;
import com.model.Subject;
import com.service.SubjectService;

public class SubjectServiceImpl implements SubjectService{

	SubjectDao dao=new SubjectDaoImpl();

	@Override
	public Subject createSubject(Subject subject) {
		// TODO Auto-generated method stub
		return dao.createSubject(subject);
	}

	@Override
	public Subject getSubjectId(int id) {
		// TODO Auto-generated method stub
		return dao.getSubjectId(id);
	}

	@Override
	public List<Subject> getAllSubject() {
		// TODO Auto-generated method stub
		return dao.getAllSubject();
	}

	@Override
	public void removeSubject(int id) {
		// TODO Auto-generated method stub
		dao.removeSubject(id);
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return dao.updateSubject(subject);
	}

}
