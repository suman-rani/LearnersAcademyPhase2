package com.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.DAO.ClassDao;
import com.model.Classes;

public class ClassDaoImpl implements ClassDao{

	Configuration configuration=new Configuration().configure();
	StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());
	
	
	@Override
	public Classes createClass(Classes classes) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(classes);
		transaction.commit();
		session.close();
		
		return classes;
	}

	@Override
	public Classes getClassId(int id) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Classes classes=(Classes) session.get(Classes.class, id);
		transaction.commit();
		session.close();
		return classes;
	}

	@Override
	public List<Classes> getAllClass() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Classes> classList=session.createQuery("from com.model.Classes").list();
		transaction.commit();
		session.close();
		return classList;
	}

	@Override
	public void removeClass(int id) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Classes c=new Classes();
		c.setClassId(id);
		session.delete(c);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Classes updateClass(Classes classes) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(classes);
		transaction.commit();
		session.close();
		return classes;
	}

}
