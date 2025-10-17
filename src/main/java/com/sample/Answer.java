package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int aId;
	private String ans;
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question qestion) {
		this.question = qestion;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int aId, String ans, Question qestion) {
		super();
		this.aId = aId;
		this.ans = ans;
		this.question = qestion;
	}
	
}
