package chapter04;

public class LoopForContinueEx01 {

	public static void main(String[] args) {
		
		// 1���� 100���� ���� �� Ȧ���� �հ�
		int total = 0;
		int num;
		
		for (num=1; num<=100; num++) {
			
			if(num%2==0) {	// num�� 2�� ���� �������� 0�� ��,
				continue;	// num=1�� ��, ������ False�̹Ƿ� continue �����Ͽ� if �ݺ�
			}
			
			total +=num;
		}
		
		System.out.println("1���� 100������ Ȧ���� ���� : "+total+"�Դϴ�.");
		
	}
}
