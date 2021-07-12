package chapter_04;

public class Prac_p123_Q1_04 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '-';
		int val;
		
		switch(operator) {
		
		case '+':
		val = num1+num2;
		break;
		
		case '-':
		val = num1-num2;
		break;
		
		case '*':
		val = num1*num2;
		break;
		
		case '/':
		val = num1/num2;
		break;
		
		default:
		System.out.println("연산자 오류입니다.");
		return;
			}
		System.out.println("결과 값은 "+ val +"입니다.");
	}
	
}
