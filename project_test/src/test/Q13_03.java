package test;

import java.util.Scanner;

public class Q13_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���. >>");

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		int cash = sc.nextInt();

		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d ��¥��: %d�� \n", unit[i], cash / unit[i]);
			cash = cash - (cash / unit[i]) * unit[i];
		}
		sc.close();
	}

}
