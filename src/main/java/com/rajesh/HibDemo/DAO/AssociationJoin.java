package com.rajesh.HibDemo.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rajesh.HibDemo.SessionFactoryUtil;
import com.rajesh.HibDemo.DTO.Student;


public class AssociationJoin {
	
	Session session = SessionFactoryUtil.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	
	public void saveDetails (Student student) {
		session.save(student);
		transaction.commit();
		System.out.println("Data Inserted...");
	}

	
	

}
