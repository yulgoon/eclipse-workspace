package chapter04;

public class IfEx02 {

	public static void main(String[] args) {
		
		char gender1 = 'F';
		
		if (gender1 == 'F') {
			System.out.println("�����Դϴ�.");
		}
		
		else {
			System.out.println("�����Դϴ�.");
		}
		
		char gender2 = 'F';
		
		if (gender2 == 'f') {				// ��/�ҹ��� �ν� ����
			System.out.println("�����Դϴ�.");
		}
		
		else {
			System.out.println("�����Դϴ�.");
		}
		
	}
}
