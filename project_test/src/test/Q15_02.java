package test;

public class Q15_02 {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			System.out.printf("i = %d", i);
			int tmp = i;

			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
					System.out.print("¦");
			} while ((tmp /= 10) != 0);
			System.out.println();
		}
	} // ----main end
}
