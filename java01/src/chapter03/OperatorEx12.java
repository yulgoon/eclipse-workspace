package chapter03;

public class OperatorEx12 {

	public static void main(String[] args) {
		
		int num1 = 10;					// 00000000 00000000 00000000 00001010
		int num2 = 5;					// 00000000 00000000 00000000 00000101
		
		int result1 = ~num1;			// 11111111 11111111 11111111 11110101 -> -11
		int num3 = ~0B11111111111111111111111111110101;
		
		System.out.println(result1);
		System.out.println(num3);
		
		int result2 = num1 & num2;		// 0000
		System.out.println(result2);
		
		int result3 = num1 | num2;		// 1111
		System.out.println(result3);
		
		int result4 = num1 ^ num2;		// 1111
		System.out.println(result4);
		
		int result5 = num1 ^ (num2+3);	// 1010 ^ (0101+0011=1000) = 0010
		System.out.println(result5);
		
	}
}
