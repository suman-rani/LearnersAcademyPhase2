package com.serviceimpl;
import java.util.List;

import com.DAO.ClassDao;
import com.DAOImpl.ClassDaoImpl;
import com.model.Classes;
import com.service.ClassService;

public class ClassServiceImpl implements ClassService {
	
	ClassDao dao= new ClassDaoImpl();

	@Override
	public Classes createClass(Classes classes) {
		// TODO Auto-generated method stub
		return dao.createClass(classes);
	}

	@Override
	public Classes getClassId(int id) {
		// TODO Auto-generated method stub
		return dao.getClassId(id);
	}

	@Override
	public List<Classes> getAllClass() {
		// TODO Auto-generated method stub
		return dao.getAllClass();
	}

	@Override
	public void removeClass(int id) {
		// TODO Auto-generated method stub
		dao.removeClass(id);
		
	}

	@Override
	public Classes updateClass(Classes classes) {
		// TODO Auto-generated method stub
		return dao.updateClass(classes);
	}
	
	

}
