package com.i91.relationShipTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.i91.beans.Answer;
import com.i91.beans.Question;
import com.i91.beans.oneToOnePkg.Address;

public class OneToManyDelete {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Question q = session.get(Question.class, 9);
		System.out.println(q.getFullQuestion());
		
		List<Answer> ans = q.getAnswer();
		System.out.println(ans.get(0).getActualAnswer());
		session.delete(q);

	}

}
