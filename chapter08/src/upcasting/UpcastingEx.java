package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("�����");

		p = s; // upcasting : ����Ŭ���� s�� �޸� ���� �� ����Ŭ���� p�κи� ���
//		Person p = new Student("�����"); -> ���ٷ� �ٷ� �Էµ� ����
		
		System.out.println(p.name);

		/*
		 * p.grade="A"; p.department="HR"; -> ������ ����
		 

		p.name = "ȫ�浿";
		p.ID = "ID";

		s.grade = "A";
		s.department = "HR";
		s.ID = "ID";
		s.name = "��ʶ�";
		*/
	}
}
