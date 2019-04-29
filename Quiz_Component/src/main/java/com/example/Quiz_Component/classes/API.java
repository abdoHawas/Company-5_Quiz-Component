//package com.example.Quiz_Component.classes;
//
//import com.example.Quiz_Component.Entities.Quiz;
//import com.example.Quiz_Component.Entities.User;
//import com.example.Quiz_Component.Repos.InsertReposatory;
//
//public class API {
//		private User user;
//		private Quiz quiz;
//		private Evaluator evl;
//		private InsertReposatory insertObj;
//		
//		
//		public User getUser() {
//			return user;
//		}
//
//		public void setUser(User user) {
//			this.user = user;
//		}
//
//		public Quiz getQuiz() {
//			return quiz;
//		}
//
//		public void setQuiz(Quiz quiz) {
//			this.quiz = quiz;
//		}
//
//		public void getUserFromUI()
//		{
//			User UIUser =  new User();
//			/*** make API request to get the user_id and the quiz id and the Answers from the UI and 
//		  	 	 calculate the score and save to the data base **/
//			evl = new Evaluator(UIUser.getUser_id(), UIUser.getQuiz_id(), UIUser.getAnswer());
//			evl.calulateScore();
//			this.user = UIUser;
//			insertObj.insertUser(user);
//		}
//		
//		public void getQuizFromUI()
//		{
//			Quiz UIQuiz =  new Quiz();
//			/// make a API request to get the quiz from the UI and save to the data base ***/
//			
//			this.quiz = UIQuiz;
//			insertObj.insertQuiz(quiz);
//		}
//		
//
//}
