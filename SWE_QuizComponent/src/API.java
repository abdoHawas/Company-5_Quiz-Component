package Quiz_Classes;

import java.util.ArrayList;

public class API {

	private ArrayList<Quiz> allQuizes  ;
	private Answer[] answer ;
	private Evaluator evl ;
	
	public API() {
		
		allQuizes = new ArrayList<Quiz>();
	}
	
	
	public void addQuiz(Quiz quiz)
	{
		allQuizes.add(quiz);
	}
	
	public void sendQuizes()
	{
		
	}
	
	public void getAnswers()
	{
		
	}
	
	public int getUser_id()
	{
		
		int user_id = 0;
		return user_id ;
	}
	
	public int getQuiz_id()
	{
		
		int quiz_id = 0;
		return quiz_id ;
	}
}
