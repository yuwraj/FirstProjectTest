package com.i91.beans.ManyToManyPkg;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Mobile.class).addAnnotatedClass(Person.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Person p = new Person();
		p.setPersonName("Raj");
		Person p1 = new Person();
		p1.setPersonName("Aaj");
		Person p2 = new Person();
		p2.setPersonName("Kal");
//Test Edit from git hub
		ArrayList<Person> al = new ArrayList<>();
		al.add(p);
		al.add(p1);
		al.add(p2);

		Mobile m = new Mobile();
		m.setMobileCompanyName("Nokia");
		m.setPerson(al);

		session.save(m);
		tx.commit();
	}

}
