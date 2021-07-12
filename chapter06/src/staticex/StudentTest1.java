package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		/*
		 * 리터럴 데이터는 데이터 영역에 저장되어서 프로그램이 시작될 때 로드되었다가 프로그램이 종료될 때 값이 모두 없어짐ㅋ int a = 10;
		 * int b = 20; double c = 10.5; car d = 'A';
		 */
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // 초기값 출력
		// studentLee.serialNum++; // static 변수 증가

		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum); // 증가된 값 출력
		System.out.println(studentLee.serialNum); // 증가된 값 출력
	}
}
