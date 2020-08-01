package com.i91.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Student;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		Student ss = new Student();
		ss.setSid(222);
		ss.setSname("Aaj");
		ss.setState(1111);
		ss.setPincode(4110271);
		System.out.println(1);
		session.save(ss);
		System.out.println(2);
		//session.flush();
		System.out.println(3);
		session.flush();
		txn.rollback();
		System.out.println(4);
	}

}
