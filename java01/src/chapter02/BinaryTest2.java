package chapter02;

public class BinaryTest2 {

	public static void main(String[] args) {

		int num1 = 0B00000000000000000000000000000101; // ��� 5
		int num2 = 0B10000000000000000000000000000101; // ���� -2147483643
		int num3 = 0B11111111111111111111111111111010; // ���� -6
		int num4 = 0B11111111111111111111111111111011; // ���� -5
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		
		
	}

}
