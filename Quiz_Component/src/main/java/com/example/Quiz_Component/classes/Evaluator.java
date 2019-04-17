package com.example.Quiz_Component.classes;

import com.example.Quiz_Component.Entities.Quiz;
import com.example.Quiz_Component.Entities.User;

public class Evaluator {
	
	private User user;
	private Quiz quiz;
	private  Answer [] answers ;
	
	public Evaluator(long user_id , long quiz_id ,Answer []arr )
	{
		user = new User();
		user.setUser_id(user_id);
		user.setQuiz_id(quiz_id);
		quiz = new Quiz();
		quiz.setQuiz_id(quiz_id);
	}
	
	public User getUser() {
		return user;
	}
	public Quiz getQuiz() {
		return quiz;
	}
	public Answer[] getAnswers() {
		return answers;
	}
	
	public void calulateScore()
	{
		int score = 0;
		Question []Arr ;
		Arr = quiz.getQuestion();
		for (int i = 0; i < answers.length; i++) {
			if(answers[i].getAnswer().equals(Arr[i].getCorrect_answer()))
			{
				score++;
			}
		}
		user.setScore(score);
	}
}

