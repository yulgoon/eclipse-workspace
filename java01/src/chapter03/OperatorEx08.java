package chapter03;

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag;				//!(����) ������ : ���� �� ����� �ݴ븦 ���
		
		flag = !(num1 > 0);			// T�̹Ƿ� F ���
		System.out.println(flag);
		
		flag = !(num2 < 0);			// F�̹Ƿ� T ���
		System.out.println(flag);
		
		flag = !(num1 > num2);		// F�̹Ƿ� T ���
		System.out.println(flag);
		
		flag = !(num1 < num2);		// T�̹Ƿ� F ���
		System.out.println(flag);
	}
}
