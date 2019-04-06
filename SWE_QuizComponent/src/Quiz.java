package Quiz_Classes;

public class Quiz {
	private int quiz_id ;
	private String category ;
	private String professor ;
	private int quiz_score;
	private Question []question ;
	
	
	public Quiz() {
		// TODO Auto-generated constructor stub
		quiz_id++;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public void setQuiz_score(int quiz_score) {
		this.quiz_score = quiz_score;
	}
	
	public void setQuestion(Question[] question) {
		this.question = question;
	}
	
	public int getQuiz_id() {
		return quiz_id;
	}

	public String getCategory() {
		return category;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public int getQuiz_score() {
		return quiz_score;
	}
	
	public Question[] getQuestion() {
		return question;
	}
}
