package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {

		Person p = new Student("�����");
		Student s;

		s = (Student) p;	// downcasting : �ݵ�� �ڷ����� ����ؼ� �����ؾ� ��

		System.out.println(p.name);
		s.grade = "A";

	}
}
