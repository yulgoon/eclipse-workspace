package chapter_05;

public class Student {	// Student라는 하나의 객체 (public class의 객체 : 파일명과 동일)
	// default, private, protected, public 등
	
	// 멤버변수(속성)
	int studentID;
	String studentName;
	int grade;
	String address;

	
	// 메소드(기능)
	public void showStudentInfo() {
		System.out.println(studentName+", "+address); 	// 이름, 주소 출력하는 메소드
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	public static void main(String[] args) {
		
		Student studentAhn = new Student();	// 만들어진 메소드에 'new' 연산자를 통해서 '안연수'라는 학생이름 할당
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);			// 할당한 멤버 변수를 출력
		System.out.println(studentAhn.getStudentName());	// getStudentName 호출
	}
}


