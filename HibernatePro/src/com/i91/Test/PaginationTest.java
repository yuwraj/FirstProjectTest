package com.i91.Test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Student;

public class PaginationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pagination Test");
		int pageIndex = 0;
		int totalNumberOfRecords = 0;
		int numberOfRecordsPerPage = 4;
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Criteria crit = session.createCriteria(Student.class);
		crit.setFirstResult(12);
		crit.setMaxResults(numberOfRecordsPerPage);
		crit.list();
	}

}
