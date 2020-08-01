package com.i91.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Student;
public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Student stud = new Student();
		stud.setSid(2);
		stud.setSname("narso");
		stud.setPincode(111111);
		stud.setState(11111);
		Transaction txn = session.beginTransaction();
		//session.saveOrUpdate(stud);
		session.update(stud);
		txn.commit();
		System.out.println("Record Updated Successfully...");
	}

}
