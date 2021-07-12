package chapter04;
public class LoopDoWhileEx01 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;		// sum = sum + num
			num++;
		}
		
		while (num <= 10);
			
		System.out.println("1부터 10까지의 합은 " +sum+"입니다.");
		System.out.println("sum : "+sum);
		System.out.println("num : "+num);
	}
}
