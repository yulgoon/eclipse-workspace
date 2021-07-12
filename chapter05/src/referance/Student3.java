package referance;

public class Student3 {
	int studentID;			// 학번
	String studentName;		// 이름
	Subject korean;			// 국어 : 참조형 자료형(Subject 클래서를 참조)
	Subject math;			// 수학 : 참조형 자료형(Subject 클래서를 참조)
	
	public Student3() {
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorea (String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
	}
	public void setMath (String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
}
