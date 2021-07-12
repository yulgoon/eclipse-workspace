package chapter04;

public class LoopForContinueEx02 {

	public static void main(String[] args) {
		
		// 1부터 100까지 숫자 중 짝수의 합계
		int total = 0;
		int num;
				
		// 위 total이라는 변수를 for문 안에서 선언할 수도 있다.
		// for (int total=0, int num=1; num <=100; num++) {
		
		for (num=1; num<=100; num++) {
					
			if(num%2==1) {	// num를 2로 나눈 나머지가 1일 때,
				continue;	// num=1일 때, if 조건이 True이므로 continue 실행 안 하고 넘어감
			}
				
			total +=num;
		}
				
		System.out.println("1부터 100까지의 짝수의 합은 : "+total+"입니다.");
		
	}
}
