package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		// studentLee.studentName = "이상원";
		// 멤버변수(레퍼런스)에 직접 할당
		studentLee.setStudentName("이상원");
		// Setter를 통해 할당
		
		System.out.println(studentLee.getStudentName());
		
	}
}
