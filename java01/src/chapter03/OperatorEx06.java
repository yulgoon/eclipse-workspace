package chapter03;

public class OperatorEx06 extends OperatorEx05 {

	public static void main(String[] args) {
		
		int num1 = 10;	// &&(논리 곱)연산자 -> 두 항 모두 True 일 때, True 출력
		int num2 = 20;
		
		boolean flag1 = num1 > 0 && num2 > 0;	// T&&T=T
		System.out.println(flag1);

		boolean flag2 = num1 > 0 && num2 < 0;	// T&&F=F
		System.out.println(flag2);
		
		boolean flag3 = num1 < 0 && num2 > 0;	// F&&T=F
		System.out.println(flag3);
		
		boolean flag4 = num1 < 0 && num2 < 0;	// F&&F=F
		System.out.println(flag4);
		
		boolean flag5 = -1 < 0 && 9.9 < 10 && num1 > 1;	// T&&T&&T=T
		System.out.println(flag5);
		
		boolean flag6 = -1 < 0 && 9.9 < 10 && num1 < 1;	//	T&&T&&F=F
		System.out.println(flag6);
		
	}
}
