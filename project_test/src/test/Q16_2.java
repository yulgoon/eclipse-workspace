package test;

import java.util.Scanner;

public class Q16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		String name = "";
		int i = 0;

		while (true) {
			System.out.println("�����̸��� �Է��ϼ���. >>");
			name = sc.next();
			if (name.equals("�׸�")) {
				break;	// while���� ������ ���������� ����
			}
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;	// ���� if���� ���������� for���� �ٽ� ����
				}
				if (i == course.length - 1) {	// course.length�� 5�̸�, i�� 0~4�����̹Ƿ� -1 
					System.out.println("���� �����Դϴ�.");
/* 
 * [i] index�� 4�� ������ ���鼭 name�� ������ üũ�ϴµ�
 * course[i].equals(name) ������ �����ϴ� ���� �� ã�Ҵٴ� ���� �Է� ���� �迭 ���� ���ٴ� ���̹Ƿ�
 * course[i]�� 4�� ���¿��� �Ʒ� if ���� ������ �ȴ�.
 * ����, 4==4�� �ǹǷ� ���ǿ� ���� �ǰ� ��� ������ "���� �����Դϴ�." ��� �� �ٽ� for������ ���ư���.
 */
				}
			}
		}
		sc.close();
	}
}
