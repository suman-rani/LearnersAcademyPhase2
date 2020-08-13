package com.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.DAO.TeacherDao;
import com.model.Teacher;

public class TeacherDaoImpl implements TeacherDao{

	
	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());
	
	@Override
	public Teacher createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

	@Override
	public Teacher getTeachertId(int id) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Teacher teacher=(Teacher) session.get(Teacher.class, id);
		transaction.commit();
		session.close();
		return teacher;
	}

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Teacher> teacherList=session.createQuery("from com.model.Teacher").list();
		transaction.commit();
		session.close();
		return teacherList;
	}

	@Override
	public void removeTeacher(int id) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Teacher t=new Teacher();
		t.setTeacherId(id);
		session.delete(t);
		transaction.commit();
		session.close();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

}
