package chapter02;

public class Constant {

	
	public static void main(String[] args) {
	
		
		double pi = 3.14;
			pi = 31.4;				// final이 아닌 경우 마지막 할당 값 출력  
			System.out.println(pi);	
		
		final double PI = 3.14;
			// PI = 31.4; 			에러(final로 선언 후 처음 할당 값을 변경할 수 없음)
		System.out.println(PI);
		
		
		final int MAX_NUM = 100;	// 상수 선언과 동시에 값 할당

		int max_Num = 100;
			max_Num = 200;			// final이 아닌 경우 마지막 할당 값 출력 

			final int MIN_NUM ;			// 상수를 먼저 선언 후,
			MIN_NUM = 0;			// 다음에 값 할당 
		
			// MAX_NUM = 200; -> 입력 시 오류
			
					
		System.out.println(MAX_NUM);
		System.out.println(max_Num);
		System.out.println(MIN_NUM);

			
	}
}

