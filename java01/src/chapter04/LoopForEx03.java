package chapter04;

public class LoopForEx03 {

	public static void main(String[] args) {

		// 구구단 2단~9단 매 계산 출력
		
		int dan;
		int times;
		
		for (dan=2; dan<=9; dan++) {
			
			for (times=1; times<=9; times++) {
				
				System.out.println(dan+"X"+times+"="+(dan*times));
			}
			System.out.println();	// 아무 값 없이 입력하면 한 줄 띄우라는 출력 명령
		}
	}
}
