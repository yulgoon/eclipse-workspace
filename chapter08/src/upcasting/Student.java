package upcasting;

public class Student extends Person {
	String grade;
	String department;
	
	public Student (String name) {
		super(name);	// super(name) : 상위 클래스 Person 생성자의 name 매개변수를 던져줌
	}

}
