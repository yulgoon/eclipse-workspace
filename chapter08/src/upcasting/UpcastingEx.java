package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("박장우");

		p = s; // upcasting : 하위클래스 s의 메모리 영역 중 상위클래스 p부분만 사용
//		Person p = new Student("박장우"); -> 한줄로 바로 입력도 가능
		
		System.out.println(p.name);

		/*
		 * p.grade="A"; p.department="HR"; -> 컴파일 오류
		 

		p.name = "홍길동";
		p.ID = "ID";

		s.grade = "A";
		s.department = "HR";
		s.ID = "ID";
		s.name = "김똘똘";
		*/
	}
}
