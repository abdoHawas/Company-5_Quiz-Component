package com.example.Quiz_Component.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quiz_id ;
	private String category ;
	private String professor ;
	private double grade ;
	private String []question ;
	private String []correctAns;
	
	public Quiz(long quiz_id, String category, String professor) {
		super();
		this.quiz_id = quiz_id;
		this.category = category;
		this.professor = professor;
	}

	public Quiz() {}

	public Long getQuiz_id() {
		return quiz_id;
	}

	public void setQuiz_id(Long quiz_id) {
		this.quiz_id = quiz_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String[] getQuestion() {
		return question;
	}

	public void setQuestion(String[] question) {
		this.question = question;
	}

	public String[] getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String[] correctAns) {
		this.correctAns = correctAns;
	}
	
}
