package referance;

public class Subject {
	String subjectName;	// 과목명
	int scorePoint;		// 점수
	
	public void setKorean(String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public void setMath (String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
	
}
