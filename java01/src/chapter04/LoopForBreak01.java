package chapter04;

public class LoopForBreak01 {

	public static void main(String[] args) {
		
		int sum=0;
		int num=0;
		
		for (num=0; ;num++) {		// ������ ����
			sum+=num; 				// sum=sum+num
			
			if (sum>=100)
				break;				// sum�� 100�� ������ ���� �ݺ� �� break
		}
		
		System.out.println(sum);
	}
}
