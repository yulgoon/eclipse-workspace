package chapter04;

public class LoopForEx01 {

	public static void main(String[] args) {
		
		int i;
		int sum;
		for (i=0, sum=0; i<10; i++) { 	// �Ǵ� (i=1, sum=0; i<=10; i++)
			sum += (i+1);				// sum = sum + ( i + 1 )
		}
		
//		(����� ������ ����) : �׷��� i=1 �������ٴ� i=0�� �� ���� ���; �迭 �ε��� �� �� 0���� ����
//		int i;
//		int sum;
//		for (i=1, sum=0; i<=10; i++) {  -> (�ʱⰪ, �ʱⰪ; ����; ������;)
//			sum += i
//		}			

		System.out.println("1���� 10������ ���� "+ sum +"�Դϴ�.");
	}
}
