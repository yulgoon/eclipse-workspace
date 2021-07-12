package chapter04;

public class LoopEx01 {

	public static void main(String[] args) {

		// 반복문 없이 1부터 10까지 더한 값

		int num = 1;
		num += 2;		// num=num+2 -> num=3
		num += 3;		// num=num+3 -> num=6
		num += 4;		// num=num+4 -> num=10
		num += 5;		// num=num+5 -> num=15
		num += 6;		// num=num+6 -> num=21
		num += 7;		// num=num+7 -> num=28
		num += 8;		// num=num+8 -> num=36
		num += 9;		// num=num+9 -> num=45
		num += 10;		// num=num+10 -> num=55
		
		
		System.out.println("1부터 10까지의 합은 " +num+"입니다.");
	}
}
