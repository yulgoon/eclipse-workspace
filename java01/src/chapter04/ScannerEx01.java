package chapter04;

// ó�� ����
// 1. Scanner ����Ʈ
// 2. Scanner ��ü ����
// 3. Scanner���� ���� ���� ������ �Ҵ�

import java.util.Scanner;	// (1��) import ��, Scanner ù ���� S�� �빮��, �ϳ��� ��ü

public class ScannerEx01 {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);	// (2��) ��/�ҹ��� ����(scanner�� ���� ����)
		
		String name = scanner.next();	// (3-1��) ���ڿ� �б� object.method
		System.out.println("�̸���"+name+", ");
		
		String city = scanner.next();	// (3-2��) ���ڿ� �б�
		System.out.println("���ô�"+city+", ");
		
		int age = scanner.nextInt();	// (3-3��) ���� �б�
		System.out.println("���̴�"+age+", ");
		
		double weight = scanner.nextDouble();	// (3-4��) �Ǽ� �б�
		System.out.println("ü����"+weight+"kg, ");
		
		boolean single = scanner.nextBoolean();	// (3-5��) ���� �б� -> boolean�� true/false�� �Ҵ�
		System.out.println("���ſ��δ� "+single+"�Դϴ�.");
		
		scanner.close();	// scanner �ݱ�
	}
}
