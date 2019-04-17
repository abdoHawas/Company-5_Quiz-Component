package com.example.Quiz_Component.classes;

public class Answer {
	
	private int quiz_id ;
	private int question_id ;
	private int answer_id ;
	private String answer;
	
	
	
	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}
	
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getQuiz_id() {
		return quiz_id;
	}
	
	public int getQuestion_id() {
		return question_id;
	}
	
	public int getAnswer_id() {
		return answer_id;
	}
	
	public String getAnswer() {
		return answer;
	}
}
