package referance;

public class Student4 {
	int studentID;			// 학번
	String studentName;		// 이름
	Subject korean;			// 국어 : 참조형 자료형(Subject 클래서를 참조)
	Subject math;			// 수학 : 참조형 자료형(Subject 클래서를 참조)
	
	public Student4(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
	public void showStudentInfo() {
		int total = korean.getScorePoint()+math.getScorePoint();
		System.out.println("학생 "+studentName+"의 총점은 "+total+" 입니다.");
	}
}
