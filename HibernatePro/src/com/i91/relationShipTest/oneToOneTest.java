package com.i91.relationShipTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Answer;
import com.i91.beans.Categories;
import com.i91.beans.Products;
import com.i91.beans.Question;

public class oneToOneTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Products.class).addAnnotatedClass(Categories.class)
				.addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Categories cat = new Categories();
		cat.setCategoryName("catName55");

		Products p = new Products();
		p.setCategoryId(1);
		p.setProductId(1);
		p.setProductName("Parle-G Super55");
		session.save(cat);
		System.out.println("Categories Id------------>>>> " + cat.getCategoryId());
		p.setCategoryId(cat.getCategoryId());
		session.save(p);
		tx.commit();
	}
}
