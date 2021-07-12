// [문항2]  1 ~ 100 까지 합 프로그램을 작성 하시오. 

package test;

public class Q02 {
	public static void main(String[] args) {
		int sum1 = 0;
		for (int num = 1; num <= 100; num++) {
			sum1 += num;
		}

		System.out.println(sum1);

		int num = 1;
		int sum2 = 0;
		while (num <= 100) {
			sum2 += num;
			num++;
		}
		System.out.println(sum2);
	}
}
