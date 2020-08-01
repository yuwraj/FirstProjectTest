package com.i91.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "QuestionTable")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(name = "QuestionName")
	private String fullQuestion;

	@OneToMany(cascade = {CascadeType.ALL, CascadeType.REMOVE})
	@JoinColumn(name = "quesId")
	@OrderColumn(name = "NoOfAns")
	private List<Answer> answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullQuestion() {
		return fullQuestion;
	}

	public void setFullQuestion(String fullQuestion) {
		this.fullQuestion = fullQuestion;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

}
