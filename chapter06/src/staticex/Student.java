package staticex;

public class Student {

	public static int serialNum = 1000;

	/*
	 * new 키워드를 통해서 인스턴스 생성 시에 힙영역에 생성되고, 가비지 컬렉터에 의해서 제거됨 반드시 해당하는 그 인스턴스 내에서만 사용
	 */
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	/*
	 * public String getStudentName() { return studentName; }
	 * 
	 * public void setStudentName(String name) { studentName = name; }
	 */

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
		// studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
