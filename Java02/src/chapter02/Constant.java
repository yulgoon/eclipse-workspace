package chapter02;

public class Constant {

	
	public static void main(String[] args) {
	
		
		double pi = 3.14;
			pi = 31.4;				// final�� �ƴ� ��� ������ �Ҵ� �� ���  
			System.out.println(pi);	
		
		final double PI = 3.14;
			// PI = 31.4; 			����(final�� ���� �� ó�� �Ҵ� ���� ������ �� ����)
		System.out.println(PI);
		
		
		final int MAX_NUM = 100;	// ��� ����� ���ÿ� �� �Ҵ�

		int max_Num = 100;
			max_Num = 200;			// final�� �ƴ� ��� ������ �Ҵ� �� ��� 

			final int MIN_NUM ;			// ����� ���� ���� ��,
			MIN_NUM = 0;			// ������ �� �Ҵ� 
		
			// MAX_NUM = 200; -> �Է� �� ����
			
					
		System.out.println(MAX_NUM);
		System.out.println(max_Num);
		System.out.println(MIN_NUM);

			
	}
}

