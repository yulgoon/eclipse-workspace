package chapter04;

public class IfEx02 {

	public static void main(String[] args) {
		
		char gender1 = 'F';
		
		if (gender1 == 'F') {
			System.out.println("여성입니다.");
		}
		
		else {
			System.out.println("남성입니다.");
		}
		
		char gender2 = 'F';
		
		if (gender2 == 'f') {				// 대/소문자 인식 주의
			System.out.println("여성입니다.");
		}
		
		else {
			System.out.println("남성입니다.");
		}
		
	}
}
