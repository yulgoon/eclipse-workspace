package chapter_04;

public class Prac_p123_Q1_02 {

	public static void main(String[] args) {
		
	
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
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
			System.out.println("������ �����Դϴ�.");
			return;
		}
		System.out.println("��� ���� "+ val +"�Դϴ�.");
		
	}
}