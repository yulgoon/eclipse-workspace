package staticex;

public class Student {

	public static int serialNum = 1000;

	/*
	 * new Ű���带 ���ؼ� �ν��Ͻ� ���� �ÿ� �������� �����ǰ�, ������ �÷��Ϳ� ���ؼ� ���ŵ� �ݵ�� �ش��ϴ� �� �ν��Ͻ� �������� ���
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
