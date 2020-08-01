package com.i91.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Student;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Student stud = session.get(Student.class, 6);
		System.out.println("Student name" + stud.getSname());
		//Student stud = new Student();
		//stud.setSid(2);
		Transaction txn = session.beginTransaction();
		session.delete(stud);
		session.save(stud);
		Student stud1 = session.get(Student.class, 6);
		session.flush();
		txn.rollback();
		//txn.commit();
	}

}
