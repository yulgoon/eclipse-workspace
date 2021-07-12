package chapter_03;
public class Test_Class01 {
	public static void main(String[] args) {

		int num1 = 10;				// 0B00000000000000000000000000001010 = 10(dec)
		System.out.println(num1);
		
		num1 <<= 2;					// 0B00000000000000000000000000101000 = 40(dec)
		System.out.println(num1);
		
		int num2 = 10;				// num2 = 0B00000000000000000000000000001010
		num2 = ~num2;				// ~num2 = 0B11111111111111111111111111110101
		System.out.println(num2);
		
		int num3 = num1 + ~num2;	// num1 = 40, num2 = 10 (num2=10 -> num2=-11 -> num2=10)
		System.out.println(num3);
		
		int num4 = 0B11111111111111111111111111110101;
		System.out.println(num4);
		
		char result1 = ((num3+num4) < 40) ? 'T' : 'F';	//num3=50, num4=-11 -> num3+num4=(50+(-11))=39
		System.out.println(result1);
		
		int num5 = 0B00000000000000000000000000001111;	// 15(dec)
		num5 >>= 2;	// 0B00000000000000000000000000000011 = 3(dec)
		System.out.println(num5);
		
		int num6 = 0B00000000000000000000000000001111;
		num6 = ~num6;	// 0B11111111111111111111111111110000
		num6 >>= 2;		// 0B11111111111111111111111111111100
		System.out.println(num6);
		// 음수의 비트 수를 오른쪽으로 두 칸 밀면 밀린 만큼 1로 채움 		
		
		int num7 = 0B11111111111111111111111111110000;	// -16
		System.out.println(num7);
		
		int num8 = 0B11111111111111111111111111111100;	// -4
		System.out.println(num8);
		
		
	}
}

