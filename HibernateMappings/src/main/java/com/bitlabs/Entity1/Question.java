package com.bitlabs.Entity1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int id;
	private String question;
	
	@OneToMany(mappedBy="que")
	private List<Answer> ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", ans=" + ans + "]";
	}

	public Question(int id, String question, List<Answer> ans) {
		super();
		this.id = id;
		this.question = question;
		this.ans = ans;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
