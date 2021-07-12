package chapter03;

public class OperatorEx10 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		num1 += num2;				// num1 = num1 + num2 -> 30
		System.out.println(num1);
		System.out.println(num2);
		
		num1 -= num2;				// num1 = num1 - num2 -> 10
		System.out.println(num1);
		System.out.println(num2);
		
		num1 *= 2;					// num1 = num1 * 2 -> 20
		System.out.println(num1);
			
		num1 /= 2;					// num1 = num1 / 2 -> 10
		System.out.println(num1);
		
		num1 %= 2;					// num1 = num1 % 2 -> 0
		System.out.println(num1);
		
		num1 = 15;
		num1 %= 4;
		num2 %= num1;
		System.out.println(num1);	// num1 = 15 % 4 = 3
		System.out.println(num2);	// num2 = 20 % 3 = 2
		
		boolean val1 = ((num1*num2)>5) && ((num1/num2)>0);
		System.out.println(val1);
		
		boolean val2 = ((num1*=2)>5) || ((num2*=2)>0);	// -> 논리연산자, 단락회로평가 및 복합대입연산자
		System.out.println(val2);
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
