package chapter03;

public class OperatorEx07 {

	public static void main(String[] args) {
		
		int num1 = 10;	// ||(논리 합)연산자 -> 두 항 중 어느 하나가 True 일 때, True 출력
		int num2 = 20;	// || = Shift + \\
		
		boolean flag1 = num1 > 0 || num2 > 0;	// T||T=T
		System.out.println(flag1);
				
		boolean flag2 = num1 > 0 || num2 < 0;	// T||F=T
		System.out.println(flag2);
				
		boolean flag3 = num1 < 0 || num2 > 0;	// F||T=T
		System.out.println(flag3);
				
		boolean flag4 = num1 < 0 || num2 < 0;	// F||F=F
		System.out.println(flag4);
	
		boolean flag5 = -1 < num1 || 9.9 < num2 || num1 > num2;	// T||T||F=T
		System.out.println(flag5);
		
		boolean flag6 = -1 > num1 || 9.9 > num2 || num1 > num2;	//	F||F||F=F
		System.out.println(flag6);
	}
	
}
