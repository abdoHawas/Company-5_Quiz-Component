package com.example.Quiz_Component.classes;

public class Question {
	private int question_id ;
	private String question;
	private String []choices;
	private String correct_answer ;
	
	
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	
	public void setCorrect_answer(String coorect_answr) {
		this.correct_answer = coorect_answr;
	}
	
	public int getQuestion_id() {
		return question_id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String[] getChoices() {
		return choices;
	}
	
	public String getCorrect_answer() {
		return correct_answer;
	}
}
