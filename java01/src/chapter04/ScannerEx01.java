package chapter04;

// 처리 순서
// 1. Scanner 임포트
// 2. Scanner 객체 생성
// 3. Scanner에서 받은 값을 변수에 할당

import java.util.Scanner;	// (1번) import 시, Scanner 첫 글자 S는 대문자, 하나의 객체

public class ScannerEx01 {

	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);	// (2번) 대/소문자 유의(scanner만 변경 가능)
		
		String name = scanner.next();	// (3-1번) 문자열 읽기 object.method
		System.out.println("이름은"+name+", ");
		
		String city = scanner.next();	// (3-2번) 문자열 읽기
		System.out.println("도시는"+city+", ");
		
		int age = scanner.nextInt();	// (3-3번) 정수 읽기
		System.out.println("나이는"+age+", ");
		
		double weight = scanner.nextDouble();	// (3-4번) 실수 읽기
		System.out.println("체중은"+weight+"kg, ");
		
		boolean single = scanner.nextBoolean();	// (3-5번) 논리값 읽기 -> boolean은 true/false로 할당
		System.out.println("독신여부는 "+single+"입니다.");
		
		scanner.close();	// scanner 닫기
	}
}
