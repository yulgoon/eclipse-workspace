package chapter04;

public class LoopForEx01 {

	public static void main(String[] args) {
		
		int i;
		int sum;
		for (i=0, sum=0; i<10; i++) { 	// 또는 (i=1, sum=0; i<=10; i++)
			sum += (i+1);				// sum = sum + ( i + 1 )
		}
		
//		(결과가 동일한 구문) : 그러나 i=1 구문보다는 i=0을 더 많이 사용; 배열 인덱스 할 때 0부터 시작
//		int i;
//		int sum;
//		for (i=1, sum=0; i<=10; i++) {  -> (초기값, 초기값; 조건; 증가값;)
//			sum += i
//		}			

		System.out.println("1부터 10까지의 합은 "+ sum +"입니다.");
	}
}
