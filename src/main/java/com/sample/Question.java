package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int qID;
	private String question;
	@OneToMany(mappedBy = "question")
	private List<Answer> answers;

	public int getqID() {
		return qID;
	}
	public void setqID(int qID) {
		this.qID = qID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String Question) {
		this.question = Question;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
		public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Question(int qID, String Question,List<Answer> answers) {
			super();
			this.qID = qID;
			this.question = Question;
			this.answers = answers;
		}
		
}
