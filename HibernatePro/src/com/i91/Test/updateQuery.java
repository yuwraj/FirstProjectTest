package com.i91.Test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class updateQuery {

	public static void main(String[] args) {
		Session session = HibernateUtil.beginConnection();
		Query qur = session.createQuery("UPDATE Student set pincode = :pinc, state= :state where sid = :sid");
		qur.setParameter("pinc", 222222);
		qur.setParameter("state", 4);
		qur.setParameter("sid", 2);
		Transaction txn = session.beginTransaction();
		qur.executeUpdate();
		txn.commit();
	}

}
