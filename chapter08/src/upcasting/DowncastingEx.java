package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {

		Person p = new Student("박장우");
		Student s;

		s = (Student) p;	// downcasting : 반드시 자료형을 명시해서 저장해야 함

		System.out.println(p.name);
		s.grade = "A";

	}
}
