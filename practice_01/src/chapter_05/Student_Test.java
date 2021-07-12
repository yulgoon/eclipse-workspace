package chapter_05;
	// class 밖에 입력할 수 있는 것 : package, import

public class Student_Test {	// 클래스 내에 속성값(변수), 메소드, 생성자 작성

	// 변수 부분 : 변수 선언은 메소드 상위에서도 선언 가능 / 속성값 정의
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 메소드 부분 / main method 외부 : 선언부 / 기능 정의
	public void showStudentInfo()	{	// "void" : 호출값이 없음 "()" / return이 없는 메소드; void 넣음
		System.out.println( studentName +", "+ address );
	}	// 하위 메소드에 매개변수를 넣어서 적용 
		
	public static int add(int n1, int n2)	{	// add 함수로 2개의 input 값(호출값; n1, n2)을 받음 / n1, n2 -> num1, num2 입력해도 됨 (k1, k2 등)
					// method 작성 : "메소드명" + "('인자가 있으면 입력')" / cf) showStudentInfo()의 경우 작성할 인자가 없어서 "()"
		int result = n1 + n2;	// 정수형 int result
		return result;			// result 값을 호출
	}
	
	public static void main(String[] args) {	// "void" : 호출값이 없음 "()" / main method 내부 : 실행부

		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);	// add 함수 호출해서 각각 num1, num2 값을 넣음 / num1, num2의 값을 n1, n2에서 받음(자료형(int; 정수형)에 맞게만 잘 지정하면 됨)
		
		System.out.println(num1+"+"+num2+"="+sum+"입니다." );
		
	}
		// publick static과 public static void 메소드는 별도의 메모리를 사용
}
