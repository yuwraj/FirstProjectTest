package com.i91.Test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import com.i91.beans.Student;

public class CriteriaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Criteria Test...");
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria ctr = session.createCriteria(Student.class);
		ctr.add(Restrictions.gt("pincode", 10));
		//ctr.add(Expression.like("sname", "Yuwi%"));
		//ctr.add(Restrictions.like("sname", "Yuwi%"));
		//ctr.add(Restrictions.isNotNull("sname"));
		//ctr.add(Restrictions.sqlRestriction("pincode like '" + 411007 + "%'"));
		List<Student> stud = ctr.list();
		for (Student ss : stud) {
			System.out.println(ss.getSname());
		}
	}

}
