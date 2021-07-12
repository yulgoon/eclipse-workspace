package referance;

public class Student4 {
	int studentID;			// �й�
	String studentName;		// �̸�
	Subject korean;			// ���� : ������ �ڷ���(Subject Ŭ������ ����)
	Subject math;			// ���� : ������ �ڷ���(Subject Ŭ������ ����)
	
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
		System.out.println("�л� "+studentName+"�� ������ "+total+" �Դϴ�.");
	}
}
