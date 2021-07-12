package hiding;

public class Student {
	int sdtudentID;
	private String studentName;	// 다른 클래스에서 접근 불가
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String t) {
		studentName = t;
	}
	

	}
	


