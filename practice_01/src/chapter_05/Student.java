package chapter_05;

public class Student {	// Student��� �ϳ��� ��ü (public class�� ��ü : ���ϸ�� ����)
	// default, private, protected, public ��
	
	// �������(�Ӽ�)
	int studentID;
	String studentName;
	int grade;
	String address;

	
	// �޼ҵ�(���)
	public void showStudentInfo() {
		System.out.println(studentName+", "+address); 	// �̸�, �ּ� ����ϴ� �޼ҵ�
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	public static void main(String[] args) {
		
		Student studentAhn = new Student();	// ������� �޼ҵ忡 'new' �����ڸ� ���ؼ� '�ȿ���'��� �л��̸� �Ҵ�
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);			// �Ҵ��� ��� ������ ���
		System.out.println(studentAhn.getStudentName());	// getStudentName ȣ��
	}
}


