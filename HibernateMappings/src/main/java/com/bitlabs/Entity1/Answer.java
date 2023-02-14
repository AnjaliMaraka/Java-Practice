package com.bitlabs.Entity1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	private int id;
	private String answer;
	@ManyToOne
	private Question que;
	public Answer(int id, String answer, Question que) {
		super();
		this.id = id;
		this.answer = answer;
		this.que = que;
	}
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", que=" + que + "]";
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
