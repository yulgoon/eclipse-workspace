package chapter04;

public class LoopForContinueEx02 {

	public static void main(String[] args) {
		
		// 1���� 100���� ���� �� ¦���� �հ�
		int total = 0;
		int num;
				
		// �� total�̶�� ������ for�� �ȿ��� ������ ���� �ִ�.
		// for (int total=0, int num=1; num <=100; num++) {
		
		for (num=1; num<=100; num++) {
					
			if(num%2==1) {	// num�� 2�� ���� �������� 1�� ��,
				continue;	// num=1�� ��, if ������ True�̹Ƿ� continue ���� �� �ϰ� �Ѿ
			}
				
			total +=num;
		}
				
		System.out.println("1���� 100������ ¦���� ���� : "+total+"�Դϴ�.");
		
	}
}
