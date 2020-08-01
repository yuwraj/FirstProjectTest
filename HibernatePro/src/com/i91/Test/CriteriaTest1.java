package com.i91.Test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.i91.beans.Student;

public class CriteriaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		// org.hibernate.Criteria ctr = session.createCriteria(Student.class);
		org.hibernate.Criteria ctr = session.createCriteria(Student.class);
		ProjectionList p = Projections.projectionList();

		p.add(Projections.property("sname"));
		p.add(Projections.property("pincode"));
		ctr.setProjection(p);
		// ctr.add(Restrictions.like("sname", "%Yuwi%"));
		List stud = ctr.list();
		for (int i = 0; i < stud.size(); i++) {
			Object[] obj = (Object[]) stud.get(i);
			System.out.println("Sname " + obj[0]);
			System.out.println("PinCide " + obj[1]);
		}
	}

}
