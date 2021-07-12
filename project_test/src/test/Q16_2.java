package test;

import java.util.Scanner;

public class Q16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		String name = "";
		int i = 0;

		while (true) {
			System.out.println("과목이름을 입력하세요. >>");
			name = sc.next();
			if (name.equals("그만")) {
				break;	// while문을 완전히 빠져나가서 종료
			}
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;	// 내부 if문만 빠져나가서 for문을 다시 만남
				}
				if (i == course.length - 1) {	// course.length는 5이며, i는 0~4까지이므로 -1 
					System.out.println("없는 과목입니다.");
/* 
 * [i] index가 4일 때까지 돌면서 name과 같은지 체크하는데
 * course[i].equals(name) 조건을 만족하는 값을 못 찾았다는 말은 입력 값이 배열 값에 없다는 뜻이므로
 * course[i]가 4인 상태에서 아래 if 문을 만나게 된다.
 * 따라서, 4==4가 되므로 조건에 참이 되고 출력 값으로 "없는 과목입니다." 출력 후 다시 for문으로 돌아간다.
 */
				}
			}
		}
		sc.close();
	}
}
