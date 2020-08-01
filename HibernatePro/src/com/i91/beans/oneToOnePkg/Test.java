package com.i91.beans.oneToOnePkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ONe To One Testing Start...");
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Address add = new Address();
		add.setCity("Pune1");
		add.setState("Maharastra1");

		Employee emp = new Employee();
		emp.setEmpName("Yuwi1");
		emp.setAddress(add);
		session.save(emp);
		tx.commit();

	}
}
