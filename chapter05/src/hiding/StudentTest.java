package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "�̻��";
		// �������(���۷���)�� ���� �Ҵ�
		studentLee.setStudentName("�̻��");
		// Setter�� ���� �Ҵ�
		
		System.out.println(studentLee.getStudentName());
		
	}
}
