package com.i91.beans.oneToOnePkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneSelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		/*Employee emp = session.get(Employee.class, 7);
		System.out.println("Employee Name = " + emp.getEmpName());
		Address add = emp.getAddress();
		System.out.println(add.getId());
		System.out.println(add.getCity());
		System.out.println(add.getState());*/
		
		Address add  = session.get(Address.class, 8);
		System.out.println(add.getId());
		System.out.println(add.getCity());
		System.out.println(add.getState());
	}

}
