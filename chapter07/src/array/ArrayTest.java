package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i = 0; i < num.length; i++) {	// i는 0부터 시작, i < num.length -> i <= 14
			System.out.println(num[i]);
		}
		
		System.out.println();
		System.out.println(num[0]);
		System.out.println(num[5]);
		System.out.println(num.length);
	}	
}
