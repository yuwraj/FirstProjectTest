package com.i91.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Student;

public class loadData {

	public static void main(String[] args) {
		System.out.println("Load Data");
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		System.out.println("Load Data1");
		Student stud = (Student) session.load(Student.class, 4);
		System.out.println("Load Data2");
		System.out.println(stud.getSid());
		System.out.println(stud.getSname());
		System.out.println(stud.getState());
		System.out.println(stud.getPincode());
		System.out.println("Load Data3");
		session.close();
		
		
		Session session1 = sf.openSession();
		System.out.println("Load Data1");
		Student stud1 = (Student) session1.load(Student.class, 4);
		System.out.println("Load Data2");
		System.out.println(stud1.getSid());
	}
}
