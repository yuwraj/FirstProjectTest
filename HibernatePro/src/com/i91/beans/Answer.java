package com.i91.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dummyAnswerTable")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(name = "answerActual")
	private String actualAnswer;
	@Column(name = "postedBy")
	private String postedBy;
//This is dummy Comment from eclipse to store file in gitHub.com by Yuwi
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActualAnswer() {
		return actualAnswer;
	}

	public void setActualAnswer(String actualAnswer) {
		this.actualAnswer = actualAnswer;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

}
