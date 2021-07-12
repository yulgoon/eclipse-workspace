package chapter_04;

public class Prac_p123_Q2 {

	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for (dan=2; dan<=9; dan++) {	// continue문을 사용하지 않으면 dan = dan+2로 가능
			
			if (dan%2==1)
			continue;
			
			for (times=1; times<=9; times++) {
				System.out.println(dan+"X"+times+"="+(dan*times));
			}
			System.out.println();
		}
	}
}