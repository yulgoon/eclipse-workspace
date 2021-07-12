package chapter03;

public class OperatorEx13 {

	public static void main(String[] args) {
		
		int num1 = 0b00000101;	// 5
		
		System.out.println(num1<<2);	// 0001 0100 -> 5*(2^2)=20
		System.out.println(num1<<3);	// 0010 1000 -> 5*(2^3)=40
		System.out.println(num1<<4);	// 0101 0000 -> 5*(2^4)=80
		System.out.println(num1>>1);	// 0000 0010 -> 5/(2^1)=2
		System.out.println(num1>>2);	// 0000 0001 -> 5/(2^2)=1
		System.out.println(num1>>>2);	// 0000 0001 -> 5/(2^2)=1
		
		System.out.println(num1);		// 0000 0101
		
		num1 = num1 << 2;				// 0001 0100
		System.out.println(num1);

		int num2 = 15;					
		System.out.println(num2);		// 0B00000000000000000000000000001111
		System.out.println(~num2);		// 0B11111111111111111111111111110000
		System.out.println(~num2<<2);	// 0B11111111111111111111111111000000
		System.out.println(~num2>>2);	// 0B11111111111111111111111111111100
		System.out.println(~num2>>>2);	// 0B00111111111111111111111111111100
	}
}
