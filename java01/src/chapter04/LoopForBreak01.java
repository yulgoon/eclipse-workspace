package chapter04;

public class LoopForBreak01 {

	public static void main(String[] args) {
		
		int sum=0;
		int num=0;
		
		for (num=0; ;num++) {		// 조건이 무한
			sum+=num; 				// sum=sum+num
			
			if (sum>=100)
				break;				// sum이 100일 때까지 조건 반복 후 break
		}
		
		System.out.println(sum);
	}
}
