package chapter_04;

import java.util.Scanner;

public class Prac_p123_Q1_03 {
	public static void main(String[] args) {
		
		System.out.println("������(+, -, *, /)�� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);	// ����Ű : ���콺 Ŭ���ؼ� �ø��� Ctrl + Shift + O = �ڵ����� import ������
		// ��ü ����
		
		int num1 = 10;
		int num2 = 2;
		String S = scanner.next();
		char operator = S.charAt(0);	// �Է��� ���� String������ �޾Ƽ� S�� ����
								// ���ڰ� 1���ڶ� �ε��� 0
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
		
		default:
		System.out.println("������ �����Դϴ�.");
		scanner.close();
		return;
			}

		System.out.println("��� ���� "+ val +"�Դϴ�.");
		scanner.close();	
		
	}
	
}
