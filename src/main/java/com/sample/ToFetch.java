package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ToFetch {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Question qu1 =(Question) session.get(Question.class, 1);
		System.out.println(qu1.getQuestion());
		//System.out.println(qu1.getqID());
		for(Answer an:qu1.getAnswers()) {
			System.out.println(an.getAns());
		}
		
		System.out.println("---------------------------------");
		Answer ans = (Answer)session.get(Answer.class, 333);
		System.out.println(ans.getQuestion().getQuestion());
		session.close();
		factory.close();

	}

}
