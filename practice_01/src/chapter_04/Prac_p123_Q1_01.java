package chapter_04;

import java.util.Scanner;

public class Prac_p123_Q1_01 {

	public static void main(String[] args) {
		
		System.out.println("������(+, -, *, /)�� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);	// ����Ű : ���콺 Ŭ���ؼ� �ø��� Ctrl + Shift + O = �ڵ����� import ������
		// ��ü ����
		
		int num1 = 10;
		int num2 = 2;
		String S = scanner.next();	// �Է��� ���� String������ �޾Ƽ� S�� ����
		char operator = S.charAt(0);
								// ���ڰ� 1���ڶ� �ε��� 0
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
			System.out.println("������ �����Դϴ�.");
			scanner.close();
			return;
		}
		System.out.println("��� ���� "+ val +"�Դϴ�.");
		scanner.close();		
	}
}
