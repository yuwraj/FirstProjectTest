package com.i91.beans.ManyToManyPkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Mobile.class).addAnnotatedClass(Person.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Mobile m = session.get(Mobile.class, 1);
		System.out.println("------------>>>> "+m.getMobileCompanyName());
		List<Person> person = m.getPerson();
		System.out.println(person);
		

	}

}
