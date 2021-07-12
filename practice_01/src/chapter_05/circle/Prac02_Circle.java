package chapter_05.circle;

public class Prac02_Circle {

	// 변수(속성 정의)
	int radius;		// 원의 반지름 지정
	String name;	// 원의 이름 지정
	
	// 생성자(실행부가 아무것도 없는 경우 기본 생성자)
	public Prac02_Circle()	{}	// Prac02_Circle이라는 class의 기본 생성자(; class명과 동일한 이름의 메소드)
								// 기본 생성자; input 매개변수 및 실행부 등 아무 것도 없는 생성자, 생략이 가능
	
	public double getArea() {	// getArea를 호출하면 return 부분을 반환 / 반복되는 메소드(함수, 계산)를 지정해두고 호출해서 사용
		return 3.14 * radius * radius;
	}
	
}
