package com.i91.beans.manyToOnePkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Address add = new Address();
		add.setCity("Pune");
		add.setState("MH");
		add.setPinCode(480106);

		Employee e1 = new Employee();
		e1.setEmpName("Kal");
		e1.setAddress(add);

		Employee e2 = new Employee();
		e2.setEmpName("Parso");
		e2.setAddress(add);

		session.save(e1);
		session.save(e2);
		tx.commit();
	}

}
