package chapter_04;

public class Prac_p123_Q3 {
	
	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for(dan=1; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				if(times>dan) break;
				System.out.println(dan+"X"+times+"="+(dan*times));
			}
			System.out.println();
		}

	}

}
