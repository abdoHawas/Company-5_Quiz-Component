package Quiz_Classes;

public class Evaluator {
	
	private int user_id ;
	private int quiz_id ;
	private  Answer [] answers ;
	
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}
	
	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}
	
	public int getUser_id() {
		return user_id;
	}
	
	public int getQuiz_id() {
		return quiz_id;
	}
	
	public Answer[] getAnswers() {
		return answers;
	}
	
	public int calulateScore()
	{
		int score = 0;
		return score;
		
	}
}
