package com.example.Quiz_Component.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.Quiz_Component.classes.Question;




@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quiz_id ;
	private String category ;
	private String professor ;
	private double grade ;
	private Question []question ;
	
	
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public void setQuiz_id(Long quiz_id) {
		this.quiz_id = quiz_id;
	}
	public Quiz(long quiz_id, String category, String professor) {
		super();
		this.quiz_id = quiz_id;
		this.category = category;
		this.professor = professor;
	}
	public Quiz() {}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public void setQuestion(Question[] question) {
		this.question = question;
	}
	
	public long getQuiz_id() {
		return quiz_id;
	}

	public String getCategory() {
		return category;
	}
	
	public String getProfessor() {
		return professor;
	}	
	
	public Question[] getQuestion() {
		return question;
	}
}
