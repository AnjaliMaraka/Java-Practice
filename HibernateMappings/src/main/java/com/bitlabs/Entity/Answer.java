package com.bitlabs.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int id;
	private String answer;
	@OneToOne(mappedBy="ans")
	private Question que;
	
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
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}
	
	public Answer(int id, String answer, Question que) {
		super();
		this.id = id;
		this.answer = answer;
		this.que = que;
	}
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}
	
}
