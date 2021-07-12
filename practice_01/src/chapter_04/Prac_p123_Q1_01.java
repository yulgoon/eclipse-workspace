package chapter_04;

import java.util.Scanner;

public class Prac_p123_Q1_01 {

	public static void main(String[] args) {
		
		System.out.println("연산자(+, -, *, /)를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);	// 단축키 : 마우스 클릭해서 올리고 Ctrl + Shift + O = 자동으로 import 시켜줌
		// 객체 생성
		
		int num1 = 10;
		int num2 = 2;
		String S = scanner.next();	// 입력한 값을 String형으로 받아서 S에 대입
		char operator = S.charAt(0);
								// 문자가 1글자라서 인덱스 0
		int val;
		
		if (operator == '+') {
			val = num1 + num2;
		}
		
		else if (operator == '-') {
			val = num1 - num2;
		}
		
		else if (operator == '*') {
			val = num1 * num2;
		}
		
		else if (operator == '/') {
			val = num1 / num2;
		}
				
		else {
			val = 0;
			System.out.println("연산자 오류입니다.");
			scanner.close();
			return;
		}
		System.out.println("결과 값은 "+ val +"입니다.");
		scanner.close();		
	}
}
