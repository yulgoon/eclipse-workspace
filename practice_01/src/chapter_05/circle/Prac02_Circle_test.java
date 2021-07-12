package chapter_05.circle;

import chapter_05.circle.Prac02_Circle;

public class Prac02_Circle_test {

	public static void main(String[] args) {
		
		Prac02_Circle pizza;
		pizza = new Prac02_Circle();	// Circle 객체를 생성, referance 이름 pizza / 선언을 먼저 하고 할당
		pizza.radius = 10;				// 피자의 반지름을 10으로 설정 ("referance" + ".")
		pizza.name = "자바 피자";			// 피자의 이름을 설정
		double area = pizza.getArea();	// 피자의 면적 (getArea()의 return부 호출해서 area 변수에 할당)
		System.out.println(pizza.name+"의 면적은 : "+area+"입니다.");
		
		Prac02_Circle doughnut = new Prac02_Circle();	// Circle 객체를 생성, referance 이름 doughnut / 선언을 하면서 할당
								// 이 때에 new 다음에 오는 "Prac02_Circle()"는 생성자
		doughnut.radius = 2;
		doughnut.name = "자바 도넛";
		area = doughnut.getArea();
		System.out.println(doughnut.name+"의 면적은 : "+area+"입니다.");
				
		Prac02_Circle 단팥빵 = new Prac02_Circle();
		단팥빵.radius = 3;
		단팥빵.name = "자바 앙꼬빵";
		area = 단팥빵.getArea();
		System.out.println(단팥빵.name+"의 면적은 : "+area+"입니다.");
		
		
		
	}
}
