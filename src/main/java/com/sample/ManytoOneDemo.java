package com.sample;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytoOneDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Question q1 = new Question();
		q1.setqID(1);
		q1.setQuestion("What is Spring");
		
		Question q2 = new Question();
		q2.setqID(2);
		q2.setQuestion("What is Java");
		
		Question q3 = new Question();
		q3.setqID(3);
		q3.setQuestion("What is Hibernate");
		
		Answer a1 = new Answer();
		a1.setaId(111);
		a1.setAns("Java is Robust");
		
		Answer a2 = new Answer();
		a2.setaId(222);
		a2.setAns("Spring is f/w");
		
		Answer a3 = new Answer();
		a3.setaId(333);
		a3.setAns("Java is Synchronized");

		Answer a4 = new Answer();
		a4.setaId(444);
		a4.setAns("Hibernate is ORM tool");
		
		Answer a5 = new Answer();
		a5.setaId(555);
		a5.setAns("Spring is used for RAD");
		
		Answer a6 = new Answer();
		a6.setaId(666);
		a6.setAns("Hibernate is Innovative Tool");
		
		List<Answer> jav = new ArrayList<>();
		jav.add(a1);
		jav.add(a3);
		
		List<Answer> hib = new ArrayList<>();
		hib.add(a4);
		hib.add(a6);
		
		List<Answer> spr = new ArrayList<>();
		spr.add(a2);
		spr.add(a5);
		
		q1.setAnswers(spr);
		q3.setAnswers(hib);
		q2.setAnswers(jav);
		a1.setQuestion(q2);
		a3.setQuestion(q2);
		a2.setQuestion(q1);
		a5.setQuestion(q1);
		a4.setQuestion(q3);
		a6.setQuestion(q3);
			
		
		session.save(q1);
		session.save(q2);
		session.save(q3);
		
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		session.save(a5);
		session.save(a6);
		
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		factory.close();

	}

}
