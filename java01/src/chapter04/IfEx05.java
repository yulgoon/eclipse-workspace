package chapter04;

public class IfEx05 {

	public static void main(String[] args) {
		
		int score = 70;
		char grade;
		
		if (score>90) {grade='A';}

		else {grade='B';}
		
		System.out.println("����� ������ "+score+"�̰�, "+"������ "+grade+"�Դϴ�.");
		
	}
}
		// ������ ����� True or False�� ���� if���ǹ����ٴ� ���ǿ����� A?B:C�� �����ϰ� ����
		// grade=(score >= 90)?'A':'B'; ->(IfEx06 ����)

