package chapter04;

public class LoopForEx03 {

	public static void main(String[] args) {

		// ������ 2��~9�� �� ��� ���
		
		int dan;
		int times;
		
		for (dan=2; dan<=9; dan++) {
			
			for (times=1; times<=9; times++) {
				
				System.out.println(dan+"X"+times+"="+(dan*times));
			}
			System.out.println();	// �ƹ� �� ���� �Է��ϸ� �� �� ����� ��� ���
		}
	}
}
