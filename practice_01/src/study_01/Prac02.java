package study_01;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int time = scanner.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time+"�ʴ� ");
		System.out.println(hour+"�ð�, ");
		System.out.println(minute+"��, ");
		System.out.println(second+"���Դϴ�.");
		
		scanner.close();
		
	}
}

