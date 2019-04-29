package com.example.Quiz_Component.classes;

import com.example.Quiz_Component.Entities.Quiz;
import com.example.Quiz_Component.Entities.User;

public class Evaluator {
	
	private User user;
	private Quiz quiz;
	private  String [] answers ;
	
	public Evaluator(long user_id , long quiz_id ,String[] strings)
	{
		answers = strings;
		user = new User();
		user.setUser_id(user_id);
		user.setQuiz_id(quiz_id);
		user.setAnswer(answers);
		quiz = new Quiz();
		quiz.setQuiz_id(quiz_id);
	}
	
	public User getUser() {
		return user;
	}
	public Quiz getQuiz() {
		return quiz;
	}
	public String[] getAnswers() {
		return answers;
	}
	
	public User calulateScore()
	{
		int score = 0;
		String[]correctAnswers ;
		correctAnswers = quiz.getCorrectAns();
		for (int i = 0; i < answers.length; i++) {
			if(answers[i].equals(correctAnswers[i]))
			{
				score++;
			}
		}
		user.setScore(score);
		return user;
	}
}

