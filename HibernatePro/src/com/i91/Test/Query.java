package com.i91.Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Query");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		org.hibernate.Query query = session.createQuery("select pincode, sname From Student");
		List stud = query.list();
		for (Object ss : stud) {
			System.out.println("Name ="+ss.toString());			
		}
	}

}
