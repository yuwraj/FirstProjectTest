package com.i91.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Student;

public class TestEvictClear {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Student stud1 = session.load(Student.class, 11);
		Student stud2 = session.load(Student.class, 12);
		//session.evict(stud1);
		session.clear();
		Student stud3 = session.load(Student.class, 11);
		Student stud4 = session.load(Student.class, 12);
		session.getTransaction().commit();
	}

}
