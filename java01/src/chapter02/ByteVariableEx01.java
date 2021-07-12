package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		
		byte num;	// byte : 1byte (-2^7 ~ 2^7-1) -> -1인 이유는 0을 처리하기 때문
		num = -128;
		
		byte num2;
		num2 = 127;

		
		short num3 = -32768;	// short : 2bytes (-2^15 ~ 2^15-1)
		short num4 = 32767;		
		
		int num5 = -2147483648;
		int num6 = 2147483647;
		
		long num7 = -9223372036854775808L;
		long num8 = 9223372036854775807L;
				
		System.out.println(num);
		System.out.println(num2);	
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		
		
		
	}
	
	
	
}
