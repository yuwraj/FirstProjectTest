package com.i91.relationShipTest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Answer;
import com.i91.beans.Categories;
import com.i91.beans.Products;
import com.i91.beans.Question;

public class OneToManyTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Answer ans = new Answer();
		ans.setActualAnswer("hibernate is ORM1");
		ans.setPostedBy("Raj");
		Answer ans1 = new Answer();
		ans1.setActualAnswer("hibernate better then jdbc in terms of development1");
		ans1.setPostedBy("Aaj");
		List<Answer> ansList = new ArrayList<>();
		ansList.add(ans);
		ansList.add(ans1);

		Question que = new Question();
		que.setFullQuestion("What is Hibernate1?");
		que.setAnswer(ansList);
		session.save(que);
		tx.commit();
	}

}
