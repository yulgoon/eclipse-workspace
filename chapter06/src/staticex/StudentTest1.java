package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		/*
		 * ���ͷ� �����ʹ� ������ ������ ����Ǿ ���α׷��� ���۵� �� �ε�Ǿ��ٰ� ���α׷��� ����� �� ���� ��� �������� int a = 10;
		 * int b = 20; double c = 10.5; car d = 'A';
		 */
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNum); // �ʱⰪ ���
		// studentLee.serialNum++; // static ���� ����

		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNum); // ������ �� ���
		System.out.println(studentLee.serialNum); // ������ �� ���
	}
}
