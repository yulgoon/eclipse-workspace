package chapter04;

public class LoopForContinueEx01 {

	public static void main(String[] args) {
		
		// 1부터 100까지 숫자 중 홀수의 합계
		int total = 0;
		int num;
		
		for (num=1; num<=100; num++) {
			
			if(num%2==0) {	// num를 2로 나눈 나머지가 0일 때,
				continue;	// num=1일 때, 조건이 False이므로 continue 연산하여 if 반복
			}
			
			total +=num;
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 : "+total+"입니다.");
		
	}
}
