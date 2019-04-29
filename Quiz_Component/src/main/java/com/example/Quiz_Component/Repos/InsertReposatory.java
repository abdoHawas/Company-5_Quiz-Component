//package com.example.Quiz_Component.Repos;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.example.Quiz_Component.Entities.Quiz;
//import com.example.Quiz_Component.Entities.User;
//
//@Repository
//public class InsertReposatory {
//	
//	@PersistenceContext
//	private EntityManager userEntityMan ;
//	
//	@PersistenceContext
//	private EntityManager quizEntityMan ;
//	
//	@Transactional
//	public void insertUser(User user) {
//		userEntityMan.createNativeQuery("INSERT INTO user(user_id , score , quiz_id , answer) VALUES (? , ? , ? , ?)")
//		.setParameter(0, user.getUser_id())
//		.setParameter(1, user.getScore())
//		.setParameter(2, user.getQuiz_id())
//		.setParameter(3, user.getAnswer())
//		.executeUpdate();
//	
//	}
//	@Transactional
//	public void insertQuiz(Quiz quiz) {
//		quizEntityMan.createNativeQuery("INSERT INTO quiz(quiz_id , category , professor , grade , question) VALUES (? , ? , ? , ? , ?)")
//		.setParameter(0, quiz.getQuiz_id())
//		.setParameter(1, quiz.getCategory())
//		.setParameter(2, quiz.getProfessor())
//		.setParameter(3, quiz.getGrade())
//		.setParameter(4, quiz.getQuestion())
//		.executeUpdate();
//	}
//
//}
