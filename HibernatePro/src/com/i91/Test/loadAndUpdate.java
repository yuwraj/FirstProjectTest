package com.i91.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Student;

public class loadAndUpdate {

	public static void main(String[] args) {
		System.out.println("Load and Update");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Student stud = session.load(Student.class, 2);
		System.out.println("version=" + stud.getVer());
		Transaction tx = session.beginTransaction();
		stud.setSname("Yuwi1");
		tx.commit();
	}

}
